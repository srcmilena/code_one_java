/*
* Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C ×
9/5) + 32 = 32 °F.
*/
package list;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit: ");
        float tempCelsius = scan.nextFloat();

        float tempFahrenheit = (tempCelsius * 9/5) + 32;

        if (tempCelsius > 0) {

            System.out.println("O equivalente em Fahrenheit é: " + tempFahrenheit);
        }
    }
}
