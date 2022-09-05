package EstrututaCondicional;

import java.util.Scanner;

public class Exercicio011 {
    public static void main(String[] args) {
        /*
        Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma
        linha em branco e em seguida, os valores na sequência como foram lidos.
         */
        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        int n3 = entrada.nextInt();


        if(n1 > n2){
            System.out.println(n1);
            if (n2 > n3){
                System.out.println(n2);
                System.out.println(n3);
            }else {
                System.out.println(n3);
                System.out.println(n2);
            }
        } else if (n2 > n3) {
            System.out.println();
               if (n3 > n1) {
                   System.out.println(n3);
                   System.out.println(n1);
               } else {
                   System.out.println(n1);
                   System.out.println(n3);
               }
        } else  {
            System.out.println(n3);
            if (n1 > n2){
                System.out.println(n1);
                System.out.println(n2);
            } else {
                System.out.println(n2);
                System.out.println(n1);
            }
        }
        System.out.println();
        //valores na sequência que foram lidos
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}
