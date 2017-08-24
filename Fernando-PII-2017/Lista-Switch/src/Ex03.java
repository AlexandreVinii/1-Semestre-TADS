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
public class Ex03 {

    public static void main(String[] args) {
        int dinheiro, calc, resto = 0;

        Scanner console = new Scanner(System.in);
        dinheiro = console.nextInt();

        switch (dinheiro) {
            case 100:
                System.out.println("1 Nota de R$ 100,00");
                break;
            case 50:
                System.out.println("1 Nota de R$ 50,00");
                break;
            case 10:
                System.out.println("1 Nota de R$ 10,00");
                break;
            case 5:
                System.out.println("1 Nota de R$ 5,00");
                break;
            case 1:
                System.out.println("1 Nota de R$ 1,00");
                break;
            case 2:
                System.out.println("2 Notas de R$ 1,00");
                break;
            case 3:
                System.out.println("3 Notas de R$ 1,00");
                break;
            case 4:
                System.out.println("4 Notas de R$ 1,00");
                break;
            default:

                if (dinheiro >= 100) {
                    calc = dinheiro / 100;
                    System.out.printf("%d Nota(s) de R$ 100,00 \n", calc);
                    resto = dinheiro % 100;

                } else if (dinheiro >= 50) {
                    calc = dinheiro / 50;
                    System.out.printf("%d Nota(s) de R$ 50,00 \n", calc);
                    resto = dinheiro % 50;

                } else if (dinheiro >= 10) {
                    calc = dinheiro / 10;
                    System.out.printf("%d Nota(s) de R$ 10,00 \n", calc);
                    resto = dinheiro % 10;

                } else if (dinheiro >= 5) {
                    calc = dinheiro / 5;
                    System.out.printf("%d Nota(s) de R$ 5,00 \n", calc);
                    resto = dinheiro % 5;

                }
        }

        if (resto >= 50) {
            calc = resto / 50;
            System.out.printf("%d Nota(s) de R$ 50,00 \n", calc);
            resto = resto - (calc * 50);
        } else if (resto >= 10) {
            calc = resto / 10;
            System.out.printf("%d Nota(s) de R$ 10,00 \n", calc);
            resto = resto - (calc * 10);
        } else if (resto >= 5) {
            calc = resto / 5;
            System.out.printf("%d Nota(s) de R$ 5,00 \n", calc);
            resto = resto - (calc * 5);
        }

        if (resto >= 10) {
            calc = resto / 10;
            System.out.printf("%d Nota(s) de R$ 10,00 \n", calc);
            resto = resto - (calc * 10);
        } else if (resto >= 5) {
            calc = resto / 5;
            System.out.printf("%d Nota(s) de R$ 5,00 \n", calc);
            resto = resto - (calc * 5);
        }

        if (resto >= 5) {
            calc = resto / 5;
            System.out.printf("%d Nota(s) de R$ 5,00 \n", calc);
            resto = resto - (calc * 5);
        }
        if (resto >= 1) {
            calc = resto / 1;
            System.out.printf("%d Nota(s) de R$ 1,00 \n", calc);
        }
    }

}
