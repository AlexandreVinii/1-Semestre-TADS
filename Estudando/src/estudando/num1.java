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
public class num1 {

    static Scanner console = new Scanner(System.in);

    static int[] tamanho() {
        int[] vetor = new int[2];
        System.out.println("Tamanho da Sua Matriz: ");
        System.out.println("Digite a quantidade de linhas ! ");
        vetor[0] = console.nextInt();
        System.out.println("Digite a quantidade de Colunas ! ");
        vetor[1] = console.nextInt();

        return vetor;
    }
    
    static int [] tamanhox (){
        int vetorx [] = new int [2];
        System.out.println("Quantidade de Linhas ");
        vetorx [0] = console.nextInt();
        System.out.println("Quantidade de Colunas");
        vetorx [1] = console.nextInt();
        
        return vetorx;
    }

    static double[][] CriaMatriz(int vetor[]) {
        int linhas = vetor[0];
        int colunas = vetor[1];

        double matriz[][] = new double[linhas][colunas];

        return matriz;

    }
    
    static double [][] CriaMatrizx(int vetorx []){
        int linhas = vetorx [0];
        int colunas = vetorx [1];
        double matriz[][] = new double [linhas][colunas];
        
        return matriz;
    }

    static double[][] populaMatriz(double[][] matriz) {
        System.out.println("Popula Matriz ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Linha " + (i + 1));
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Coluna " + (j + 1));
                System.out.print("Elemento: ");
                matriz[i][j] = console.nextDouble();
            }
        }
        return matriz;
    }
    
    static double[][] populaMatrizx (double[][] matrizx){ //Popula Matriz.
        for(int i = 0; i < matrizx.length; i++){
            System.out.println("Linha "+ (i+1));
            for(int j = 0; j < matrizx[i].length; j++){
                System.out.println("Coluna "+ (j+1));
                System.out.print("Elemento: ");
                matrizx[i][j] = console.nextDouble();
            }
        }
       return matrizx;
    }

    static int contPares(double[][] matriz) {
        System.out.println("Contador de Pares");
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
    
    static int contImpares(double[][] matrizx){
        int cont = 0;
        for(int i = 0; i < matrizx.length; i++){
            for (int j = 0; j < matrizx[i].length; j++)
                if(matrizx[i][j] % 2 != 0){
                    cont++;
                }
        }
        return cont;
    }

    static double[] vetorPar(double[][] matriz) {
        int contador = contPares(matriz);
        while (contador <= 0) {
            System.out.println("Numero Maior que Zero ");
            contador = console.nextInt();
        }
        double[] vetorPares = new double[contador];
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    vetorPares[cont] = matriz[i][j];
                    cont++;
                }
            }
        }
        return vetorPares;
    }
    
    static double [] vetorImpar(double [][] matrizx ){
        int contador = contImpares(matrizx);
        while (contador <= 0){
            System.out.println("Numero Maior que Zero ");
            contador = console.nextInt();
        }
        double[] vetorImpar = new double [contador];
        int cont = 0;
        for (int i = 0; i < matrizx.length; i++){
            for (int j = 0; j < matrizx.length; j++){
                vetorImpar[cont] = matrizx[i][j];
                cont++;
            }
        }
        return vetorImpar;
            
        
        
    }

    static void imprimeVetorPares(double[] vetorPar) {
        System.out.println("Imprime Vetor Pares");
        for (int i = 0; i < vetorPar.length; i++) {
            System.out.printf("\n\t Vetor Par [%d]: %.1f \n\t", i + 1, vetorPar[i]);
        }
    }
    
    static void imprimeVetorImpares(double [] vetorImpar){
        for (int i = 0; i < vetorImpar.length; i++){
            System.out.println("Vetor Impares");
        }
    }

    public static void main(String[] args) {
        int[] vetorTamanho = tamanho();
        double[][] matriz = CriaMatriz(vetorTamanho);
        matriz = populaMatriz(matriz);
        double vetorPares [] = vetorPar(matriz);
        imprimeVetorPares(vetorPares);

    }

}
