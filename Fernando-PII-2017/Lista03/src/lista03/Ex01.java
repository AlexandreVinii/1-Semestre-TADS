/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

/**
 *
 * @author ALEXANDRE
 */
public class Ex01 {

    public static void main(String[] args) {
        //Entrada
        System.out.println("Digite os Três Numeros: ");
        
        
        int menor = FuncaoGeral.entradaInt();
        for(int i = 2; i < 4; i++){
            System.out.printf("%dº Numero: ",i);
            menor = FuncaoGeral.MenorValor(menor);
        }
        System.out.printf("O Menor Número é o > %d \n", menor);
    }
        
    }