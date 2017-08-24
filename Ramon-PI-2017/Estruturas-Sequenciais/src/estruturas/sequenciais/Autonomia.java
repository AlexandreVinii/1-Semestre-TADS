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
public class Autonomia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        double km, tanque, div;
        
        //ENTRADA
        
        System.out.println("Quantos litros tem o tanque do seu carro? (Zerar Odômetro após de abastecer) ");
        tanque = console.nextDouble();
        
        System.out.println("Quantos KM o odômetro marca desde o último abastecimento?");
        km = console.nextDouble ();
        
        //PROCESSAMENTO E SAIDA
        div = (km / tanque);
        System.out.printf("Seu Carro tem uma Autonomia de %f Km/L", div);
        


        
        
    }
    
}
