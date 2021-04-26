package br.edu.ifpb;

import java.util.Scanner;
import java.lang.*;
import javax.swing.JOptionPane;

public class Primo {
    public static void main(String args[]){
        int n, cont = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));


        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                cont ++;
            }
        }

        if (cont == 2){
            JOptionPane.showMessageDialog(null,"É primo o número: "+n);

        }

        if (cont != 2){
            JOptionPane.showMessageDialog(null,"Não é primo o número: "+n);
        }

    }
}