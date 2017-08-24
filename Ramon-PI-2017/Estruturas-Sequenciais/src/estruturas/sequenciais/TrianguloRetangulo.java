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
public class TrianguloRetangulo {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
       double cata,catb,hip, pitagoras;
       
       System.out.print("Digite Cateto A: ");
       cata = console.nextDouble();
        System.out.print("Digite Cateto B: ");
       catb = console.nextDouble();
       
       
       
       hip = (Math.pow(cata, 2) + Math.pow(catb, 2));
        pitagoras = Math.sqrt(hip);
                
       
        System.out.println("Valor da Hipotenusa é Igual: "+ pitagoras);
        
       
    }
}
