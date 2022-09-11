package com.desarrollo.questions.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDto {

    private Long Id_Question;

    private String Question;
    private String Answer_One;
    private String Answer_Two;
    private String Answer_Three;
    private String Correct_Answer;

    private Long Categoria;

    private String Autor;

}
