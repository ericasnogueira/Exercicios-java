package EstrututaCondicional;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser
        digitados em ordem crescente ou decrescente.
         */
        Scanner entrada = new Scanner(System.in);
        int a,b ;
        a = entrada.nextInt();
        b = entrada.nextInt();

        // || = ou
        if (a % b == 0 || b % a == 0){
            System.out.println("SÃO MULTIPLOS");
        } else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }

    }
}
