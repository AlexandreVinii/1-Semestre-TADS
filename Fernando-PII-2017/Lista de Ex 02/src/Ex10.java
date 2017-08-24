/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.ex.pkg02;

/**
 *
 * @author Alexandre
 */
public class Ex10 {
    
    public static void main(String[] args) {
        
        //ENTRADA
        double sum = 0;
        
        
        //PROCESSAMENTO
        for (double i = 1; i <= 20; i++) {
            sum = sum + (1/i);           
        }
        //SAÍDA
        System.out.println(sum);
    }
    
}