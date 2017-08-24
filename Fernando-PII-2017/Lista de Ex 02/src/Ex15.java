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
public class Ex15 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double mp;
        int num;

        //ENTRADA
        System.out.print("Digite um número: ");
        num = console.nextInt();
        
        //PROCESSAMENTO
        mp = 1;
        if (num > 0) {
            for (double i = 0; i < num; i++) {
                mp = mp * (num - i);
            }
            
            //SAÍDA
            System.out.println(mp);
        } else {
            System.out.println("Número <= (MENOR OU IGUAL) a ZERO.");            
        }

    }
}