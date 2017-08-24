/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula21.pkg03pi;

import java.util.Scanner;

/**
 *
 * @author alexandre.vfsilva
 */
public class Meses {
    public static void main(String[] args) {
        
        
        Scanner console = new Scanner(System.in);
        
        
     int dias;
     int mes = console.nextInt();
     
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 2:
                dias = 28;
                break;
            default:
                dias = 30;
                break;
        }
     
    }
    
    
}
