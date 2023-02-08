package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor06 {
    public static void main(String[] args) {
        /*
        Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por defini��o, fatorial de 0 � 1.
         */
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        int fat = 1;
        for (int i = 1; i <= numero; i++) {
            fat = fat * i;

        }
        System.out.println(fat);
    }
}
