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
public class Prova2 {
    static int [][] CriaMatriz (){
        int M = 10;
        int N = 10;
    int [][] matriz = new int [M][N];
    
    return matriz;
}
    
    static int [][] PopMatriz (int [][] matriz){
        Random rd = new Random ();
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz [i][j] = rd.nextInt(20)+1;
            }
        }
        return matriz;
    }
    
    static int ValidaMatriz (int [][] matriz, int numDigitado){
        int cont = 0;
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == numDigitado){
                    cont++;
                    System.out.printf("O numero --> %d se encontra na Matriz[%d][%d] \n\n",numDigitado,i,j);
                }
            }
        }
        System.out.printf("O numero Digitado --> %d se repete na Matriz %d vez(es) ", numDigitado,cont);
        return cont;
    }
    
    public static void main(String[] args) {
        int [][] matriz = CriaMatriz();
        matriz = PopMatriz(matriz);
        
        ValidaMatriz(matriz,11);
    }
    
}
