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
public class Exerc03{
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        double a, b, c;
        
        System.out.println("Grau de Obesidade");
        System.out.printf("\nPeso: ");
        b = console.nextDouble();
        System.out.printf("\nAltura: ");
        a = console.nextDouble();
        
        c = b / Math.pow(a, 2);
        
        if (c < 26) {
            System.out.printf("\nNormal.\n");
        } else if (c >= 26 && c < 30) {
            System.out.printf("\nObeso.\n");
        } else {
            System.out.printf("\nObeso Mórbido.\n");
        }
            
    }
    
}