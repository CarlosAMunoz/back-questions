package com.desarrollo.questions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollo.questions.dto.ResponseDto;
import com.desarrollo.questions.services.IAutorService;

@RestController
@RequestMapping("api/autors")
public class AutorController {
    
    private ResponseDto responseDto;


    public AutorController(){
        responseDto = new ResponseDto();
        responseDto.setMensaje("Proceso realizado correctamente");

    }

    @Autowired IAutorService autorService;



    @GetMapping(path = "all")
    public ResponseEntity<ResponseDto> findAll(){
        responseDto.setCodigoRespuesta(HttpStatus.OK.value());
        responseDto.setData(autorService.ListarAutores());

        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }


    @GetMapping(path = "autor/{Id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable("Id")Long Id){

        responseDto.setCodigoRespuesta(HttpStatus.OK.value());
        responseDto.setData(autorService.ListarAutorById(Id));
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);

    }


}
