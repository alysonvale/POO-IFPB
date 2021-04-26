package com.gmail.alysonmatheus331.banco;

public class QuantiaNegativaException  extends RuntimeException{
    public QuantiaNegativaException(String Msg)
    {
        super(Msg);
    }

    public QuantiaNegativaException()
    {
        this("Quantia Negativa");
    }
}
