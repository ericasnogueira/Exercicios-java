package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
            Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua
            esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.
         */
        Scanner entrada = new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);


    }
}
