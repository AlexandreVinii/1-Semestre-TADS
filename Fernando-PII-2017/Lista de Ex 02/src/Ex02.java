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
public class Ex02 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int i = 1, soma = 0, num;
        
        System.out.print("Digite um numero: ");
        num = console.nextInt();
        
        while (i <= num) {
            soma = soma + i;
            i++;
            System.out.println(soma);
        }
    }
}
