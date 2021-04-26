package br.edu.ifpb;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.*;

public class Loja_emanuel2 {
    public static void main(String args[]){
        double valor_total;
        int qnt;
        double valor_pao;

        qnt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade:"));
        valor_pao = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do pão:"));
        /*
        Operacoes
         */
        valor_total = qnt * valor_pao;

        JOptionPane.showMessageDialog(null,"O Total da compra é: R$ "+ valor_total);
    }
}