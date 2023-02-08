package EstruturaRepetitivas;

import java.util.Scanner;

public class ExerciciosWhile01 {
    public static void main(String[] args) {
        /*
        Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
        incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
         */

        Scanner entrada = new Scanner(System.in);
        int senha;

        senha = entrada.nextInt();
        ;

        while (senha != 2002) {
            System.out.println("Senha Invalida");

            //chamanda a leitura de entrada novamente para n�o ficar no loop infinito
            senha = entrada.nextInt();
        }
        System.out.println("Acesso Permitido");
    }
}
