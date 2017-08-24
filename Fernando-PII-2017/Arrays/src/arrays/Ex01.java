/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex01 {

    static Scanner console = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tamanho do Vetor
        int tamanho = tamanhoVetor();
        
        //cria Vetor
        int meuArray[] = criaVetor(tamanho);
        
        //popula Vetor
        meuArray = popularVetor(tamanho);
        
        //Imprime Vetor 
        imprimeVetor(meuArray);
      
        
    }

    static int tamanhoVetor() {

        int n;
        System.out.println("Quantos numeros será utilizado? --> ");
        n = console.nextInt();

        int meuArray[] = new int[n];
        return n;

    }

   public static  int[]  criaVetor(int tamanho) {
        
        int meuArray[] = new int[tamanho];
        
        return meuArray;
    }
   
   public static int[]   popularVetor(int tamanho){
       
       
       int meuArray[] = new int[tamanho];
        int soma = 0;

        for (int i = 0; i < meuArray.length; i++) {

            System.out.printf("%dº Numero: \n", i + 1);
            meuArray[i] = console.nextInt();

        }
       return meuArray;
   }

   public static void imprimeVetor (int meuArray[]){
       
       int maior = meuArray[0];
        int menor = meuArray[0];
        int soma = 0;

        for (int i = 0; i < meuArray.length; i++) {
            
            soma += meuArray[i];

            if (meuArray[i] < menor) {
                menor = meuArray[i];

            }

            if (meuArray[i] > maior) {
                maior = meuArray[i];

            }

        }

        for (int i = 0; i < meuArray.length; i++) {
            System.out.printf("\n V[%d]: %d ", i, meuArray[i]);

            if (meuArray[i] == menor) {
                System.out.print(" <--- Menor");
            } else if (meuArray[i] == maior) {
                System.out.print(" <--- Maior");
            }

            System.out.println("");
        }
        System.out.printf("\nA soma é: %d \n", soma);
       
   }
  
}
