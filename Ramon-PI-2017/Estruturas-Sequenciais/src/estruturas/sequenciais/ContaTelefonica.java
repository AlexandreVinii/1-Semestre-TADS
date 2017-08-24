/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.sequenciais;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class ContaTelefonica {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double ass, liga1, liga2, liga3, total; 
        double min;
        
        //ENTRADA
        System.out.print("Digite o valor da sua assinatura: ");
        ass = console.nextDouble();
        
        System.out.print(" Digite os minutos gastos este mês: ");
        min = console.nextDouble();
        
        //PROCESSAMENTO
        liga1 = 0.09 * min;
        liga2 = 0.26 * min;
        liga3 = 0.86 * min;
        total = liga1 + liga2 + liga3 + ass;
        
        //SAÍDA
        System.out.printf("Valor total de ligações Locais (R$ 0,09/min): %.2f \n", liga1);
        System.out.printf("Valor total de ligações (DDD)Interurbanas (R$ 0,26/min): %.2f \n", liga2);
        System.out.printf("Valor total de ligações (DDI)Internacionais (R$ 0,86/min): %.2f \n", liga3);
        System.out.printf("Valor total da fatura Telefônica: %.2f \n", total);
        
    }
}
