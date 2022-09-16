package com.desarrollo.questions.dto.mapper;

import com.desarrollo.questions.dto.AutorDTO;
import com.desarrollo.questions.models.Autor;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-15T22:30:08-0500",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220719-0747, environment: Java 17.0.4 (Eclipse Adoptium)"
)
@Component
public class AutorMapperImpl implements AutorMapper {

    @Override
    public AutorDTO modelToDto(Autor autor) {
        if ( autor == null ) {
            return null;
        }

        AutorDTO autorDTO = new AutorDTO();

        return autorDTO;
    }

    @Override
    public Autor dtoToModel(AutorDTO autorDTO) {
        if ( autorDTO == null ) {
            return null;
        }

        Autor autor = new Autor();

        return autor;
    }

    @Override
    public List<AutorDTO> modelToDtos(List<Autor> autors) {
        if ( autors == null ) {
            return null;
        }

        List<AutorDTO> list = new ArrayList<AutorDTO>( autors.size() );
        for ( Autor autor : autors ) {
            list.add( modelToDto( autor ) );
        }

        return list;
    }
}
