package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor13 {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos n�meros impares entre eles.
         */
        Scanner entrada = new Scanner(System.in);

        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int soma = 0;

        if (numero1 < numero2) {
            for (int i = numero1 + 1; i < numero2; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        } else {
            for (int i = numero2 + 1; i < numero1; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}