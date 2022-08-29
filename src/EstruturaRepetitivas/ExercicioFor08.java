package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor08 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        exemplo
         */
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        for(int i = 1; i<= numero;i ++){
            int a;
            a = i;
            int c = a * i ;
            int b = i * c;

            System.out.println(i + " " + c + " " + b);

        }
    }
}
