/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.de.decisao;

import java.util.Scanner;

/**
 *
 * @author ALEXANDRE
 */
public class SomaII {
    public static void main(String[] args) {
       Scanner console = new Scanner (System.in);
       
       String num;
       int tamanho,soma= 0,mult = 1,rs;
         
       
        //ENTRADA
        System.out.print("Digite: ");
        num = console.next();
        
        //PROCESSAMENTO
        for (int j = num.length(); j >= 1; j--){
            String c = num.substring(j - 1, j);
            int mp = Integer.parseInt(c);
            mult *= mp;
        
        }
         for (int i = 0; i < num.length(); i++) {
            
        String d = num.substring(i, i+1);
        
        int di = Integer.parseInt(d);
        
        soma += di;
        }
         rs = (soma)+  mult +7;
            System.out.println(rs);
    }
    
}
