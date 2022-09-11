package com.desarrollo.questions.excepciones;

public class NoDataFoundException extends RuntimeException{
    public NoDataFoundException()
    {
        super("No existen registros");
    }
}
