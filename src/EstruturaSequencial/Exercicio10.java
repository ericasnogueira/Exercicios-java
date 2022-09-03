package EstruturaSequencial;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
        Pedrinho está organizando um evento em sua Universidade. O evento deverá ser no mês de Abril, iniciando e
        terminando dentro do mês. O problema é que Pedrinho quer calcular o tempo que o evento vai durar, uma vez que
         ele sabe quando inicia e quando termina o evento. Sabendo que o evento pode durar de poucos segundos a vários
         dias, você deverá ajudar Pedrinho a calcular a duração deste evento.
            Entrada :
        Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um espaço e o dia do mês no qual o
        evento vai  começar. Na linha seguinte, será informado o momento no qual o evento vai iniciar, no
        formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação no mesmo  formato das duas
        primeiras linhas, indicando o término do evento.
         */
        Scanner entrada = new Scanner(System.in);
        int d1,h1,m1,s1;
        int d2,h2,m2,s2;
        String texto;


        d1 = entrada.nextInt();
        h1 = entrada.nextInt();
        m1 = entrada.nextInt();
        s1 = entrada.nextInt();


        d2 = entrada.nextInt();
        h2 = entrada.nextInt();
        m2 = entrada.nextInt();
        s2 = entrada.nextInt();

        int q1, q2;
        q1 = s1 + m1*60 + h1 * 60* 60+ d1 * 60*60*24;
        q2 = s2 + m2*60 + h2 * 60* 60+ d2 * 60*60*24;
        int tempo = q2 - q1;

        System.out.println(tempo/(60*60*24) + " dia(s)");
        tempo = tempo%(60*60*24);
        System.out.println(tempo/(60*60)+" hora(s)");
        tempo = tempo%(60*60);
        System.out.println(tempo/(60)+" minutos(s)");
        tempo = tempo%(60);
        System.out.println(tempo+" segundos(s)");




    }
}
