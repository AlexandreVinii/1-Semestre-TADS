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
public class Ex06 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        int A, B, C, areatr, areac, areat, areaq, arear, perimetro;
        
        System.out.println("Digite os Respectivos Valores: ");
               
        A = console.nextInt();
        System.out.printf("A: %d\n",A);
        
        B = console.nextInt();
        System.out.printf("B: %d\n",B);
        
        C = console.nextInt();
        System.out.printf("C: %d\n",C);
        
        areatr = (A * B)/2;
        System.out.printf("Área do Triângulo Retângulo: %dm²",areatr);
    }
}
