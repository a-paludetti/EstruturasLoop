/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasloop;

/**
 *
 * @author aline.poliveira3
 */
public class Es_03 {

    public static void main(String[] args) {
        double soma = 0;
        double numero = 1;

        for (int i = 1; i <= 10000; i++) {
            soma = soma + numero;
            numero = numero + (1 / (numero + 2));
        }
        System.out.printf("%.2f", soma);
    }
}
