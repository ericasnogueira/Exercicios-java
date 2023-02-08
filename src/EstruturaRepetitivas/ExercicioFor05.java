package EstruturaRepetitivas;

import java.util.Scanner;

public class ExercicioFor05 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e mostre a divis�o do primeiro pelo
        segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
         */
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        for (int i = 0; i < numero; i++) {
            double a = entrada.nextDouble();
            double b = entrada.nextDouble();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                double total = a / b;
                System.out.println(total);
            }

        }
    }
}
