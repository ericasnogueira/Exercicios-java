package EstrututaCondicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
         */
        Scanner entrada = new Scanner(System.in);

        int numero;

        numero = entrada.nextInt();

        if(numero % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

    }
}
