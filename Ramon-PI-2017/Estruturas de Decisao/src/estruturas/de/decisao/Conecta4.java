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
public class Conecta4 {

    public static String[][] visual() {
        String[][] conecta = new String [7][15];

        //Laço das linhas de cima para baixo
        for (int i = 0; i < conecta.length; i++) {

            //Laço das colunas da esquerda para direita
            for (int j = 0; j < conecta[i].length; j++) {

                /* Sempre a coluna par terá as bordas e as
                colunas ímpares, entre eles que estarão vazios
                ou terá um número */
                if (j % 2 == 0) conecta[i][j] = "|";
                else conecta[i][j] = " ";
                if (i == 6) conecta[i][j] = "-";
                
            }

        }
        return conecta;
    }

    public static void printConecta(String[][] conecta) {

        for (int i = 0; i<conecta.length; i++) {

            for (int j = 0; j < conecta[i].length; j++) {

                System.out.print(conecta[i][j]);
            }
            System.out.println();
        }
    }

    /* Movimentos do Usuário para escolher as colunas vazias do disco Amarelo*/
    public static void ConectaAmarelo(String[][] conecta) {

        /* Pedimos que o usuário nos diga qual coluna ele quer colocar
        o disco Amarelo.
         */
        System.out.println("Solte o Disco Amarelo na coluna que deseja ! (0-6)");
        Scanner console = new Scanner(System.in);

        int c = 2*console.nextInt()+1;

        for (int i = 5; i >= 0; i--) {

            if (conecta[i][c] == " ") {

                conecta[i][c] = "A";
                break;
            }

        }
    }

    //Movimentos do Usuário para escolher as colunas vazias do disco Vermelho.
    public static void ConectaVermelho(String[][] conecta) {

        System.out.println("Solte o Disco Vermelho na coluna que deseja ! (0-6)");
        Scanner console = new Scanner(System.in);

        int c = 2*console.nextInt()+1;

        for (int i = 5; i >= 0; i--) {

            if (conecta[i][c] == " ") {

                conecta[i][c] = "V";
                break;
            }

        }
    }

    public static String VerificadorGanhador(String[][] conecta) {

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 7; j += 2) {

                if ((conecta[i][j + 1] != " ")
                        && (conecta[i][j + 3] != " ")
                        && (conecta[i][j + 5] != " ")
                        && (conecta[i][j + 7] != " ")
                        && ((conecta[i][j + 1] == conecta[i][j + 3])
                        && (conecta[i][j + 3] == conecta[i][j + 5])
                        && (conecta[i][j + 5] == conecta[i][j + 7]))) {
                    return conecta[i][j + 1];
                }

            }
        }

        for (int i = 1; i < 15; i += 2) {

            for (int j = 0; j < 3; j++) {

                if ((conecta[j][i] != " ")
                        && (conecta[j + 1][i] != " ")
                        && (conecta[j + 2][i] != " ")
                        && (conecta[j + 3][i] != " ")
                        && ((conecta[j][i] == conecta[j + 1][i])
                        && (conecta[j + 1][i] == conecta[j + 2][i]))) {
                    return conecta[j][i];
                }
            }
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 1; j < 9; j += 2) {

                if ((conecta[i][j] != " ")
                        && (conecta[i + 1][j + 2] != " ")
                        && (conecta[i + 2][j + 4] != " ")
                        && (conecta[i + 3][j + 6] != " ")
                        && ((conecta[i][j] == conecta[i + 1][j + 2])
                        && (conecta[i + 1][j + 2] == conecta[i + 2][j + 4])
                        && (conecta[i + 2][j + 4] == conecta[i + 3][j + 6]))) {
                    return conecta[i][j];
                }
            }

        }
        for (int i = 0; i < 3; i++) {

            for (int j = 7; j < 15; j += 2) {

                if ((conecta[i][j] != " ")
                        && (conecta[i + 1][j - 2] != " ")
                        && (conecta[i + 2][j - 4] != " ")
                        && (conecta[i + 3][j - 6] != " ")
                        && ((conecta[i][j] == conecta[i + 1][j - 2])
                        && (conecta[i + 1][j - 2] == conecta[i + 2][j - 4])
                        && (conecta[i + 2][j - 4] == conecta[i + 3][j - 6]))) {
                    return conecta[i][j];
                }

            }

        }
        return null;
    }

    public static void main(String[] args) {

        String[][] conecta = visual();

        boolean repetirjogo = true;

        int count = 0;
        printConecta(conecta);

        while (repetirjogo) {

            if (count % 2 == 0) ConectaAmarelo(conecta);
             else ConectaVermelho(conecta);
            count++;
            printConecta(conecta);

            if (VerificadorGanhador(conecta) != null) {
                if (VerificadorGanhador(conecta) == "A") 
                    System.out.println("O Jogador Amarelo Ganhou !!");
                else if (VerificadorGanhador(conecta) == "V") 
                    System.out.println("O jogador Vermelho Ganhou !!");
                

                repetirjogo = false;
            }

        }
    }
}
