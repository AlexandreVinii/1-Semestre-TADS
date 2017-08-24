/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.pkg04pii;

import java.util.Scanner;

/**
 *
 * @author alexandre.vfsilva
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String type;
        double temperature;

        System.out.print("Write a type of Food: ");
        type = console.nextLine();
        System.out.print("Write a Temperature: ");
        temperature = console.nextDouble();

        switch (type) {
            case "A":
            case "a":
                if (temperature >= 10 && temperature <= 17) {
                    System.out.println("The food can be transported !");
                } else {
                    System.out.println(" (Warning) The Food can't be transported ! (Warning) ");
                }
                break;

            case "B":
            case "b":
                if (temperature >= 11 && temperature <= 16) {
                    System.out.println("The food can be transported !");
                } else {
                    System.out.println(" (Warning) The Food can't be transported ! (Warning) ");
                }
                break;

            case "C":
            case "c":
                if (temperature >= 12 && temperature <= 15) {
                    System.out.println("The food can be transported !");
                } else {
                    System.out.println(" (Warning) The Food can't be transported !(Warning) ");
                }
                break;

            case "D":
            case "d":
                if (temperature >= 13 && temperature <= 14) {
                    System.out.println("The food can be transported !");
                } else {
                    System.out.println("(Warning) The Food can't be transported (Warning) !");
                }
                break;

        }

    }

}
