package br.edu.ifpb;

import java.util.Scanner;
import java.lang.*;

public class Valor_de_H {
    public static void main(String args[]){
        float termo_h, n;
        termo_h = 0;


        Scanner qnt = new Scanner(System.in);

        System.out.println("Digite o valor de N termos: ");

        n = Float.parseFloat(qnt.nextLine());

        if (n == 0){
            termo_h = 1;
            System.out.println("O valor do termo H: "+termo_h);
        }

        if (n >= 1){
            for (int i = 1; i <= n; i++){

                termo_h += termo_h + (1/i);

            }

            System.out.println("O valor do termo H: "+termo_h);
        }




    }
}
