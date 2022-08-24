package EstrututaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
        Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população,
        sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.

        Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        duas casas decimais.
         */
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double salario ;
        double imposto = 0;
        double diferenca;

        salario = entrada.nextDouble();

        if(salario > 4500){
            imposto = 1000 * 0.08 + 1500 * 0.18;
            diferenca = salario - 4500;
            imposto = imposto + diferenca * 0.28; // imposto += diferenca * 0.28;
        } else if (salario > 3000) {
            imposto = 1000 * 0.08;
            diferenca = salario - 3000;
            imposto = imposto + diferenca * 0.18;
        } else if (salario > 2000) {
            diferenca = salario - 2000;
            imposto = diferenca * 0.08;
        }
        if (imposto > 0){
            System.out.println("R$ " + imposto);
        } else {
            System.out.println("Isento");
        }


    }
}
