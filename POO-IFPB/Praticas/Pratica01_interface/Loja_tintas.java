package br.edu.ifpb;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.*;


public class Loja_tintas {
    public static void main(String args[]){
        float qnt_latas_total, metros_totais, preco_total, resto_metros;
        int qnt_latas_t = 0;


        metros_totais = Float.parseFloat(JOptionPane.showInputDialog("Digite quantos metros quadrados devem ser pintados?: "));

        qnt_latas_total = metros_totais/18;
        resto_metros = metros_totais%18;

        qnt_latas_t = (int) qnt_latas_total;

        if (resto_metros == 0){
            preco_total = qnt_latas_t * 80;
            JOptionPane.showMessageDialog(null,"Quantidade de latas: "+qnt_latas_t + ". Preço total: R$ "+ preco_total);

        }

        if (resto_metros > 0){
            qnt_latas_t += 1;
            preco_total = qnt_latas_t * 80;
            JOptionPane.showMessageDialog(null,"Quantidade de latas: "+qnt_latas_t+ "Preço total: R$ "+ preco_total);

        }





    }
}