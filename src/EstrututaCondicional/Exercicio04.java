package EstrututaCondicional;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
            Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo
            que o mesmo pode come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora
             e m�xima de 24 horas.
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
