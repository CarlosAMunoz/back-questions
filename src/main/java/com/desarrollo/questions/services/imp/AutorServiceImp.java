package com.desarrollo.questions.services.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desarrollo.questions.dto.AutorDTO;
import com.desarrollo.questions.dto.mapper.AutorMapper;
import com.desarrollo.questions.models.Autor;
import com.desarrollo.questions.repository.AutorRepository;
import com.desarrollo.questions.services.IAutorService;


@Service
public class AutorServiceImp implements IAutorService{


            
    @Autowired AutorRepository autorRepository;
    @Autowired AutorMapper autorMapper;

    @Override
    public List<AutorDTO> ListarAutores() {
        List<AutorDTO> autorDTOs = new ArrayList<>();

        List<Autor> autors = (List<Autor>) autorRepository.findAll();
        autorDTOs = autorMapper.modelToDtos(autors);
        return autorDTOs;

    }

    @Override
    public AutorDTO ListarAutorById(Long Id) {

        AutorDTO autorDTO = new AutorDTO();

        if(autorRepository.findById(Id).isPresent()){
            Autor autor = autorRepository.findById(Id).get();
            autorDTO = autorMapper.modelToDto(autor);
        }else{
            return autorDTO;
        }

        return autorDTO;

    }
    
}
