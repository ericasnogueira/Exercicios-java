package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor08 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
        come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
        exemplo
         */
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        for (int i = 1; i <= numero; i++) {
            int a;
            a = i;
            int c = a * i;
            int b = i * c;

            System.out.println(i + " " + c + " " + b);

        }
    }
}
