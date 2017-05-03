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
public class Es_09 {

    public static void main(String[] args) {

    }

    public static String leitor() {
        Scanner console = new Scanner(System.in);
        String N1 = console.nextLine();
        return N1;
    }

    public static String[][] matriz(int linha, int coluna) {
        String[][] matrix = new String[linha][coluna];
        return matrix(linha, coluna);
    }
    
    public static int[][] matrizPreencher(String[][]){
        
        
        for (int i = 0; i < matriz1.length; i++) { //<-- mudança de linhas
            for (int j = 0; j < matriz1[i].length; j++) { //<--mudança de colunas
                matriz1[i][j] = "1 ";
                System.out.print(matriz1[i][j]); //<-- print das colunas da linha [i]
            }
            System.out.println(""); //<-- print das linhas
        }
    }

}
