package br.edu.ifpb;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.*;

public class Fatorial {
    public static void main(String args[]){
        int num_f, fatorial;


        fatorial = 1;

        num_f = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do Fatorial:"));

        for (int i = 1; i < num_f; i++){


            fatorial += fatorial *i;

        }
        JOptionPane.showMessageDialog(null,"O Fatorial é: "+fatorial);


    }
}