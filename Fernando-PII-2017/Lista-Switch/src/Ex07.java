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
public class Ex07 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int yearsold, a;
        double taxa;

        System.out.print("Sua idade: ");
        yearsold = console.nextInt();

        if (yearsold < 10) {
            a = 1;
        } else if (yearsold >= 10 && yearsold <= 30) {
            a = 2;
        } else if (yearsold >= 40 && yearsold <= 60) {
            a = 3;
        } else /*if (idade > 60)*/ {
            a = 4;
        }
        /*else {
            System.out.println("Command Invalid.");
        }*/

        switch (a) {
            case 1:
                taxa = 100 + 80;
                break;
            case 2:
                taxa = 100 + 50;
                break;
            case 3:
                taxa = 100 + 95;
                break;
            case 4:
                taxa = 100 + 130;
                break;
            default:
                taxa = 100;
                break;
        }

        System.out.printf("\nO valor do Plano de Saúde é de: R$%.2f\n", taxa);
    }

}
