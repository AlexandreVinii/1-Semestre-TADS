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
public class Ex06 {
    public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
        
   
        int day;
        
//Entradas
        System.out.print("Days of Week: ");
       day = console.nextInt();
//Processos e Saídas        
        switch (day) {
            case 1:
            case 7:    
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Day of Week.");
                break;
            default:
System.out.println("command Invalid.\nType number of 1 at 7.");
    }
} }
