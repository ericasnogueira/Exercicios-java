package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor11 {
    public static void main(String[] args) {
        /*
        Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados
        foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.
         */
        Scanner entrada = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;
        int par = 0;
        int impar =0;

        for(int i =1; i<=5 ;i ++){
            int numero = entrada.nextInt();
            if(numero > 0 ){
                positivo += 1;
            }else {
                negativo +=1;
            }
            if(numero % 2 ==0){
                par +=1;
            }else {
                impar += 1;
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
