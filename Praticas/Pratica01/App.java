package br.edu.ifpb;

import java.util.Scanner;
import java.lang.*;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double d, x1, x2, y1, y2;
        Scanner v1 = new Scanner(System.in);
        Scanner v2 = new Scanner(System.in);
        Scanner v3 = new Scanner(System.in);
        Scanner v4 = new Scanner(System.in);

        System.out.println("Digite o valor de X1: ");
        System.out.println("Digite o valor de X2: ");
        System.out.println("Digite o valor de Y1: ");
        System.out.println("Digite o valor de Y2: ");

        x1 = v1.nextDouble();
        x2 = v2.nextDouble();
        y1 = v3.nextDouble();
        y2 = v4.nextDouble();

        d = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))) ;

        System.out.println("Distância entre pontos: "+ d);

    }
}
