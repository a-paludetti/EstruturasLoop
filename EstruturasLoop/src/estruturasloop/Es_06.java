/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasloop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wynter
 */
public class Es_06 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        Random rnd = new Random();
        int numero = rnd.nextInt(10);

        System.out.print("Adivinhe o número: ");
        int adv = NN.nextInt();

        do {
            if (adv > numero) {
                System.out.printf("%d é maior, tente novamente: ", adv);
                adv = NN.nextInt();
            } else {
                System.out.printf("%d é menor, tente novamente: ", adv);
                adv = NN.nextInt();
            }
        } while (adv != numero);
        if (adv == numero) {
            System.out.println("Parabéns, você acertou!");
        }
    }
}
