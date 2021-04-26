package br.edu.ifpb;


import java.util.Scanner;
import java.lang.*;

public class Fatorial {
    public static void main(String args[]){
        int num_f, fatorial;


        fatorial = 1;

        Scanner n = new Scanner(System.in);

        System.out.println("Digite o Fatorial: ");

        num_f = n.nextInt();

        for (int i = 1; i < num_f; i++){


            fatorial += fatorial *i;

        }
        System.out.println("O valor do Fatorial é: "+fatorial);


    }
}
