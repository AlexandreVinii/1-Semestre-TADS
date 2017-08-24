/*Escreva um programa que pergunta de quem é a vez de jogar (O ou X) e em qual posição será feita a jogada.
Após isso, ele deve imprimir um tabuleiro de jogo-da-velha preenchido com a jogada informada.

Exemplo:

 1 | 2 | 3
---+---+---
 4 | 5 | 6
---+---+---
 7 | 8 | 9

De quem é a vez? O<enter>
Em qual posição? 5<enter>

   |   |
---+---+---
   | O |
---+---+---
   |   | 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas.de.decisao;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Tabuleiro {
    
    public static void main(String[] args) {
            Scanner console = new Scanner (System.in);
            String player;
            int position;
           
           //ENTRADAS
           System.out.print("De quem é a vez? (X ou O): ");
           
           player = console.next().toUpperCase();
           if (!"X".equals(player) && !"O".equals(player)) {
        System.out.println("Comando Inválido !");
           } else {
    
           System.out.print("Escolha a Posição para ser jogada.\n\n"
                            + "(Exemplos de posições para serem jogadas:) \n"
                            + "       |      |      \n"
                            + "   1   |   2  |   3  \n"
                            + " ------+------+------\n"
                            + "       |      |      \n"
                            + "   4   |   5  |   6  \n"
                            + " ------+------+------\n"
                            + "       |      |      \n"
                            + "   7   |   8  |   9  \n\n\n\n\n\n\n\n");
            System.out.print("Digite sua escolha: ");
            position = console.nextInt();
           
            
            //PROCESSAMENTO E SAIDA
            switch (position) {
            case 1:
                System.out.printf("       |      |      \n"
                        + "   %s   |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n", player);
                break;
            case 2:
                System.out.printf("       |      |      \n"
                        + "       |   %s  |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n", player);
                break;
            case 3:
                System.out.printf("       |      |      \n"
                        + "       |      |   %s  \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n", player);
                break;
            case 4:
                System.out.printf("       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "   %s   |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n", player);
                break;
            case 5:
                System.out.printf("       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |  %s   |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n", player);
                break;
            case 6:
                System.out.printf("       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |   %s  \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n", player);
                break;
            case 7:
                System.out.printf("       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "   %s   |      |      \n", player);
                break;
            case 8:
                System.out.printf("       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |  %s   |      \n", player);
                break;
            case 9:
                System.out.printf("       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |      \n"
                        + " ------+------+------\n"
                        + "       |      |      \n"
                        + "       |      |  %s   \n", player);
                break;
            default:
                System.out.println("Jogada Inválida");
                break;
        }
                
                }
    }
}