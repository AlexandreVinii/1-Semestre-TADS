/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.de.decisao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Adivinha {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Random rm = new Random ();
       
        int num = rm.nextInt (10)+1;
        int usu;
        String n1, n2;
        
        //ENTRADA
        System.out.print("Divinhe o Número que estou pensando (1 a 10)! : ");
        usu = console.nextInt();
        n1 = Integer.toString(usu);
        n2 = Integer.toString(num);
        
        //PROCESSAMENTO
        if (n1.equals(n2)){
            System.out.println("Você Acertou !!!");
         
        }else {
            System.out.println("Você Errou !!");      
            
         
        
         } 
        }
    }