package com.desarrollo.questions.dto.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.desarrollo.questions.dto.QuestionDto;
import com.desarrollo.questions.models.Questions;

@Mapper(componentModel = "spring")
public interface QuestionMapper {
    
    QuestionMapper MAPPER = Mappers.getMapper(QuestionMapper.class);


    QuestionDto modelToDto(Questions questions);

    @InheritInverseConfiguration
    Questions dtoToModel(QuestionDto questionDto);

    List<QuestionDto> modelToDtos(List<Questions> questions);


}
