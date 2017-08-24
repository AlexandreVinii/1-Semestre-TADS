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
public class Prova1 {
    static int[] CriaVetor (){
        int[] vetor = new int [5];
        
        return vetor;
    }
    
    static int [] PopVetor (int [] vetor){
        Random random = new Random ();
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100)+1;
        }
        return vetor;
    }
    
    static int MenorValor (int [] vetor){
    int menorValor = vetor[0];
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menorValor){
                menorValor = vetor[i];
            }
             System.out.printf("Vetor[%d] = %d\n",i,vetor[i]);
        }
        return menorValor;
    }
    
    public static void main(String[] args) {
        int [] vetorA = CriaVetor ();
        int [] vetorB = CriaVetor ();
        
        vetorA = PopVetor(vetorA);
        vetorB = PopVetor(vetorB);
        
        double menorA = MenorValor (vetorA);
        double menorB = MenorValor (vetorB);
        
       double div = (menorA / menorB);
        
        System.out.printf("Menor Valor A = %.0f\n",menorA);
        System.out.printf("Menor Valor B = %.0f\n",menorB);
        System.out.printf("Divisão é igual á = %.2f \n\n",div);
        
        
    }
    
}
