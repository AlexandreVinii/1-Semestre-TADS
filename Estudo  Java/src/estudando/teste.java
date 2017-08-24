/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class teste {

    static Scanner console = new Scanner(System.in);

    static int[] tamanho() {//Tamanho da Matriz
        int[] vetor = new int[2];
        System.out.println("Digite a Quantidade de Linhas");
        vetor[0] = console.nextInt();
        System.out.println("Digite a Quantidade de Colunas");
        vetor[1] = console.nextInt();

        return vetor;
    }

    static double[][] criaMatriz(int vetor[]) {
        int linhas = vetor[0];
        int colunas = vetor[1];

        double matriz[][] = new double[linhas][colunas];

        return matriz;
    }

    static double[][] populaMatriz(double[][] matriz) { // Popular  Matriz
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Linha " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Colunas " + (j + 1));
                System.out.print("Elemento :");
                matriz[i][j] = console.nextInt();
            }
        }
        return matriz;
    }

    static int contPar(double[][] matriz) {
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    cont++;
                }
            }
        }
        return cont;
    }
    
    static int contImpar(double[][] matriz){
        int cont = 0;
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 != 0){
                    cont++;
                }
            }
        }
        return cont;
    }

    static double[] vetorPar(double[][] matriz) {
        int contador = contPar(matriz);
        while (contador <= 0) {
            System.out.println("Numero Maior que ZERO '0' ");
            contador = console.nextInt();
        }
        double vetorPar[] = new double[contador];
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    vetorPar[cont] = matriz[i][j];
                    cont++;
                }
            }
        }
        return vetorPar;
    }
    
    static double [] vetorImpar(double [][] matriz){
        int contador = contImpar(matriz);
        while(contador <= 0){
            System.out.println("Numero Maior que 0 ");
            contador = console.nextInt();
        }
        double [] vetorImpar = new double [contador];
        int cont = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 != 0){
                    vetorImpar[cont] = matriz[i][j];
                    cont++;
                }
            }
        }
        return vetorImpar;
    }
    
    static void imprimeVetorParImpar(double [] vetorPar, double [] vetorImpar){
        for(int i = 0; i < vetorImpar.length; i++ ){
        System.out.printf("\t\nVetor Impar [%d]: %.1f\t\n",(i+1), vetorImpar[i]);
        }
        for(int i = 0; i < vetorPar.length; i++){
            System.out.printf("\t\nVetor Par [%d]: %.1f\t\n", (i+1), vetorPar[i]);
        }
        
    }
    
    public static void main(String[] args) {
        int [] Vetortamanho = tamanho();
        double [][] matriz = criaMatriz(Vetortamanho);
        matriz = populaMatriz(matriz);
        double [] vetorPares = vetorPar(matriz);
        double [] vetorImpares = vetorImpar(matriz);
        imprimeVetorParImpar(vetorPares, vetorImpares);
    }
}
