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
public class Ex20 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int operacao;
        double des, saq, sad;  

        //ENTRADA
        System.out.print("Saldo Inicial: ");
        sad = console.nextDouble();

        //PROCESSAMENTO

        do {
            System.out.printf("\nOk.\nSeu saldo é de R$%.2f\n", sad);
            System.out.print("Escolha a operação desejada\n( 1 para Depósito; 2 para Saque; 3 para Concluir ou Sair)\nOperação: ");
            operacao = console.nextInt();
        
            
            if (operacao == 1) {                
                System.out.print("Depósito\nValor: R$");
                des = console.nextDouble();
                sad += des;
        
                
            } else if (operacao == 2) {                
                System.out.print("Saque\nValor: R$");
                saq = console.nextDouble();
                sad -= saq;
                
        
            } else if (operacao > 3 || operacao < 0) {                
                System.out.println("Operação Invalida...");
            }
        } while ((operacao < 3) && (operacao > 0));

        //Conclusão do processo e Saída-------------------------
        System.out.printf("Saldo Final: R$%.2f\n", sad);
        if (sad == 0) {
            System.out.println("CONTA ZERADA");
        } else if (sad < 0) {
            System.out.println("CONTA ESTOURADA");
        } else {
            System.out.println("CONTA PREFERENCIAL");
        }
    }

}