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
public class Ex03 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        
        int num, maior = 0;

        //ENTRADA
        System.out.print("Digite os Numeros: ");

        //PROCESSAMENTO
        for (int i = 0; i < 10; i++) {
            num = console.nextInt();
            if (num > maior) {
                maior = num;
            }
        }
        //SAÍDA
        System.out.printf("Maior Número Encontrado: %d \n", maior);
    }

}