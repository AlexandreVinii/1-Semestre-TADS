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
public class Ex13 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double rs = 0,n1,den;

        //ENTRADA
        System.out.print("Digite um número: ");
        int num = console.nextInt();

          //PROCESSAMENTO
        for (double i = 0; i < num; i++) {
        n1 = 1;
        den = 1;
        
            n1 *= (i + 1);
            den *= (2 * (i + 1)) - 1;
            rs += (n1 / den);
        }
        //SAÍDA
        System.out.println(rs);
    }

}