/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ex.pii;

import java.util.Scanner;

/**
 *
 * @author alexandre.vfsilva
 */
public class Ex03 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);
        
        double a, b, res;
        
        System.out.println("Numero x²: ");
        a = console.nextDouble();
        
        System.out.println("Numero Y²: ");
        b = console.nextDouble();
        
        res = (a * a) + (b * b);
        
        System.out.printf("Resultado %.0f \n", res);
        
               
                
                
    }
    
}
