package EstruturaRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        /*
        Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos
        (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.
         */
        Scanner entrada = new Scanner(System.in);
        int positivo =0 ;

        for(int i = 0; i< 6 ; i++){
            double numero = entrada.nextDouble() ;
            if (numero > 0){
                positivo += 1;
            }
        }

        System.out.println( positivo +" valores positivos");

    }
}
