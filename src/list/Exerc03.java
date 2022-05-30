/*
* Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final
da entrada dos 5 itens, exiba a lista completa.
*/

package list;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {

        ArrayList<Lista> item = new ArrayList<Lista>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Insira a sua lista de compras: ");

        String item = scan.nextLine();
        Lista a = new Lista();
        item.add(a);

        for (int i = 0; i < Lista.length; i++){
            System.out.println(Lista[i]);
        }

        System.out.println("As frutas no seu carrinho são: " + Lista);

    }
}
