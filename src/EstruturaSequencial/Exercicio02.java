package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
        Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea
        deste c�rculo com quatro casas decimais conforme exemplos.
         */
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double raio ;
        double pi = 3.14159;

        raio = input.nextDouble();

        double area = pi * (raio * raio);

        // %.quantas casas decimaisf
        System.out.printf("A = %.4f", area);

    }
}
