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
public class Ex12 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double sum = 0,n1,den;
        int num;

        //ENTRADA
        System.out.print("Digite N: ");
        num = console.nextInt();

        //PROCESSAMENTO
        for (double i = 0; i < num; i++) {
            n1 = (i + 1);
            den = (num - i);
            
            sum += (n1 / den);
        }
        
        //SAÍDA
        System.out.println(sum);
    }

}