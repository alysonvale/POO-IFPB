package com.gmail.alysonmatheus331.banco;

public class SaldoInvalidoException extends RuntimeException {
    public SaldoInvalidoException(String Msg){
        super(Msg);
    }

    public SaldoInvalidoException()
    {
        this("Saldo Invalido");
    }
}
