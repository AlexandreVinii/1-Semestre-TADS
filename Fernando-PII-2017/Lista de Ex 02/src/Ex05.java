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
public class Ex05 {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int num = 100;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0) {
            System.out.println(num);
        }
        num--;
    }
    }
}
