package com.desarrollo.questions.dto.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.desarrollo.questions.dto.AutorDTO;
import com.desarrollo.questions.models.Autor;

@Mapper(componentModel = "spring")
public interface AutorMapper {

    AutorMapper MAPPER = Mappers.getMapper(AutorMapper.class);

    
    AutorDTO modelToDto(Autor autor);

    @InheritInverseConfiguration
    Autor dtoToModel(AutorDTO autorDTO);

    List<AutorDTO> modelToDtos(List<Autor> autors);

}
 