/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.de.decisao;

import java.util.Random;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author ALEXANDRE
 */
public class Par_Impar {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        Random rm = new Random ();
        String usuario, P = " ";
        int par,impar,vencedor,num;
        int c = rm.nextInt (10)+1;
        boolean continuar = true;
        do {
        //ENTRADA
        System.out.print("Escolha se vai jogar com Par(p) ou Ímpar(i):  ");
        usuario = toUpperCase(console.next());
        
        System.out.print("Escolha um Número de 1 á 10: ");
        num = console.nextInt();
        
        //PROCESSAMENTO
        
        switch (usuario){
            case "P":
                vencedor = num + c;
                if (vencedor % 2 == 0){
                    System.out.println("Você Ganhou (como jogador PAR) !!!");
                }else if (vencedor %2 == 1){
                    System.out.println("Você Perdeu... (como jogador PAR)");
                }
                break;
            
            case "I":
             vencedor = num + c;
                if (vencedor % 2 == 1){
                    System.out.println("Você Ganhou (como jogador Impar) !!!");
                }else if (vencedor %2 == 0){
                    System.out.println("Você Perdeu... (como jogador Impar)");
                }
                break;
             
                
                
                
             
               
        
    }
        
        
     
    } while(continuar);
    }   
    
}
