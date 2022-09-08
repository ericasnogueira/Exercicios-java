package poo.exercicio03;

public class Aluno {
    /*
    Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
    (primeiro trimestre vale 30 e o segundo e o terceiro vale 35). Ao final, mostrar qual a nota final do aluno no ano.
    Dizer também se o aluno está aprovado (PASS) ou não (FAILED)e, em caso negativo, quantos pontos faltam para o aluno
    obter o minimo para ser aprovado(que é 60% da nota). você deve criar um classe aluno para resolver este problema.
     */
    String nome;
    double nota1;
    double nota2;
    double nota3;

    public  double notaTotal (){
        return nota1 + nota2 + nota3;
    }
}
