package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a
        do produto de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
         */
        Scanner input = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        diferenca = (a * b - c * d);
        System.out.println("DIFEREN�A = " + diferenca);


    }
}
