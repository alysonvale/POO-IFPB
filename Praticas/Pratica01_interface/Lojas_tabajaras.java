package br.edu.ifpb;


import java.util.Scanner;
import java.lang.*;
import javax.swing.JOptionPane;


public class Lojas_tabajaras {
    public static void main(String args[]){
        float valor_total, qnt, valor_produto, qnt_itens;
        float dinheiro, troco;

        valor_total = 0;


        qnt = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de produtos para passar: "));

        int i = 0;
        while (i < qnt){

            qnt_itens = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de produtos: "));
            valor_produto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
            valor_total += (valor_produto * qnt_itens);
            i++;

        }
        dinheiro = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para Troco: "));
        troco = dinheiro - valor_total;

        JOptionPane.showMessageDialog(null,"Total: R$ "+valor_total + " Dinheiro: R$ "+dinheiro+ " Troco: R$ "+troco);






    }
}