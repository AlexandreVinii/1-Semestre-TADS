
package estruturas.de.decisao;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class WarZ {

    static int MaiorAtaq(int ataq1, int ataq2, int ataq3) { // Determinar Sequencia de Maior Ataque
        int maior = 0;

        for (int i = 1; i <= 3; i++) {
            if (ataq1 > maior) {
                maior = ataq1;
            } else if (ataq2 > maior) {
                maior = ataq2;
            } else if (ataq3 > maior) {
                maior = ataq3;
            }
        }

        return maior;
    } // Determinar Sequencia de Maior Ataque Fim.

    static int MaiorDef(int def1, int def2, int def3) { // Determinar Sequencia de Menor Defesa
        int maior = 0;

        for (int i = 1; i <= 3; i++) {
            if (def1 > maior) {
                maior = def1;
            } else if (def2 > maior) {
                maior = def2;
            } else if (def3 > maior) {
                maior = def3;
            }
        }

        return maior;
    } // Determinar Sequencia de Menor Defesa Fim.

    static int SegundoMaiorAtaq(int ataq1, int ataq2, int ataq3) { // Determinar Sequencia de Segundo Maior Ataque
        int maior = MaiorAtaq(ataq1, ataq2, ataq3);
        int segundoMaior = 0;

        for (int i = 1; i <= 3; i++) {

            if (ataq1 > segundoMaior && ataq1 < maior) {
                segundoMaior = ataq1;
            }
            if (ataq2 > segundoMaior && ataq2 < maior) {
                segundoMaior = ataq2;
            }
            if (ataq3 > segundoMaior && ataq3 < maior) {
                segundoMaior = ataq3;
            }
            if (ataq2 == ataq1 && ataq2 >= 0) {
                segundoMaior = maior;
            }

        }

        return segundoMaior;
    } // Determinar Sequencia de Segundo Maior Ataque Fim.

    static int SegundoMaiorDef(int def1, int def2, int def3) { // Determinar Sequencia de Segundo Maior Defesa
        int maior = MaiorAtaq(def1, def2, def3);
        int segundoMaior = 0;

        for (int i = 1; i <= 3; i++) {

            if (def1 > segundoMaior && def1 < maior) {
                segundoMaior = def1;
            }
            if (def2 > segundoMaior && def2 < maior) {
                segundoMaior = def2;
            }
            if (def3 > segundoMaior && def3 < maior) {
                segundoMaior = def3;
            }
            if (def1 == def2 && def2 >= 0) {
                segundoMaior = maior;
            }

        }

        return segundoMaior;
    } // Determinar Sequencia de Segundo Maior Defesa Fim.

    static int MenorAtaq(int ataq1, int ataq2, int ataq3) { // Determinar Menor Ataque
        int menor = 0;
        for (int i = 1; i <= 3; i++) {
            if (ataq2 < ataq1 || ataq3 < ataq1) {
            } else {
                menor = ataq1;
            }

            if (ataq1 < ataq2 || ataq3 < ataq2) {
            } else {
                menor = ataq2;
            }

            if (ataq1 < ataq3 || ataq2 < ataq3) {
            } else {
                menor = ataq3;
            }

        }
        return menor;

    } // Determinar Menor Ataque Fim.

    static int MenorDef(int def1, int def2, int def3) { // Determinar Menor Defesa
        int menor = 0;
        for (int i = 1; i <= 3; i++) {
            if (def2 < def1 || def3 < def1) {
            } else {
                menor = def1;
            }

            if (def1 < def2 || def3 < def2) {
            } else {
                menor = def2;
            }

            if (def1 < def3 || def2 < def3) {
            } else {
                menor = def3;
            }

        }
        return menor;

    } // Determinar Menor Defesa Fim.

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {

        boolean validarJogada = true;
        while (validarJogada) {
            for (int cont = 1; cont <= 2; cont++) {

                    System.out.println("Escolha Qual Exército deseja jogar, Exército no Ataque (A), Exército na Defesa (D)");
                    String escolha = console.next().toUpperCase();

                try {
                    switch (escolha) {
                        case "A":
                            if (cont == 1){
                                int defesa = Dado.nextInt(3) + 1;
                                int ataque = EntradaAtaque();
                                cont = 2;
                                ImprimirWar(ataque, defesa);
                                break;
                            }
                        case "D":
                            if (cont == 1){
                               int defesa = EntradaDefesa();
                               int ataque = Dado.nextInt(3) + 1;
                                cont = 2;
                                ImprimirWar(ataque, defesa);
                                break;
                            }
                        default:
                            break;

                    }
                } catch (Exception ex) {
                    System.out.println("\n ATENÇÃO ! Comando Inválido, Tente Novamente ! \n\n\n\n");
                    break;
                } 

                if (cont == 2) {
                    System.out.println("\n\n\n\n Desculpe Suas Tentativas Acabaram ! \n\n Deseja Jogar Novamente? Sim ou Não? : ");
                    String jogarNovamente = console.next().toUpperCase();
                    switch (jogarNovamente) {
                        case "SIM":
                        case "S":
                        case "YES":
                        case "Y":
                            validarJogada = true;
                            break;
                        case "NAO":
                        case "NÃO":
                        case "não":
                        case "N":
                        case "NO":
                            validarJogada = false;
                            break;
                        default:
                            System.out.println(" Desculpe Comando Inválido, Reiniciando o jogo......  !");
                            validarJogada = true;
                            break;
                    }
                } else {
                    validarJogada = true;
                }
            }

        }

    } // MAIN com tratamento de Erros

    static int EntradaAtaque() { // Entrada Ataque.
        //ENTRADA

        System.out.println("Escolha Quantidade de Exércitos no Ataque ! (máximo 3 !) :");
        int ataque = console.nextInt();

        return ataque;

    } // Entrada Ataque

    static int EntradaDefesa() { // Entrada Defesa
        System.out.println("Escolha Quantidade de Exércitos na Defesa ! (máximo 3 !) :");
        int defesa = console.nextInt();

        return defesa;

    } // Entrada Defesa fim.

    static String ValidarVencedor(int ataq, int def) { // Validar Vencedor

        if (ataq == 0 || def == 0) {
            return "  -";
        }

        if (ataq > def) {
            return "ATAQUE";
        } else {
            return "DEFESA";
        }

    } // Validar Vencedor fim.

    static Random Dado = new Random(); // Random dos Dados

    static void ImprimirWar(int ataque, int defesa) { // Imprimir jogo WAR
        int ataq1 = 0, ataq2 = 0, ataq3 = 0, def1 = 0, def2 = 0, def3 = 0;
        int MaiorDef, SegundoMaiorDef, MenorDef;
        int MaiorAtaq, SegundoMaiorAtaq, MenorAtaq;

        if (ataque > 3 || defesa > 3 || ataque <= 0 || defesa <= 0) {
            System.out.println("Não é Possível mais do que 3 Exércitos");
        } else {

            switch (ataque) {
                case 1:
                    ataq1 = Dado.nextInt(6) + 1;

                    break;
                case 2:
                    ataq1 = Dado.nextInt(6) + 1;
                    ataq2 = Dado.nextInt(6) + 1;

                    break;
                case 3:
                    ataq1 = Dado.nextInt(6) + 1;
                    ataq2 = Dado.nextInt(6) + 1;
                    ataq3 = Dado.nextInt(6) + 1;

                    break;
            }

            switch (defesa) {
                case 1:
                    def1 = Dado.nextInt(6) + 1;

                    break;
                case 2:
                    def1 = Dado.nextInt(6) + 1;
                    def2 = Dado.nextInt(6) + 1;

                    break;
                case 3:
                    def1 = Dado.nextInt(6) + 1;
                    def2 = Dado.nextInt(6) + 1;
                    def3 = Dado.nextInt(6) + 1;
                    break;
            }
            MaiorDef = MaiorDef(def1, def2, def3);
            SegundoMaiorDef = SegundoMaiorDef(def1, def2, def3);
            MenorDef = MenorDef(def1, def2, def3);

            MaiorAtaq = MaiorAtaq(ataq1, ataq2, ataq3);
            SegundoMaiorAtaq = SegundoMaiorAtaq(ataq1, ataq2, ataq3);
            MenorAtaq = MenorAtaq(ataq1, ataq2, ataq3);

            String VencedorMaior = ValidarVencedor(MaiorAtaq, MaiorDef);
            String VencedorSegundoMaior = ValidarVencedor(SegundoMaiorAtaq, SegundoMaiorDef);
            String VencedorMenor = ValidarVencedor(MenorAtaq, MenorDef);

            // TESTES DE ERROS DO JOGO
            /*System.out.println("Ataque 1: " + ataq1);
            System.out.println("Ataque 2: " + ataq2);
            System.out.println("Ataque 3: " + ataq3);
            System.out.println("Defesa 1: " + def1);
            System.out.println("Defesa 2: " + def2);
            System.out.println("Defesa 3: " + def3);

            System.out.println("Maior ataque -> " + MaiorAtaq);
            System.out.println("Segundo Ataque -> " + SegundoMaiorAtaq);
            System.out.println("Menor Ataque -> " + MenorAtaq);
            System.out.println("");
            System.out.println("Maior Defesa -> " + MaiorDef);
            System.out.println("Segundo Defesa -> " + SegundoMaiorDef);
            System.out.println("Menor Defesa -> " + MenorDef);*/
            System.out.println("\n\n\n\n\n\n");
            System.out.println("DADOS    ||     ATAQUE   ||     DEFESA    ||   VENCEDOR  ");
            System.out.println("---------||--------------||---------------||-------------");
            System.out.printf("MAIOR    ||      %s       ||      %s        ||    %s      \n", MaiorAtaq == 0 ? "-" : MaiorAtaq + "", MaiorDef == 0 ? "-" : MaiorDef + "", VencedorMaior);
            System.out.println("---------||--------------||---------------||-------------");
            System.out.printf("2°MAIOR  ||      %s       ||      %s        ||    %s         \n", SegundoMaiorAtaq == 0 ? "-" : SegundoMaiorAtaq + "", SegundoMaiorDef == 0 ? "-" : SegundoMaiorDef + "", VencedorSegundoMaior);
            System.out.println("---------||--------------||---------------||-------------");
            System.out.printf("MENOR    ||      %s       ||      %s        ||    %s        \n", MenorAtaq == 0 ? "-" : MenorAtaq + "", MenorDef == 0 ? "-" : MenorDef + "", VencedorMenor);
            System.out.println("---------||--------------||---------------||-------------");

            int ataqueWin = 0, defesaWin = 0;
            if (VencedorMaior.equals("ATAQUE") && VencedorSegundoMaior.equals("ATAQUE")) {
                ataqueWin = 2;
            } else if (VencedorMaior.equals("ATAQUE")) {
                ataqueWin = 1;
            } else if (VencedorMaior.equals("DEFESA") && VencedorSegundoMaior.equals("DEFESA")) {
                defesaWin = 2;
            } else if (VencedorMaior.equals("DEFESA")) {
                defesaWin = 1;
            } else if (VencedorMaior.equals("ATAQUE") && VencedorSegundoMaior.equals("ATAQUE") && VencedorMenor.equals("ATAQUE")) {
                ataqueWin = 3;
            } else if (VencedorMaior.equals("DEFESA") && VencedorSegundoMaior.equals("DEFESA") && VencedorMenor.equals("DEFESA")) {
                defesaWin = 3;
            }

            switch (ataqueWin) {
                case 1:
                    System.out.println("\n O ATAQUE SAIU VENCEDOR DESSA PARTIDA !! Com apenas 2 Exércitos Peridos \n\n\n\n\n\n ");
                    break;
                case 2:
                    System.out.println("\n O ATAQUE SAIU VENCEDOR DESSA PARTIDA !! Com apenas 1 Exército Perido \n\n\n\n\n\n ");
                    break;
                case 3:
                    System.out.println("\n O ATAQUE SAIU VENCEDOR DESSA PARTIDA !! Com Nenhum Exército perido ! \n\n\n\n\n\n ");
                    break;
            }
            switch (defesaWin) {
                case 1:
                    System.out.println("\n A DEFESA SAIU VENCEDOR DESSA PARTIDA !! Com apenas 2 Exércitos Peridos \n\n\n\n\n\n ");
                    break;
                case 2:
                    System.out.println("\n A DEFESA SAIU VENCEDOR DESSA PARTIDA !! Com apenas 1 Exércitos Peridos \n\n\n\n\n\n ");
                    break;
                case 3:
                    System.out.println("\n A DEFESA SAIU VENCEDOR DESSA PARTIDA !! Com Nenhum Exército perido ! \n\n\n\n\n\n ");
                    break;
            }

        }
    } // Imprimir jogo WAR fim.

}

