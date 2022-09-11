package com.desarrollo.questions.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "TBL_Questions")
public class Questions {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Long Id_Question;

    private String Question;
    private String Answer_One;
    private String Answer_Two;
    private String Answer_Three;
    private String Correct_Answer;

    private Long Categoria;

    private String Autor;
}
