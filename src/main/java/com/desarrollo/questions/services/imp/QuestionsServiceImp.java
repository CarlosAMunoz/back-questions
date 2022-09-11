package com.desarrollo.questions.services.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollo.questions.dto.QuestionDto;
import com.desarrollo.questions.dto.mapper.QuestionMapper;
import com.desarrollo.questions.models.Questions;
import com.desarrollo.questions.repository.QuestionRepository;
import com.desarrollo.questions.services.IQuestionService;


@Service
public class QuestionsServiceImp implements IQuestionService{

    @Autowired QuestionRepository questionRepository;
    @Autowired QuestionMapper questionMapper;

    @Override
    public List<QuestionDto> listarPreguntas() {

        List<QuestionDto> questionDto = new ArrayList<>();
        List<Questions> questions = (List<Questions>) questionRepository.findAll();
        questionDto = questionMapper.modelToDtos(questions);
        return questionDto;

    }

    @Override
    public QuestionDto listarPreguntaById(Long Id) {

        QuestionDto questionDto = new QuestionDto();

        if(questionRepository.findById(Id).isPresent())
        {
            questionDto = questionMapper.modelToDto(questionRepository.findById(Id).get());
        }
        else
        {   
            return questionDto; //PENDIENTE
        }
        return questionDto;

    }

    @Override
    public List<QuestionDto> listarPreguntaByCategoria(Long Id) {

        List<QuestionDto> questionDtos = new ArrayList<>();
        List<Questions> questions = (List<Questions>) questionRepository.findByCategoria(Id);
        questionDtos = questionMapper.modelToDtos(questions);
        return questionDtos;

    }
    
}
