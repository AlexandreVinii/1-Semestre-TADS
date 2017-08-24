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
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int weekday;
        System.out.println("Digite e saiba o dia da Semana de Domingo á Sabado");
        weekday = console.nextInt();
        
       switch(weekday) {
            case (1):
            case (8):
            case (15):
            case (22):
            case (29):
                System.out.printf("\nDomingo %d\n", weekday);
                break;
            case (2):
            case (9):
            case (16):
            case (23):
            case (30):   
                System.out.printf("\nSegunda %d\n", weekday);
                break;
            case (3):
            case (10):
            case (17):
            case (24):              
                System.out.printf("\nTerça %d\n", weekday);
                break;
            case (4):
            case (11):
            case (18):
            case (25):              
                System.out.printf("\nQuarta %d\n", weekday);
                break; 
            case (5):
            case (12):
            case (19):
            case (26):              
                System.out.printf("\nQuinta %d\n", weekday);
                break;
            case (6):
            case (13):
            case (20):
            case (27):              
                System.out.printf("\nSexta %d\n", weekday);
                break;  
            case (7):
            case (14):
            case (21):
            case (28):              
                System.out.printf("\nSábado %d\n", weekday);
                break;    
}
         }
    }
