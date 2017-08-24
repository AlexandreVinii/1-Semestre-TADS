/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.ex.pkg02;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex09 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int Stud;
        int den = 0, pos = 1;
        double n, m, sum = 0;

        //ENTRADA
        System.out.print("Quantidade de alunos na Sala: ");
        Stud = console.nextInt();

        //PROCESSAMENTO

        while (Stud > 0) {
            System.out.printf("%dº Nota do Aluno: ", pos);
            n = console.nextDouble();

            sum = n + sum;
            den++;
            pos++;
            Stud--;
        }
        m = sum / den;

        //SAÍDA        
        System.out.printf("\nMédia: %.2f\n", m);

    }

}