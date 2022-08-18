package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário,
        com duas casas decimais.
         */

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numeroFuncionario ;
        double horas, salario, salarioFuncionario ;

        numeroFuncionario = input.nextInt();
        horas = input.nextDouble();
        salario = input.nextDouble();

        salarioFuncionario = horas * salario;

        System.out.println("Número Funcionario = " + numeroFuncionario);
        System.out.printf("Salario = U$ %.2f" , salarioFuncionario);


    }
}
