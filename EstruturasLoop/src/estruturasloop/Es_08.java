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
public class Es_08 {

    public static void main(String[] args) {
        String[][] matriz1 = new String[3][3]; //<-- nova matriz com 9 posições (3 linhas e 3 colunas)

        for (int i = 0; i < matriz1.length; i++) { //<-- mudança de linhas
            for (int j = 0; j < matriz1[i].length; j++) { //<--mudança de colunas
                matriz1[i][j] = "1 ";
                System.out.print(matriz1[i][j]); //<-- print das colunas da linha [i]
            }
            System.out.println(""); //<-- print das linhas
        }

    }

}
