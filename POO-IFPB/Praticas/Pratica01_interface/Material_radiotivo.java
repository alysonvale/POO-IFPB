package br.edu.ifpb;

import java.util.Scanner;
import java.lang.*;
import javax.swing.JOptionPane;

public class Material_radiotivo {
    public static void main(String args[]){
        int massa_ini, massa_final, segundos, hora, minutos;
        hora = 0;
        minutos = 0;

        segundos = 0;
        massa_final = 0;

        massa_ini = Integer.parseInt(JOptionPane.showInputDialog("Digite a massa Inicial em Gramas:"));

        while (massa_ini > 5){
            int e = 0;
            for ( e = 0; e < 350; e++){
                segundos ++;

            }
            massa_final = massa_ini/2;
            massa_ini -= massa_final;


        }

        int horas_seg = 3600, seg = 0;
        hora = (segundos/ horas_seg);
        minutos = (segundos - (horas_seg * hora)) / 60;
        seg = (segundos - (horas_seg * hora) - (minutos * 60));

        JOptionPane.showMessageDialog(null,"A massa final: "+massa_final+ " Segundos: "+segundos+" "+hora+": "+minutos+": "+seg);



    }
}