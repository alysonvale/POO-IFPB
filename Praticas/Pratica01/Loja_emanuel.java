package br.edu.ifpb;

import java.util.Scanner;

public class Loja_emanuel {
    public static void main(String args[]){
        double valor_total;
        int qnt;

        Scanner quantidade = new Scanner(System.in);

        System.out.println("Digite a quantidade: ");

        qnt = quantidade.nextInt();

        valor_total = 1.99 * qnt;

        System.out.println("O valor da quantidade é: R$  "+ valor_total);
    }
}
