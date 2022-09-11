package com.desarrollo.questions.services;

import java.util.List;

import com.desarrollo.questions.dto.QuestionDto;

public interface IQuestionService {
    
    List<QuestionDto> listarPreguntas();
    QuestionDto listarPreguntaById(Long Id);
    List<QuestionDto> listarPreguntaByCategoria(Long Id);

}
