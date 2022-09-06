package EstrututaCondicional;

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        /*
        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
        "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.
         */
        Scanner entrada =  new Scanner(System.in);

        int a = entrada.nextInt();
        int b = entrada.nextInt();

        if (a % b == 0 || b % a ==0){
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
