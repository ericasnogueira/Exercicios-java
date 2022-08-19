package EstrututaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
            Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo
            que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora
             e máxima de 24 horas.
         */
        Scanner a = new Scanner(System.in);

        int inicial;
        int horaFinal;

        inicial = a.nextInt();
        horaFinal = a.nextInt();


        int duracao ;
        if(horaFinal > inicial){
            duracao = horaFinal - inicial;
        } else {
            duracao = 24 - inicial + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORAS(s)");

    }
}
