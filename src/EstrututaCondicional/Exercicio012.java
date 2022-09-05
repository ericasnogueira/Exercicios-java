package EstrututaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio012 {
    public static void main(String[] args) {
        /*
        Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
        Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
        Perimetro = XX.X
        Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double perimetro = a + b + c;
        double areaTrapezio  = ((a + b) * c) / 2;
        if(a < (b +c) && (b -c) < a){
            System.out.printf("Perimetro = %.1f", perimetro);
        } else if ( b < (a + c) && (a - c) < b) {
            System.out.printf("Perimetro = %.1f", perimetro);
        } else if (c < (a + b) && (a -b ) < c) {
            System.out.printf("Perimetro = %.1f", perimetro);
        } else {
            System.out.printf("Area = %.1f", areaTrapezio);
        }

    }
}
