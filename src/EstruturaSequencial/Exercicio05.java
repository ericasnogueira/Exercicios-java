package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
       /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         Calcule e mostre o valor a ser pago
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int codigoPeca1, codigoPeca2;
        double numeroPeca1, valor1, numeroPeca2, valor2 ;

        //lendo peça 1
        codigoPeca1 = entrada.nextInt();
        numeroPeca1 = entrada.nextDouble();
        valor1 = entrada.nextDouble();

        //lendo peça 2
        codigoPeca2 = entrada.nextInt();
        numeroPeca2 = entrada.nextDouble();
        valor2 = entrada.nextDouble();

        //calculo
        double valorPagar;
        valorPagar = (numeroPeca1 * valor1) + (numeroPeca2 * valor2);


        System.out.println("CODIGOS DAS PEÇAS :" + codigoPeca1 + " === " + codigoPeca2 );

        System.out.printf("VALOR A PAGAR = %.2f", valorPagar);
    }
}