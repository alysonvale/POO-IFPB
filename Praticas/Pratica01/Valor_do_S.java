package br.edu.ifpb;


import java.lang.*;
import java.util.Scanner;

public class Valor_do_S {
    public static void main(String args[]){
        double s,valor_anterior, valor_anterior2, n;
        double v1 = 1, v2 = 3;
        s = 0;

        Scanner qnt = new Scanner(System.in);

        System.out.println("Digite o valor N: ");

        n = Double.parseDouble(qnt.nextLine());

        for (int i = 1; i <= n; i++){
            s += (v1/v2);
            v1 += v1 + v1;
            v2 += v2 + v2;

        }
        System.out.printf("O valor de S: %.2f", s);


    }
}
