package poo.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Entre com a altura e largura");
        retangulo.largura = entrada.nextDouble();
        retangulo.altura = entrada.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

    }
}
