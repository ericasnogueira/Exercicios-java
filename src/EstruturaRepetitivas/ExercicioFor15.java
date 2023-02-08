package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor15 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Apresente todos os n�meros entre 1 e 10000 que divididos por N d�o resto igual a 2.
         */
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        for (int i = 1; i <= 10000; i++) {
            if (i % numero == 2) {
                System.out.println(i);
            }
        }
    }
}
