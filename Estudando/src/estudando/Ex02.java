/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
 */
public class Ex02 {

    static Random random = new Random();
    static Scanner console = new Scanner(System.in);
    // Cria a Matriz do Ex.

    static int[][] CriaMatriz() {
        int[][] matriz = new int[4][4];

        return matriz;
    }

    // Popula a Matriz do Ex.
    static int[][] PopMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10) + 1;
            }
        }
        return matriz;
    }

    static int[][] ValidaMatriz(int[][] matriz, int numDigitado) {
        int cont = 0;
        int linha = 0;
        int coluna = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] != numDigitado){
                    linha = i;
                    coluna = j;
                    System.out.printf("O numero não aparece na posição da Matriz[%d][%d] !\n",linha,coluna);
                }
                if (matriz[i][j] == numDigitado) {
                    linha = i;
                    coluna = j;
                    cont++;
                    System.out.println("\n\t\t------Numero Encontrado ------");
        System.out.printf("O numero Digitado --> %d está na posição Matriz [%d][%d] \n", numDigitado, linha, coluna);
                    System.out.println("\t\t------Numero Encontrado ------\n");
                }

            }
        }
        System.out.println("\n\t-----Quantidade de Vezes que Aparece na Matriz -------");
        System.out.printf("O numero Digitado --> %d Aparace na Matriz %d vez(es) \n\n", numDigitado, cont);
        return matriz;
    }
    
    public static void main(String[] args) {
        
        int numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um Valor positivo 1 até 10"));
        int [][] matriz = CriaMatriz();
        matriz = PopMatriz(matriz);
        
        ValidaMatriz(matriz,numDigitado);
        
        
    }
}
