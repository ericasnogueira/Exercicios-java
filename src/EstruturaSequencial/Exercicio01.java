package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses n�meros com uma
            mensagem explicativa, conforme exemplos.
         */
        Scanner entrada = new Scanner(System.in);
        int primeiro;
        int segundo;
        int soma;

        primeiro = entrada.nextInt();
        segundo = entrada.nextInt();
        soma = primeiro + segundo;

        System.out.println("SOMA : " + soma);




    }
}
