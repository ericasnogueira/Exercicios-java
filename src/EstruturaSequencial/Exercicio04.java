package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
        hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio,
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

        System.out.println("N�mero Funcionario = " + numeroFuncionario);
        System.out.printf("Salario = U$ %.2f" , salarioFuncionario);


    }
}
