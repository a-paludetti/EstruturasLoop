/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasloop;

import java.util.Scanner;

/**
 *
 * @author Wynter
 */
public class Es_05 {
    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        String numero = NN.nextLine();
        
        int soma = 0;
        
        for (int i = 0; i <= numero.length()-1;i++){
            int n1 = Integer.parseInt(numero.substring(i, i+1));
            int n2 = numero.length()-i;
            int n3 = n1 * n2;
            soma = soma +n3; 
            
        }
        System.out.println("soma dos números igual: "+soma);
    }
}
