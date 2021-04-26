package com.gmail.alysonmatheus331.banco;

public class EntradaInválidaException extends RuntimeException{
    public EntradaInválidaException(String msg){
        super(msg);
    }

    public EntradaInválidaException(){
        this("Entrada Inválida!");
    }

}