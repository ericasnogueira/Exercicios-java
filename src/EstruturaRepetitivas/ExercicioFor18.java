package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor18 {
    public static void main(String[] args) {
        /*
        Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
        teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada
         um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o
          terceiro valor tem peso 5.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        double total;
        for(int i =1 ; i<= n; i++) {
            double numero1 = entrada.nextDouble();
            double numero2 = entrada.nextDouble();
            double numero3 = entrada.nextDouble();

            total = ((numero1 * 2) + (numero2 * 3) + (numero3 * 5))/10;
            System.out.printf("%.1f", total);
        }
    }

}
