/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author alexandre.vfsilva
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double a, b, c, r1, r2, delta;

        System.out.println("Bhaskara");
        System.out.println("\n Escreva os Valores de A, B, e C: \n");

        a = ler.nextDouble();

        b = ler.nextDouble();

        c = ler.nextDouble();

        delta = Math.pow(b, 2) + (- 4 * a * c);

        if (delta <= 0) {
            System.out.println("Delta não existe ");
        } else if (delta > 0) {
            r1 = (-b + Math.sqrt(delta)) / 2;

            r2 = (+b + Math.sqrt(delta)) / 2;

            System.out.printf("\n Valores De X; \n x1 = %.2f \n x2 = %.2f \n", r1, r2);

        }
    }
// TODO code application logic here
}
