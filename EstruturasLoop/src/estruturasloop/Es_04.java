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
public class Es_04 {

    public static void main(String[] args) {
        double pi = 1;
        double pisoma = 0;
        for (int i = 1; i <= 10000; i++) {
            pisoma = +(1 / (pi + 2)) - (1 / (pi + 4));
            pi = pi + 6;
        }
        pisoma = (pisoma + 1) / 4;

        System.out.println(pisoma);
    }
}
