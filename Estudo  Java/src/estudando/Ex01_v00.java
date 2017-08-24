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
public class Ex01_v00 {
    
    static Random random = new Random();
    //Cria Vetores quantos desejar.
    static int [] CriaVetor (){
        int [] vetor = new int [3];
        
        return vetor;
    }
    
    // Popula Vetores quantos desejar.
    static int [] PopVetor (int [] vetor){
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(100)+1;
        }
        return vetor;
    }
    
    //Verifica menor elemento do vetor !
    static double MenorValor (int [] vetor){
        double menor = vetor[0];
         for(int i = 0; i < vetor.length; i++){
            if( menor > vetor[i]){
                menor = vetor[i];
            }
        }
         return menor;
    }
    
    //Imprime Vetor
    static void ImprimeVetor (int [] vetorA, int [] vetorB, double menorValorA,double menorValorB){
        System.out.println("-------Vetor A------");
         for(int i = 0; i < vetorA.length; i++){
             System.out.printf("Vetor[%d] = %d \n",i,vetorA[i]);
        }
        System.out.println("-------Fim Vetor A------\n\n");
        
        
        System.out.println("\n\n-------Vetor B------");
         for(int i = 0; i < vetorB.length; i++){
             System.out.printf("Vetor[%d] = %d \n",i,vetorB[i]);
        }
        System.out.println("-------Fim Vetor B------\n\n\n");
        
        System.out.printf("Menor Valor Vetor A --> %.0f \n",menorValorA);
        System.out.printf("Menor Valor Vetor B --> %.0f \n\n\n",menorValorB);
        double div = (menorValorA/menorValorB);
        System.out.printf("Menor valor Vetor A dividido menor valor Vetor B");
        System.out.printf("É igual a -> %.2f\n\n",div);
    }
    
    public static void main(String[] args) {
        int[] matrizA = CriaVetor();
        int[] matrizB = CriaVetor();
        
        matrizA = PopVetor(matrizA);
        matrizB = PopVetor(matrizB);
        
        double menorA = MenorValor(matrizA);
        double menorB = MenorValor(matrizB);
        
        ImprimeVetor (matrizA, matrizB, menorA, menorB);
        
    }
}

