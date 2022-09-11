package com.desarrollo.questions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desarrollo.questions.dto.ResponseDto;
import com.desarrollo.questions.services.IQuestionService;

@RestController
@RequestMapping("api/questions")
public class QuestionController {
    
    private ResponseDto responseDto;


    public QuestionController(){
        responseDto = new ResponseDto();
        responseDto.setMensaje("Proceso realizado correctamente");
    }


    @Autowired IQuestionService questionService;



    @GetMapping(path = "all")
    public ResponseEntity<ResponseDto> findAll(){
        responseDto.setCodigoRespuesta(HttpStatus.OK.value());
        responseDto.setData(questionService.listarPreguntas());
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
    
    

    @GetMapping(path = "question/{id}")
    public ResponseEntity<ResponseDto> findById(@PathVariable("id") long id){
        responseDto.setCodigoRespuesta(HttpStatus.OK.value());
        responseDto.setData(questionService.listarPreguntaById(id));
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }


        
    @GetMapping(path = "categoria/{id}")
    public ResponseEntity<ResponseDto> findByCategoria(@PathVariable("id") long id){
        responseDto.setCodigoRespuesta(HttpStatus.OK.value());
        responseDto.setData(questionService.listarPreguntaByCategoria(id));
        return new ResponseEntity<ResponseDto>(responseDto, HttpStatus.OK);
    }
    
}
