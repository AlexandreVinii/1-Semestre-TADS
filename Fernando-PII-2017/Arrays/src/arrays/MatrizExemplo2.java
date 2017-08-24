/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Alexandre
 */
public class MatrizExemplo2 {
    public static void main(String[] args) {
        
        int linhas = MatrizPrincipal.tamanho();
        int colunas = MatrizPrincipal.tamanho();
        int [][] matriz = MatrizPrincipal.CriaMatriz(linhas,colunas);
        matriz = DiagonalVerificar(matriz);
        
        ImprimeMatriz(matriz);
        
        
        
    }
    
static int [][] DiagonalVerificar(int [][] matriz){
    
    for (int i = 0; i < matriz.length; i++ ){
        
        for (int j = 0; j < matriz[i].length; j++){
            
            if (i == j) //Diagonal MatrizPrincipal
                matriz[i][j] = 0;
            
            else if ((i+j) == (matriz.length -1)) //Diagonal Secundária
                matriz[i][j] = 1;
            else
                matriz[i][j] = 2;
        }
    }
    return matriz;    
} 

static void ImprimeMatriz (int [][] matriz){
    for (int i = 0; i < matriz.length; i++){
        for (int j = 0; j < matriz[i].length; j++){
            System.out.print(" " +matriz[i][j]);
        }
        System.out.println(" ");
}
    
}
}


 