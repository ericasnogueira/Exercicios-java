package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioWhile06 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro X. Em seguida apresente os 6 valores �mpares consecutivos a partir de X,
        um valor por linha, inclusive o X ser for o caso.
         */
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int cont = 0;

        while (cont < 6) {
            if (numero % 2 == 1) {
                System.out.println(numero);
                cont++;
            }
            numero++;
        }

    }
}
