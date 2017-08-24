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
public class SomaMatriz {
    public static void main(String[] args) {
        
        int linhasM1 = MatrizPrincipal.tamanho();
        int linhasM2= MatrizPrincipal.tamanho();
        int colunasM1 = MatrizPrincipal.tamanho();
        int colunasM2 = MatrizPrincipal.tamanho();
        
        int [][] m1 = MatrizPrincipal.CriaMatriz(linhasM1, colunasM1);
        m1 = MatrizPrincipal.PopularMatriz(m1);
        int [][] m2 = MatrizPrincipal.CriaMatriz(linhasM2, colunasM2);
        m2 = MatrizPrincipal.PopularMatriz(m2);
        
        System.out.print("Soma das Matrizes --> ");Soma(m1,m2);
        
    }
    static int [][] Soma (int [][] m1, int [][] m2){
        int [][] mSoma = MatrizPrincipal.CriaMatriz(m1.length, m1.length);
        for(int i = 0; i < m1.length; i++)
            for(int j = 0; j < m1[i].length; j++){
                 mSoma[i][j] = m1[i][j] + m2[i][j];
        System.out.printf("%d\t ", mSoma[i][j]);
                 }
        System.out.printf("\n");
                 
        return mSoma;
        
    }
}
