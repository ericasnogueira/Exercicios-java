package poo.exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        Peca peca = new Peca();

        peca.codigo1 = entrada.nextDouble();
        peca.numero1 = entrada.nextDouble();
        peca.valor1 = entrada.nextDouble();

        peca.codigo2 = entrada.nextDouble();
        peca.numero2 = entrada.nextDouble();
        peca.valor2 = entrada.nextDouble();

        System.out.println(peca.toString());
    }
}
