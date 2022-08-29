package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor09 {
    public static void main(String[] args) {
       /*
        Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
        Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito
        após o ponto decimal.
         */
        ///OBS : TEM UMA VERSÃO DESSE EXERCICIO COM WHILE (exercicioWhile05)


        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double numero ;
        int positivo = 0;
        double media = 0;

        for(int i = 1; i <= 6 ;i++){
            numero = entrada.nextDouble();

            if(numero > 0) {
                positivo += 1;
                media += numero;
            }
        }
        double total = media / positivo;
        System.out.println(positivo + " valores positivos");
        System.out.printf("%.1f", total);

    }
}
