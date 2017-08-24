/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

/**
 *
 * @author Alexandre
 */
public class Ex03 {
    public static void main(String[] args) {
        System.out.println("Digite o valor para Obter o Fatorial ");
        
        int N = FuncaoGeral.entradaInt();
        N = FuncaoGeral.ValidarPositivo(N);
        N = FuncaoGeral.Fatorial(N);
        System.out.println(N);
    }
}
