/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.sequenciais;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Triangulo2 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
       double cata,catb,hip, pitagoras, per;
      
      
       //ENTRADA
       System.out.print("Digite Cateto 1: ");
       cata = console.nextDouble();
        System.out.print("Digite Cateto 2: ");
       catb = console.nextDouble();
      
      
       //PROCESSAMENTO
       hip = (Math.pow(cata, 2) + Math.pow(catb, 2));
        pitagoras = Math.sqrt(hip);
        per = cata + catb + pitagoras;
               
       //SAIDA
        System.out.println("Valor da Hipotenusa é Igual: "+ per);
       
      
    }
}