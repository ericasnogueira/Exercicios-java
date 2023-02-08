package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor02 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha,
         inclusive o X, se for o caso.
         */

        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();

        for (int x = 1; x <= num; x++) {
            if (x % 2 == 1) {
                System.out.println(x);
            }
        }
    }
}
