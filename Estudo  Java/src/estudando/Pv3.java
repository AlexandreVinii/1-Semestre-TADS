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
public class Pv3 {

    static Random random = new Random();

    static int[][] populaMatriz(int[][] matriz) {
        System.out.println("to aqui na popula matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10)+1;

            }
        }
        return matriz;

    }

    static int IndiceImpar(int[][] matriz) {
        System.out.println("to aqui no indice impar");
        int produto = 1, i, j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 1 && j % 2 == 1) {
            produto *= matriz[i][j] ;
                    System.out.printf("Matriz [%d][%d] = %d \n",i,j,matriz[i][j]);
                }
            }
        }
        System.out.println("\t\t----- Fim Matriz Impar -----" +produto);

        return produto;

    }

    static int IndicePar(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    
                    soma += matriz[i][j];
                }
            }

        }
                    System.out.printf("Vetor = %d \n",soma);

        return soma;

    }

    static int calculo(int produto, int soma) {
        int resultado;

        resultado = produto / soma;

        return resultado;

    }

    static void imprime(int resultado) {
        System.out.println("O resultado é " + resultado);

    }

    public static void main(String[] args) {

        int impares, par;
        int resultado;

        int[][] matriz = new int[6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(5)+1;

            }

        }

        impares = IndiceImpar(matriz);
        
        par = IndicePar(matriz);
        
        resultado = calculo(impares, par);
        
        imprime(resultado);

    }
}