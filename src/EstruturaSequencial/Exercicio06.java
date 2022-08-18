package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
        mostre:
            a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
            b) a �rea do c�rculo de raio C. (pi = 3.14159)
            c) a �rea do trap�zio que tem A e B por bases e C por altura.
            d) a �rea do quadrado que tem lado B.
               e) a �rea do ret�ngulo que tem lados A e B
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a, b, c;
        double pi = 3.14159;

        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble();

        double triangulo = a * c / 2.0;
        double circulo = pi * c * c;
        double trapezio = (a + b) / 2.0 * c ;
        double quadrado = b * b;
        double retangulo = a * b ;

        System.out.printf("TRIANGULO = %.3f" , triangulo);
        System.out.printf("\nCIRCULO = %.3f", circulo);
        System.out.printf("\nTRAPEZIO = %.3f", trapezio);
        System.out.printf("\nQUADRADO = %.3f" , quadrado);
        System.out.printf("\n2RETANGULO = %.3f" , retangulo);

    }
}
