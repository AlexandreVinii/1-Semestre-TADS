/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudando;

import java.util.Random;

/**
 *
 * @author Alexandre
 */
public class Pv1 {

    public static void main(String[] args) {

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        Random random = new Random();
        int menorA = 10, menorB = 10;

        vetorA[0] = random.nextInt(10) + 1;
        vetorA[1] = random.nextInt(10) + 1;
        vetorA[2] = random.nextInt(10) + 1;
        vetorA[3] = random.nextInt(10) + 1;
        vetorA[4] = random.nextInt(10) + 1;

        vetorB[0] = random.nextInt(10) + 1;
        vetorB[1] = random.nextInt(10) + 1;
        vetorB[2] = random.nextInt(10) + 1;
        vetorB[3] = random.nextInt(10) + 1;
        vetorB[4] = random.nextInt(10) + 1;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] < menorA) {
                menorA = vetorA[i];
            }

        }
        for (int i = 0; i < vetorB.length; i++) {
            if (vetorB[i] < menorB) {
                menorB = vetorB[i];
            }

        }
        
        System.out.println("O menor nÃºmero do vetor A dividido pelo menor do vetor B Ã©: "+menorA/menorB);
    }

}