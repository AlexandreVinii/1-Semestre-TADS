/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

import java.util.Random;

/**
 *
 * @author Alexandre
 */
public class Prova3 {
    
    static int ProdImpar (int [] V){
        int produto =1;
        for (int i = 0; i < V.length; i++){
            if(i % 2 == 1){
                produto *= V[i];
                System.out.printf("Indice Impar V[%d] %d \n",i,V[i]);
            }
        }
        System.out.println("Produto "+produto);
        return produto;
    }
    
    static int SomaPar (int [] V){
        int soma =0;
        for (int i = 0; i < V.length; i++){
            if(i % 2 == 0){
                soma += V[i];
                System.out.printf("Indice Par V[%d] %d \n",i,V[i]);
            }
        }
        System.out.println("Soma "+soma);
        return soma;
    }
    
    static double divisao (double produto, double soma){
       double divisao = (produto / soma);
       
       return divisao;
    }
    
    static void Imprimir (double div){
        System.out.printf("Resultado da Divisão do Produto pela Soma igual á = %.0f\n",div);
    }
    public static void main(String[] args){
        Random random = new Random();
        int V [] = new int [10];
        
        for(int i =0; i < V.length; i++){
            V[i] = random.nextInt(20)+1;
        }
        
      double produto =  ProdImpar (V);
       double soma = SomaPar(V);
       
       double div = divisao (produto, soma);
       
       Imprimir(div);
    }
    
}
