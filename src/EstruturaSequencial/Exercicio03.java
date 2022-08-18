package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença
        do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
         */
        Scanner input = new Scanner(System.in);

        int a, b, c, d, diferenca;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        diferenca = (a * b - c * d);
        System.out.println("DIFERENÇA = " + diferenca);


    }
}
