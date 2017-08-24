/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSwitch;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//Variáveis        
        double a1, a2, soma, sub, x, divisao;
        String op;

//Entradas
        System.out.print("Escreva primeiro número: ");
        a1 = console.nextDouble();
        System.out.print("Escreva segundo número: ");
        a2 = console.nextDouble();
        System.out.print("Operações ( + , - , * , /): ");
        op = console.next();
        
        op = op.trim();
//Processos e Saídas        
        switch (op) {
            case "+":
                soma = a1 + a2;
                System.out.printf("\nSoma: %.2f\n", soma);
                break;
            case "-":
                sub = a1 - a2;
                System.out.printf("\nSubtração: %.2f\n", sub);
                break;
            case "*":
                x = a1 * a2;
                System.out.printf("\nMultiplicação: %.2f\n", x);
                break;
            case "/":
                divisao = a1 / a2;
                System.out.printf("\nDivisão: %.2f\n", divisao);
                break;
            default:
                System.out.println("\nOperação Inválida.\n");
        }

    }

}