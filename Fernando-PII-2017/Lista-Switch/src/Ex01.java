/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSwitch;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex01 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        int num, resto;
        
        System.out.println("Escreva um Número");
        num = console.nextInt();
        
        resto = num % 3;

        switch (resto) {
            case 0:
                System.out.println("Numero divisível por 3");
                break;
            default:
                System.out.println("Número não é divisível por 3");
        }

    }
}
