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
public class Ex17 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
       
        int num;
        boolean dv;

        //ENTRADA
        System.out.print("Digite um número: ");
        num = console.nextInt();

        //PROCESSAMENTO
        for (int i = 1; i <= num; i++) {
            dv = (num % i == 0);
            if (dv) {
        //SAÍDA
                System.out.print(i+" É divisor de " +num+ " \n");
            }
        }
    }

}