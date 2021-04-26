package br.edu.ifpb;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Loja_emanuel {
    public static void main(String args[]){
        double valor_total;
        int qnt;
        qnt = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
        valor_total = 1.99 * qnt;
        JOptionPane.showMessageDialog(null,"O valor da quantidade é: R$ "+valor_total);
    }
}