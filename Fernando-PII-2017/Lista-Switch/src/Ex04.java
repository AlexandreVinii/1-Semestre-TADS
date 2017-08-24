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
public class Ex04 {
    public static void main(String[] args) {
        
        
        Scanner console = new Scanner(System.in);

        int year, month;

        

        System.out.println("How Days This Month have? ");

        //Entradas

        System.out.print("Month: ");
        month = console.nextInt();
        System.out.print("Year: ");
        year = console.nextInt();

        boolean bissexto = (year % 4 == 0);
        //Processos e Saídas

        switch (month) {
            case 1:
                System.out.printf("\nThe January of &d has 31 days. \n",  year);
                break;
                
            case 2:
                if (bissexto) {
                System.out.printf("\nThe February of &d has 29 days. \n",  year);
                
                } else {
                System.out.printf("\nThe February of &d has 28 days. \n",  year);
                
                }
                break;
                
            case 3:
                System.out.printf("\nThe March of &d has 31 days. \n",  year);
                break;
                
            case 4:
                System.out.printf("\nThe April of &d has 30 days. \n",  year);
                break;
                
            case 5:
                System.out.printf("\nThe May of &d has 31 days. \n",  year);
                break;
                
            case 6:
                System.out.printf("\nThe June of &d has 30 days. \n",  year);
                break;
                
            case 7:
                System.out.printf("\nThe July of &d has 31 days. \n",  year);
                break;
                
            case 8:
                System.out.printf("\nThe August of &d has 31 days. \n",  year);
                break;
                
            case 9:
                System.out.printf("\nThe Setember of &d has 30 days. \n",  year);
                break;
                
            case 10:
                System.out.printf("\nThe October of &d has 31 days. \n",  year);
                break;
                
            case 11:
                System.out.printf("\nThe November of &d has 30 days. \n",  year);
                break;
                
            case 12:
                System.out.printf("\nThe December of &d has 31 days. \n",  year);
                break;

}
    }
    
}
