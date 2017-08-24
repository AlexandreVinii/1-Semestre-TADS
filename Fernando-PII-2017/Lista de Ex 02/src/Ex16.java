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
public class Ex16 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //ENTRADA
        System.out.print("Digite a quantidade de números que você usará: ");
        int qt = console.nextInt();
        String par1, pos1;
        boolean par, pos;    

        System.out.println("Digite os respectivos números: ");

        //PROCESSAMENTO        
        do {
            int num = console.nextInt();

            par = (num % 2 == 0);
            if (par) {
                par1 = "Par";
            } else {
                par1 = "Impar";
            }

            pos = (num > 0);
            if (pos) {
                pos1 = "Positivo";
            } else {
                pos1 = "Negativo";
            }

        //SAÍDA
            boolean zero = (num == 0);
            if (zero) {
                System.out.println("NULO");
            } else {
                System.out.printf("O %d é %s e %s.\n", num, par1, pos1);
            }
            qt--;

        } while (qt > 0);

    }

}