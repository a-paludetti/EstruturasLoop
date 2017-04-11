/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasloop;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class Es_01 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("digite um número: ");
        String n1 = NN.nextLine();
        System.out.println(n1.length());

        double soma = 0;

        for (int i = 0; i <= (n1.length() - 1); i++) {
            double n2 = Double.parseDouble(n1.substring(i,(i+1)));
            soma = soma + n2;
        }

        System.out.print("total: " + soma);
        System.out.println("");
    }

}
