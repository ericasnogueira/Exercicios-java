package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor10 {
    public static void main(String[] args) {
        /*
        Fa�a um programa que leia 5 valores inteiros. Conte quantos destes valores digitados s�o pares e
         mostre esta informa��o.
         */
        Scanner entrada = new Scanner(System.in);

        int par = 0;

        for (int i = 1; i <= 5; i++) {
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                par += 1;
            }
        }
        System.out.println(par + " valores pares");
    }
}
