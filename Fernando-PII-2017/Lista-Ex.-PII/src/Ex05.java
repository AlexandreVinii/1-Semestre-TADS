/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.ex.pii;

import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);
        int a, rsa;
        
        System.out.println("Escreva Valor de L: "); 
       a = console.nextInt();
       
       rsa = (int) Math.pow(a, 2);
        System.out.printf("Área do quadrado é: %dm²\n",rsa);
    }
    
}
