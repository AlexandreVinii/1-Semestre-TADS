/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author ALEXANDRE
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner console = new Scanner (System.in);
     int fim, inicial=0,pares,rs;    
     
     //ENTRADA
        System.out.print("Digite Numero de onde Partir: ");
        inicial = console.nextInt();
        System.out.print("Numero Final: ");
        fim = console.nextInt();
        
        //PROCESSAMENTO
        while(inicial <= fim){
            
       if (inicial % 2 == 1){
                System.out.printf("Numero Impar -> %d \n",inicial); 
        }
        
                if (inicial % 3 == 0){
                System.out.printf("Numero Div por Três -> %d \n",inicial);
                }
        if (((inicial % 5 == 0) || (inicial % 7 == 0))) {
            System.out.printf("Numeros Div por Cinco ou Sete -> %d \n ",inicial);
        }       
        
        inicial++;
        }
        
        // TODO code application logic here
    }
    
}
