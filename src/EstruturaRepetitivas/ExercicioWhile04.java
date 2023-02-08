package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioWhile04 {
    public static void main(String[] args) {
        /*
            Fa�a um programa que mostre os n�meros pares entre 1 e 100, inclusive.
         */
        Scanner entrada = new Scanner(System.in);

        int numero = 2;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
