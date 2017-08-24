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
public class MatrizPrincipal {
    
    static Scanner console = new Scanner (System.in);
    
    
    public static void main(String[] args) {
        int linhas = tamanho();
        int colunas = tamanho();
        int[][] matriz = CriaMatriz(linhas, colunas);
        matriz = PopularMatriz(matriz);
        ImprimeMatriz(matriz);
    }
    
    static int tamanho (){
        int  t;
        System.out.println("Digite o tamanho de sua Matriz !");
        System.out.println("Linha e Coluna da Matriz ");
        t = console.nextInt();
        return t;
        
    }
    
    static int[][] CriaMatriz(int linhas, int colunas){
        int [][] matriz = new int [linhas][colunas];
        
        return matriz;
        
        
    }
    
    static int[][] PopularMatriz (int[][] matriz){
        System.out.println("Digite os valores de sua Matriz abaixo: ");
        for(int i = 0; i < matriz.length; i++){
            
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf(" %d Matriz [%d][%d]: ",(i+1), i, j);
                matriz[i][j] = console.nextInt();
            }
        }
      return matriz;
    
}
    
    static void ImprimeMatriz (int [][] matriz){
        for (int i = 0; i < matriz.length; i++){
            
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Matriz[%d][%d]: [%d] \n", i ,j ,matriz[i][j]);
                
            }
        }
        
    }
}
