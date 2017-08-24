/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre
 */
public class Pv2 {

    static Random random = new Random();

    static int[][] populaMatriz(int[][] matriz) {
        System.out.println("to aqui na popula matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(20) + 1;

            }
        }
        return matriz;

    }

    static int[][] TestaMatriz(int[][] matriz, int numero) {
        System.out.println("to aqui na testa matriz");
        int contador = 0;
        int i = 0, j = 0;
        int linha = 0, coluna = 0;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    contador = contador + 1;
                    linha = i;
                    coluna = j;
                    

                }

            }

        }
        System.out.printf("O nÃºmero %d estÃ¡ na posicao da Matriz[%d][%d]: \n", numero, linha, coluna);
        System.out.println("O numero "+numero+" aparece " + contador + " vezes na matriz");

        return matriz;

    }

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um nÃºmero de 1 a 10"));

        int[][] matriz = new int[5][5];

        matriz = populaMatriz(matriz);

        matriz = TestaMatriz(matriz, numero);

    }
}
