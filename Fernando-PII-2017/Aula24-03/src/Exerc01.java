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
public class Exerc01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);

        int a, resultado;

        System.out.print("Digite um número: ");
        a = console.nextInt();

        if (a > 100) {
            resultado = a + 150;
            System.out.printf("\n %d mais 150 é %d\n", a, resultado);
        } else {
            System.out.println("O número é menor que 100.");
           }
    }
}

