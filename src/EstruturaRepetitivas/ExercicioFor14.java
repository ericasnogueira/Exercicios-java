package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor14 {
    public static void main(String[] args) {
        /*
        Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 até N, inclusive N,
        se for o caso.
         */
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        for(int i =1; i <=numero;i++){
            if(i % 2 ==0)
                System.out.println(i + "^2 = " + (i *i));
        }
    }
}
