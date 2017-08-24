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
public class Ex21 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int num, sum;

        //ENTRADA
        System.out.print("Digite o número perfeito... ou não: ");
        num = console.nextInt();

        //PROCESSAMENTO
        sum = 0;
        for (int i = 1; i < num; i++) {
            boolean divisor = (num % i == 0);
            if (divisor) {
                sum = sum + i;
            }

        }

        //SAÍDA
        if (sum == num) {
            System.out.printf("Perfeito!\nA soma dos divisores inteiros é: %d\nQue é igual ao número digitado: %d\n", sum, num);
        } else {
            System.out.printf("Não é perfeito!\nA soma dos divisores inteiros é: %d\nQue é diferente do número digitado: %d\n", sum, num);
        }
    }

}