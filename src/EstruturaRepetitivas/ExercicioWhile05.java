package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioWhile05 {
    public static void main(String[] args) {
        /*
        Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
        Na pr�xima linha, deve-se mostrar a m�dia de todos os valores positivos digitados, com um d�gito
        ap�s o ponto decimal.
         */
        ///OBS : TEM UMA VERS�O DESSE EXERCICIO COM FOR (exerciciofor09)
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double numero;
        int quantidade = 1;
        int positivo = 0;
        double media = 0;

        while (quantidade <= 6) {
            numero = entrada.nextDouble();

            if (numero > 0) {
                positivo += 1;
                media += numero;
            }
            quantidade++;
        }
        double total = media / positivo;
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f", total);
    }
}
