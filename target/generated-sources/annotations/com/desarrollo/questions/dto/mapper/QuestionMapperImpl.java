package com.desarrollo.questions.dto.mapper;

import com.desarrollo.questions.dto.QuestionDto;
import com.desarrollo.questions.models.Questions;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-10T22:47:33-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public QuestionDto modelToDto(Questions questions) {
        if ( questions == null ) {
            return null;
        }

        QuestionDto questionDto = new QuestionDto();

        questionDto.setAnswer_One( questions.getAnswer_One() );
        questionDto.setAnswer_Three( questions.getAnswer_Three() );
        questionDto.setAnswer_Two( questions.getAnswer_Two() );
        questionDto.setAutor( questions.getAutor() );
        questionDto.setCategoria( questions.getCategoria() );
        questionDto.setCorrect_Answer( questions.getCorrect_Answer() );
        questionDto.setId_Question( questions.getId_Question() );
        questionDto.setQuestion( questions.getQuestion() );

        return questionDto;
    }

    @Override
    public Questions dtoToModel(QuestionDto questionDto) {
        if ( questionDto == null ) {
            return null;
        }

        Questions questions = new Questions();

        questions.setAnswer_One( questionDto.getAnswer_One() );
        questions.setAnswer_Three( questionDto.getAnswer_Three() );
        questions.setAnswer_Two( questionDto.getAnswer_Two() );
        questions.setAutor( questionDto.getAutor() );
        questions.setCategoria( questionDto.getCategoria() );
        questions.setCorrect_Answer( questionDto.getCorrect_Answer() );
        questions.setId_Question( questionDto.getId_Question() );
        questions.setQuestion( questionDto.getQuestion() );

        return questions;
    }

    @Override
    public List<QuestionDto> modelToDtos(List<Questions> questions) {
        if ( questions == null ) {
            return null;
        }

        List<QuestionDto> list = new ArrayList<QuestionDto>( questions.size() );
        for ( Questions questions1 : questions ) {
            list.add( modelToDto( questions1 ) );
        }

        return list;
    }
}
