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
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner console = new Scanner(System.in);

        double a, b, produto;

        System.out.println("Escreva um Número: ");
        a = console.nextDouble();

        System.out.println("Multiplicado por: ");
        b = console.nextDouble();

        produto = a * b;

        System.out.printf("\n Produto será: %.0f\n", produto);

    }

}
