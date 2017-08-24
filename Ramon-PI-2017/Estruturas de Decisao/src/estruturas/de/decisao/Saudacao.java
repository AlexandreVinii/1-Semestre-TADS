/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.de.decisao;

import java.util.Scanner;

/** Escreva um programa que lê o nome de uma pessoa e mostra a seguinte mensagem: "Olá, nome da pessoa!".
Se a pessoa não entrar com um nome, o programa deve mostrar: "Olá, mundo!".
 *
 * @author Alexandre
 */
public class Saudacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//ENTRADAS
       Scanner console = new Scanner (System.in); 
       
       String nome;
        System.out.print("Escreva seu Nome: ");
        nome = console.nextLine ();
        
               if (nome.equals("")) {
                   System.out.println("Hello World!");
              
                   
               }else {
                   System.out.printf("Olá, %s\n", nome);
               } 
                   // TODO code application logic here
               }
    

}