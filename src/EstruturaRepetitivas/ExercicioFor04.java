package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor04 {
    public static void main(String[] args) {
        /*
            Leia 1 valor inteiro N, que representa o n�mero de casos de teste que vem a seguir. Cada caso de teste
             consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a m�dia ponderada para
              cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso
               3 e o terceiro valor tem peso 5.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);


        int numero = entrada.nextInt();
        for (int i = 0; i < numero; i++) {
            double teste1 = entrada.nextDouble();
            double teste2 = entrada.nextDouble();
            double teste3 = entrada.nextDouble();

            double total = ((teste1 * 2) + (teste2 * 3) + (teste3 * 5)) / 10; //2+3+5

            System.out.printf("%.1f", total);
        }

        entrada.close();
    }
}
