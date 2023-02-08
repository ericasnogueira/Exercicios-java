package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor07 {
    public static void main(String[] args) {
        /*
            Ler um n�mero inteiro N e calcular todos os seus divisores.
         */
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.println(i);
            }
        }

    }
}
