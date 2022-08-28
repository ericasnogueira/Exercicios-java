package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno.
         A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5
         (A soma dos pesos portanto é 11). Assuma que cada nota
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double valor1 = entrada.nextDouble();
        double valor2 = entrada.nextDouble();
        //11 = soma dos pesos
        double media = ((valor1 * 3.5 )+ (valor2 * 7.5) )/ 11;

        System.out.printf("MEDIA = %.5f", media);
    }
}
