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
public class Ex06 {
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        String name = null, namef = null, sexo, sexof = null;
        int idade, idadef = 0;
        int stud = 5;
        
        do {
        //ENTRADAS
        System.out.print("Digite Nome: ");
        name = console.next ();
        
        System.out.print("Digite Idade: ");
        idade = console.nextInt ();
        
        System.out.print("Digite Sexo: ");
        sexo = console.next();
        
        //PROCESSAMENTO
        if (idade > idadef) {
            namef = name;
            idadef = idade;
            sexof = sexo;
        }
        stud--;
        } while (stud != 0);
        
        //SAÍDA
        System.out.printf("\n Nome: %s \n Idade: %d \n Sexo: %s \n", namef, idadef, sexof);
        
       
        
       
    }
}