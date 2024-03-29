package EstrututaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        Voc� deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor n�o
        estiver em nenhum destes intervalos, dever� ser impressa a mensagem �Fora de interval
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double valor = entrada.nextDouble();

        if (valor >= 0 && valor <= 25){
            System.out.println("Intervalo [0,25]");
        }
        else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (valor > 50 && valor <= 75) {
            System.out.println();
        }
        else if (valor >  75 && valor <= 100) {
            System.out.println("Intervalo (75,100]");
        } else  {
            System.out.println("Fora de intervalo");
        }
    }
}
