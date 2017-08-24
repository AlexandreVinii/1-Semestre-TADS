/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.ex.pkg02;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex11{

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        //ENTRADAS
        System.out.print("S = 1 - 1/2 + 1/3 - 1/4 + 1/5 - ... + 1/N \n\n um número para substituir N: ");
        int num = ler.nextInt();

        //PROCESSAMENTO
        double resultado = 1;
        for (double i = 1; i < num; i++) {
            if (i % 2 == 0) {
                resultado = resultado + (1 / (i + 1));
            } else {
                resultado = resultado - (1 / (i + 1));
            }
        }
        
        //SAÍDA
        System.out.println(resultado);

    }

}