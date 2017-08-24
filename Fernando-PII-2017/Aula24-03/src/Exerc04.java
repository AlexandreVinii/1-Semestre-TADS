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
public class Exerc04 {
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        double a, b;
        
        System.out.println("----Conta de Luz----");
        System.out.printf("\nQuantos KWh? ");
        a = console.nextDouble();
        
        if (a < 150) {
            b = a * 0.2;
            System.out.printf("\nValor consumido é de R$%.2f\n",b);
        } else if (a >= 150 && a < 500){
            b = a * 0.25;
            System.out.printf("\nValor consumido é de R$%.2f\n",b);
        } else if (a >= 500) {
            b = a * 0.3;
            System.out.printf("\nValor consumido é de R$%.2f\n",b);
        } else {
            System.out.printf("\nValor consumido é de R$11,90\n");
        }
    }
    
}