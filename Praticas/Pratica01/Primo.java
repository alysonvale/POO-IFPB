package br.edu.ifpb;

import java.util.Scanner;
import java.lang.*;

public class Primo {
    public static void main(String args[]){
        int n, cont = 0;

        Scanner num = new Scanner(System.in);
        System.out.println("Digite o valor de N: ");
        n = num.nextInt();

        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                cont ++;
            }
        }

        if (cont == 2){
            System.out.println("É primo o número: "+ n);
        }

        if (cont != 2){
            System.out.println("Não é primo o número: "+ n);
        }

    }
}
