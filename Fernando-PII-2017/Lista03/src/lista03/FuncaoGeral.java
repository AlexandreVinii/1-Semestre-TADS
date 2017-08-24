/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class FuncaoGeral {
    
      static  Scanner console = new Scanner (System.in);
    
    public static double entradaDouble ()
    {
        
        System.out.println("Digite um valor: ");
        double num = console.nextDouble();
        return num;
        
    }
    
    static int entradaInt()
    {
        System.out.print("Digite um Numero: ");
        int num = console.nextInt();
        return num;
    }
    
    
    static int somatoria(int N) {
         int soma = 0;
        for (int i = N; i >= 1; i--) {
          
        soma += i;
        }
        return soma;
        
}

    
    static int MenorValor (int menor){
        
    int num = console.nextInt();
    
    if (num < menor)
    {
        menor = num;
    }
        
    return menor;
        
    }
    
    
    static int ValidarPositivo(int num){
        while(num < 0)
        {
            System.out.print("Numero menor que ZERO'0' Inválido (Tente Novamente): ");
              num = console.nextInt();
        }
        return num;
        
    }
    
    static int Fatorial (int N)
    {
        int soma = 1;
        for (int i = 1; i <= N; i++){
            
        soma *= i;
        }
        return soma;
    }
            
    
}
