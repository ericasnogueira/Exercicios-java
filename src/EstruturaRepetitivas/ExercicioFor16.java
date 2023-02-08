package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor16 {
    public static void main(String[] args) {
        /*
        Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
        1 x N = N      2 x N = 2N        ...       10 x N = 10N
         */
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int somo = i * numero;
            System.out.println(i + " x " + numero + " = " + somo);
        }
    }
}
