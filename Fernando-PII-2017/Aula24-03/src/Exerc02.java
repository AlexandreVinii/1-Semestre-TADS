/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapii24.pkg03;

import java.util.Scanner;

/**
 *
 * @author alexandre.vfsilva
 */
public class Exerc02{
    
    public static void main(String[] args) {
       
        Scanner console = new Scanner(System.in);
        
        int a, b;
        
        System.out.print("Escreva um números: ");
        a = console.nextInt();
        
        System.out.print("Escreva o segundo número: ");
        b = console.nextInt();
       
        
        if (a % b == 0) {
            System.out.printf("\nA divisão de %d por %d é exata.", a, b);
        } else {
            System.out.printf("\nA divisão entre %d e %d Não é exata.", a, b);
        }
    }
    
}