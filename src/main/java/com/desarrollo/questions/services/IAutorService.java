package com.desarrollo.questions.services;

import java.util.List;

import com.desarrollo.questions.dto.AutorDTO;

public interface IAutorService {

    List<AutorDTO> ListarAutores();
    AutorDTO ListarAutorById(Long Id);

}
