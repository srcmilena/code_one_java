/*
* Escreva um programa que informa a tabuada de multiplicação de um número informado pelo usuário (entre 1-10).
*/
package list;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um número de 1 a 10: ");
        int numero = scan.nextInt();

        if (numero >= 1 && numero <= 10) {

            System.out.println("A tabuada do " + numero + " é: ");
            for (int j = 1; j <= 10; j++) {

                System.out.println(numero + " x " + j + " = " + j * numero);
            }
        } else {
            System.out.print("Número fora dos valores permitidos");
        }
    }
}
