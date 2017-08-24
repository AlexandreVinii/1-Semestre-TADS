/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.sequenciais;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Temperatura {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int c,f;
        
        //ENTRADA
        System.out.print("Digite a Temperatura em ºF: ");
        f = console.nextInt();
        
        //PROCESSAMENTO
        c =  (f - 32) * 5/9 ;
        
        //SAÍDA
        System.out.printf("%dºF São %dºC graus ",f , c);
    }
}
