package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
        Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um
        aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C
         tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
         */

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double total = ((a*2)+(b*3)+(c*5))/10;
        System.out.printf("MEDIA = %.1f", total);

        entrada.close();
    }
}
