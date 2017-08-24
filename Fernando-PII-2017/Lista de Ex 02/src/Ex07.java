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
public class Ex07 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        
        int i = 1;
        
        while (i <= 200) {
           i = i + 1 ;
            if (i % 7 == 0) {
              System.out.println(i); 
        }
           
        }
        
        
    }
    
}
