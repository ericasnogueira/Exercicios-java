package poo.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.nome = entrada.nextLine();
        aluno.nota1 = entrada.nextDouble();
        aluno.nota2 = entrada.nextDouble();
        aluno.nota3 = entrada.nextDouble();

        System.out.println(aluno.toString());
    }
}
