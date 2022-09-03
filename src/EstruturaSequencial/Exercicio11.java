package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
         * Leia quatro n�meros (N1, N2, N3, N4), cada um deles com uma casa decimal,
         * correspondente �s quatro notas de um
         * aluno. Calcule a m�dia com pesos 2, 3, 4 e 1, respectivamente, para cada uma
         * destas notas e mostre esta m�dia
         * acompanhada pela mensagem "Media: ". Se esta m�dia for maior ou igual a 7.0,
         * imprima a mensagem "Aluno aprovado.
         * ". Se a m�dia calculada for inferior a 5.0, imprima a mensagem "Aluno
         * reprovado.". Se a m�dia calculada for um
         * valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem
         * "Aluno em exame.".
         * 
         * No caso do aluno estar em exame, leia um valor correspondente � nota do exame
         * obtida pelo aluno. Imprima
         * ent�o a mensagem "Nota do exame: " acompanhada pela nota digitada. Recalcule
         * a m�dia (some a pontua��o do
         * exame com a m�dia anteriormente calculada e divida por 2). e imprima a
         * mensagem "Aluno aprovado." (caso a
         * m�dia final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso a m�dia tenha
         * ficado 4.9 ou menos). Para estes
         * dois casos (aprovado ou reprovado ap�s ter pego exame) apresente na �ltima
         * linha uma mensagem "Media final:
         * " seguido da m�dia final para esse aluno.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double nota3 = entrada.nextDouble();
        double nota4 = entrada.nextDouble();

        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;

        if (media >= 7.0) {
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.printf("Media: %.1f%n", media);;
            System.out.println("Aluno reprovado.");
        } else if (media >= 5.0 && media <= 6.9) {
            double exame = entrada.nextDouble();
            double novaNota = (media + exame) / 2;
            System.out.printf("Media: %.1f%n", media);
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f%n", exame);
            if (novaNota >= 5.0) {
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado");
            }
            System.out.printf("Media final: %.1f%n", novaNota);
        }

    }
}
