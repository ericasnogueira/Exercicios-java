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

        if(aluno.notaTotal() >60){
            System.out.printf("FINAL GRADE = %.2f%n", aluno.notaTotal());
            System.out.println("PASS");
        } else {
            System.out.printf("FINAL GRADE = %.2f%n", aluno.notaTotal());
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", 60 - aluno.notaTotal());
        }
    }
}
