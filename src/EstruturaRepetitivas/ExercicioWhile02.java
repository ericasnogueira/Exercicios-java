package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioWhile02 {
    public static void main(String[] args) {

        /*
        Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
         */
        Scanner entrada = new Scanner(System.in);
        int primeiro,segundo;

        primeiro = entrada.nextInt();
        segundo = entrada.nextInt();

        while (primeiro != 0 || segundo !=0){
            if (primeiro > 0 && segundo > 0){
                System.out.println("primeiro");
            } else if (primeiro < 0 && segundo > 0) {
                System.out.println("segundo");
            } else if (primeiro < 0 && segundo < 0) {
                System.out.println("terceiro");
            } else if(primeiro > 0 && segundo < 0){
                System.out.println("quarto");
            } else {
                break;
            }
            primeiro = entrada.nextInt();
            segundo = entrada.nextInt();
        }
    }
}
