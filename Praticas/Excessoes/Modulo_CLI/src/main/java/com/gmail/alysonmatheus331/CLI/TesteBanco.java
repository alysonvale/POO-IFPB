package com.gmail.alysonmatheus331.CLI;


import com.gmail.alysonmatheus331.banco.Agencia;
import com.gmail.alysonmatheus331.banco.Conta;
import com.gmail.alysonmatheus331.banco.ContaCorrente;
import com.gmail.alysonmatheus331.banco.ContaPoupança;

public class TesteBanco {

    public static void main(String[] args) {

        Agencia agencia639 = new Agencia(639, "Rua Maria Ribeiro Machado, 253");

        Conta a = new ContaCorrente(1002031, "A", 55.000);
        Conta junior = new ContaCorrente(1002032, "Junior", 55.000);
        Conta marcos = new ContaCorrente(1002033, "Marcos", 55.000);
        Conta copiaDaniel = new ContaCorrente(1002031, "A Copia", 55.000);
        Conta CopiaValePoupanca = new ContaPoupança(1002031, "Copia Poupança de A", 55.000);
        agencia639.addConta(a);
        agencia639.addConta(junior);
        agencia639.addConta(marcos);
        agencia639.addConta(copiaDaniel);
        agencia639.addConta(CopiaValePoupanca);


        System.out.println(agencia639);
        System.out.println(agencia639.listar_contas());
        System.out.println(agencia639.getEndereço());


    }


}
