package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor17 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o lidos em seguida.
        Para cada valor lido, mostre uma mensagem em ingl�s dizendo se este valor lido � par (EVEN),
        �mpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0),
        embora a descri��o correta seja (EVEN NULL), pois por defini��o zero � par, seu programa dever� imprimir
         apenas NULL.
         */
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            int n = entrada.nextInt();

            if (n % 2 == 0 && n > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (n % 2 == 0 && n < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (n % 2 == 1 && n > 0) {
                System.out.println("ODD POSITIVE");
            } else if (n == 0) {
                System.out.println("NULL");
            } else {
                System.out.println("ODD NEGATIVE");
            }
        }
    }

}

