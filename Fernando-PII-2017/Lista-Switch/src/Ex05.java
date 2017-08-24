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
public class Ex05 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);

        int month;

        //Entradas
        System.out.print("Mês(número): ");
        month = console.nextInt();
        
        //processos e saídas
        switch (month) {
            case 12:
            case 1:
            case 2:
            case 6:
            case 7:
                System.out.println("Alta temporada.");
                break;
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Baixa Temporada");
                break;
            default:
                    System.out.println("Número inválido.");
                
}
    }
}
