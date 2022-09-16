package com.desarrollo.questions.dto.mapper;

import com.desarrollo.questions.dto.QuestionDto;
import com.desarrollo.questions.models.Questions;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-15T22:20:40-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.16 (Ubuntu)"
)
@Component
public class QuestionMapperImpl implements QuestionMapper {

    @Override
    public QuestionDto modelToDto(Questions questions) {
        if ( questions == null ) {
            return null;
        }

        QuestionDto questionDto = new QuestionDto();

        return questionDto;
    }

    @Override
    public Questions dtoToModel(QuestionDto questionDto) {
        if ( questionDto == null ) {
            return null;
        }

        Questions questions = new Questions();

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
