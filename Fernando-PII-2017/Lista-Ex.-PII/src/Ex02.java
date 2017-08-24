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
public class Ex02 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double a, b, pot;

        System.out.println("Base");
        a = console.nextDouble();

        System.out.println("Expoente");
        b = console.nextDouble();

        pot = Math.pow(a, b);

        System.out.printf("Resultado da Potência: %.0f\n", pot);

    }

}
