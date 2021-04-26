package br.edu.ifpb;

import java.util.Scanner;
import java.lang.*;
import javax.swing.JOptionPane;

public class Valor_H {
    public static void main(String args[]){
        float termo_h, n;
        termo_h = 0;

        n = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de N termos:"));

        if (n == 0){
            termo_h = 1;
            JOptionPane.showMessageDialog(null,"O valor do termo H: "+termo_h);

        }

        if (n >= 1){
            for (int i = 1; i <= n; i++){

                termo_h += termo_h + (1/i);

            }
            JOptionPane.showMessageDialog(null,"O valor do termo H: "+termo_h);

        }




    }
}
