package br.edu.ifpb;

import java.util.Scanner;
import java.lang.*;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        double d, x1, x2, y1, y2;
        d = 0;

        x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X1:"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X2:"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y1:"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y1:"));

        d = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))) ;

        JOptionPane.showMessageDialog(null,"O número "+d);

    }
}