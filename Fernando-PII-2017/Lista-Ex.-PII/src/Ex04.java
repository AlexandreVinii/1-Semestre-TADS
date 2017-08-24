/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ex.pii;

import java.util.Scanner;

/**
 *
 * @author ALEXANDRE
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner console = new Scanner(System.in);

        int a, b, a1, b1;

        System.out.println("Escreva os numeros");
        a = console.nextInt() +1;
        
        System.out.println("e");
        b = console.nextInt() +1;

        System.out.printf("Os Números respectivos são: %d e %d",a ,b);
       
        
        
    }

}
