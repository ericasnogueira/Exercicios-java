package poo.exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome : ");
        funcionario.nome = entrada.nextLine();
        System.out.print("Salario Bruto : ");
        funcionario.salarioBruto = entrada.nextDouble();
        System.out.print("Taxa : ");
        funcionario.taxa = entrada.nextDouble();
        System.out.println(funcionario.toString());
        System.out.print("Qual porcentagem acrescentar : ");
        double porcentagem = entrada.nextDouble();
        funcionario.aumentarSalario(porcentagem);

        System.out.println("Update data: " + funcionario.toString());
    }
}
