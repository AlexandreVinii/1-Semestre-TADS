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
public class SomaElementos {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Digite o Numero de Linhas");
        int linhas = console.nextInt();
        
        System.out.println("Digite o numero de Colunas");
        int colunas = console.nextInt();
        int matriz [][] = MatrizPrincipal.CriaMatriz(linhas, colunas);
        matriz = MatrizPrincipal.PopularMatriz(matriz);
        int soma = 0;
        
        
        
        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz.length; j++){
            soma += matriz[i][j];
                System.out.printf("Matriz [%d][%d] = %d\n", i, j, matriz[i][j]);
            }
        System.out.printf("Soma das Matrizes --> %d\n" , soma);
        
    }
    
}
