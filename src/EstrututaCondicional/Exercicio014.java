package EstrututaCondicional;

import java.util.Scanner;

public class Exercicio014 {
    public static void main(String[] args) {
        /*
        Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo,
         da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das
         três palavras fornecidas.
         */
        Scanner entrada = new Scanner(System.in);

        String animal1 = entrada.next();
        String animal2 = entrada.next();
        String animal3 = entrada.next();

        // .equals é como se fosse o == para string .

        if(animal1.equals("vertebrado") && animal2.equals("ave") && animal3.equals("carnivoro")){
            System.out.println("aguia");
        } else if (animal1.equals("vertebrado") && animal2.equals("ave") && animal3.equals("onivoro")) {
            System.out.println("pomba");
        } else if (animal1.equals("vertebrado") && animal2.equals("mamifero") && animal3.equals("onivoro")) {
            System.out.println("homem");
        } else if (animal1.equals("vertebrado") && animal2.equals("mamifero") && animal3.equals("herbivero")) {
            System.out.println("vaca");            
        } else if (animal1.equals("invertebrado") && animal2.equals("inseto") && animal3.equals("hematofago")) {
            System.out.println("pulga");
        } else if (animal1.equals("invertebrado") && animal2.equals("inseto") && animal3.equals("herbivoro")) {
            System.out.println("lagarta");
        } else if (animal1.equals("invertebrado") && animal2.equals("anelideo") && animal3.equals("hematofago")) {
            System.out.println("sanguessuga");
        } else if (animal1.equals("invertebrado") && animal2.equals("anelideo") && animal3.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}
