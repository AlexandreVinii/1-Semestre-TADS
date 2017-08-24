/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.de.ex.pkg02;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Ex19 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        boolean vl;
        String pass;

        //Entrada
        System.out.print("Senha: ");
        pass = console.next();

        //PROCESSAMENTO E SAÍDA
        vl = pass.equalsIgnoreCase("2002");
        if (vl) {
            System.out.println("Acesso Concedido");
        } else {
            while (!vl) {
                System.out.print("Senha Inválida.\nSenha: ");
                pass = console.next();
                if (pass.equalsIgnoreCase("2002")) {
                    System.out.println("Acesso Concedido");
                    break;
                }
            }
        }
    }

}