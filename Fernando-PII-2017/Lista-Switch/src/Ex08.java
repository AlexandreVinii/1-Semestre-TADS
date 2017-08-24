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
public class Ex08 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double year, bill;
        int month;

        System.out.print("Mês em que pagará ou pagou a multa: ");
        month = console.nextInt();
        System.out.print("Valor da anuidade: ");
        bill = console.nextDouble();
        year = bill;

        switch (month) {

            case 1:
                System.out.printf("\nValor normal: R$%.2f\n", bill);
                break;

            case 2:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 3:
                bill = bill * Math.pow((1 + 0.05), (- 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 4:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 5:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 6:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 7:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 8:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 9:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 10:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 11:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            case 12:
                bill = bill * Math.pow((1 + 0.05), (month - 1));
                System.out.printf("Valor da anuidade é de R$%.2f\nCom o valor da multa é de: R$%.2f\n", year, bill);
                break;

            default:
                System.out.println("Mês não existe !.");
                break;
        }

    }

}
