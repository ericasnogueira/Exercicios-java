package EstrututaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        Se o ponto estiver na origem, escreva a mensagem “Origem”.
        Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        situação.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double d1,d2;

        d1 = entrada.nextDouble();
        d2 = entrada.nextDouble();

        if(d1 > 0 && d2 > 0){
            System.out.println("Q1");
        } else if (d1 < 0 && d2 > 0) {
            System.out.println("Q2");
        } else if (d1 < 0 && d2 < 0) {
            System.out.println("Q3");
        } else if (d1 > 0 && d2 < 0){
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }


    }
}
