package EstrututaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
            Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int numero;

        numero = entrada.nextInt();

        //vendo se o numero � positivo ou negativo

        if (numero >= 0){
            System.out.println("N�O NEGATIVO"); //positivo
        } else {
            System.out.println("NEGATIVO"); // NEGATIVO
        }
    }
}
