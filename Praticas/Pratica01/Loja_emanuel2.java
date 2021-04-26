package br.edu.ifpb;

import java.util.Scanner;
import java.lang.*;

public class Loja_emanuel2 {
    public static void main(String args[]){
        double valor_total;
        int qnt;
        double valor_pao;

        Scanner quantidade = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        System.out.println("Digite a quantidade: ");
        System.out.println("Digite o valor do pão: ");
        qnt = quantidade.nextInt();
        valor_pao = Double.parseDouble(v.nextLine());

        valor_total = qnt * valor_pao;

        System.out.println("O valor da quantidade é: R$  "+ valor_total);
    }
}
