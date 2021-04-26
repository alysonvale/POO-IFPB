package br.edu.ifpb;

import java.lang.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Valor_S {
    public static void main(String args[]){
        double s,valor_anterior, valor_anterior2, n;
        double v1 = 1, v2 = 3;
        s = 0;

        n = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N:"));

        for (int i = 1; i <= n; i++){
            s += (v1/v2);
            v1 += v1 + v1;
            v2 += v2 + v2;

        }
        JOptionPane.showMessageDialog(null,"O valor de S: "+s);



    }
}
