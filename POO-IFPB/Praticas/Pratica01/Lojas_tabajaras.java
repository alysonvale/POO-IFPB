package br.edu.ifpb;


import java.util.Scanner;
import java.lang.*;


public class Lojas_tabajaras {
    public static void main(String args[]){
        float valor_total, qnt, valor_produto, qnt_itens;
        float dinheiro, troco;

        valor_total = 0;

        Scanner n = new Scanner(System.in);

        System.out.println("Digite a quantidade de produtos: ");

        qnt = Float.parseFloat(n.nextLine());

        int i = 0;
        while (i < qnt){
            Scanner n2 = new Scanner(System.in);
            System.out.println("Digite a quantidade de itens: ");
            qnt_itens = Float.parseFloat(n2.nextLine());
            Scanner valor = new Scanner(System.in);
            System.out.println("Digite o valor do produto: ");
            valor_produto = Float.parseFloat(valor.nextLine());
            valor_total += (valor_produto * qnt_itens);
            i++;

        }
        Scanner din = new Scanner(System.in);
        System.out.println("Digite o Dinheiro para Troco: ");
        dinheiro = Float.parseFloat(din.nextLine());
        troco = dinheiro - valor_total;

        System.out.println("Total: R$ "+valor_total);
        System.out.println("Diheiro: R$ " +dinheiro);
        System.out.println("Troco: R$ " +troco);




    }
}
