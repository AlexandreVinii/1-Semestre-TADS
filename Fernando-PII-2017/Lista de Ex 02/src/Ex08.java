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
public class Ex08 {
    public static void main(String[] args) {
        int sum = 0, den = 0, fn;
        
        //PROCESSAMENTO
        for (int i = 13; i < 73; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum = sum + i;
                den++;
            }
        }

        //SAÍDA
        fn = sum / den;
        System.out.println(fn);
    }

}