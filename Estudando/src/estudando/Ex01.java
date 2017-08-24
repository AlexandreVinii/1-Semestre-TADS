/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex01 {

    static Scanner console = new Scanner(System.in);
    static Random random = new Random();

    // Cria a Matriz do Ex.
    static int[][] CriaMatriz() {
        int[][] matriz = new int[3][3];

        return matriz;
    }

    // Popula a Matriz do Ex.
    static int[][] PopMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(20) + 1;
            }
        }
        return matriz;
    }

    // Verifica Menor Numero da Matriz
    static double MenorValor(int[][] matriz) {
        int menorvalor = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > menorvalor) {
                    menorvalor = matriz[i][j];
                }
            }
        }
        return menorvalor;
    }

    static void ImprimeMatriz(int[][] matrizA, int[][] matrizB, double MenorValorA, double MenorValorB) {
        System.out.println("------- Matriz A -------");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Matriz [%d]{%d] = %d \n", i, j, matrizA[i][j]);
            }
        }
        System.out.println("------- Fim Matriz A ------- \n\n\n");
        System.out.println("------- Matriz B -------");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("Matriz [%d]{%d] = %d \n", i, j, matrizB[i][j]);
            }
        }
        System.out.println("------- Fim Matriz B ------- \n\n\n");
        
        
        System.out.printf("\n\n\n\nMenor Valor da Matriz A --> %.0f \n", MenorValorA);
        System.out.printf("Menor Valor da Matriz B --> %.0f \n\n\n", MenorValorB);
        double div = (MenorValorA / MenorValorB);
        System.out.print("Divisão do menor elemento da MatrizA pelo menor elemento da MatrizB");
        System.out.printf(" é igual á = %.2f \n\n", div);
    }

    public static void main(String[] args) {
        int[][] matrizA = CriaMatriz();
        int[][] matrizB = CriaMatriz();

        matrizA = PopMatriz(matrizA);
        matrizB = PopMatriz(matrizB);

        double menorA = MenorValor(matrizA);
        double menorB = MenorValor(matrizB);

        ImprimeMatriz(matrizA, matrizB, menorA, menorB);

    }
}
