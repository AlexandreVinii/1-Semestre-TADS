/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula21.pkg03pi;

import java.util.Scanner;

/**
 *
 * @author alexandre.vfsilva
 */
public class Aula2103Pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner console = new Scanner (System.in);
      
      
      //ENTRADAS
        System.out.println("X1: ");
        double x1 = console.nextDouble();
       
        System.out.println("X2: ");
        double x2 = console.nextDouble();
        
        System.out.println("C: ");
        double c = console.nextDouble();
        
        
      //PROCESSAMETOS
        double soma = x1 + x2;
        double produto = x1 * x2;
        double a = c / produto;        
        double b = - (a * soma);
        
      //SAÍDA
        System.out.printf("\n %.2fX² + %.2fX + %.2f = 0\n", a, b, c);
                
          
     
// TODO code application logic here
    }
    
}
