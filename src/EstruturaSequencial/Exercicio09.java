package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double total, salario, vendas;

        String nome = entrada.nextLine();
        salario = entrada.nextDouble();
        vendas = entrada.nextDouble();
        total = salario + vendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f", total);
    }
}
