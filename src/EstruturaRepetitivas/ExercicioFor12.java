package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor12 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha,
         inclusive o X, se for o caso.
         */
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
