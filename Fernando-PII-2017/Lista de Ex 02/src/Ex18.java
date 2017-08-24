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
public class Ex18 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n1 = 0, n2 = 1, rs, num;

        //ENTRADA
        System.out.print("Digite um número: ");
        num = console.nextInt();

        //PROCESSAMENTO
        rs = (n1 + n2);

        if (num < 46) {
            for (int i = 0; i < num; i++) {
                System.out.print(n1+" ");
                n1 = n2;
                n2 = rs;
                rs = n1 + n2;
            }
            //SAÍDA
            System.out.print("...\n");
        } else {
            System.out.println("(numero inválido) Maior que 46");
        }
    }

}