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
public class Salariophora {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        String name;
        double horasT, valorH, valorS;
        
        //ENTRADAS
        System.out.print("Digite o nome do Funcionário: ");
        name = console.next();
        
        System.out.printf("Digite o valor da hora trabalhada do funcionário %s: ",name);
        valorH = console.nextDouble();
        
        System.out.print("Digitte a quantidade de horas trabalhadas pelo mesmo : ");
        horasT = console.nextDouble();
        
        //PROCESSAMENTO
        valorS = horasT * valorH;
        
        //SAÍDA
        System.out.printf("O funcionário %s trabalhou %.0f horas por R$%.2f e deve receber R$%.2f \n",name, horasT, valorH, valorS);
    }
    
}
