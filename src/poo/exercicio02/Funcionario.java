package poo.exercicio02;

public class Funcionario {
    /*
    Fazer um programa para ler os dados de um funcionario(nome,s�lario Bruto e imposto). Em seguida, mostrar os dados
    do funcionario(nome e salario l�quido). Em seguida, aumentar o s�lario do funcion�rio com base em uma porcentagem
    dada(somente o sal�rio bruto � afetado pela a porcentagem) e mostrar novamente os dados do funcion�rio.
     */
    //atributos
    String nome;
    double salariobruto;
    double taxa;

    public  double novoSalario(){
        return salariobruto - taxa;
    }

    public void aumentarSalario(double percentage){
         salariobruto += salariobruto * percentage/100;
    }

    @Override
    public String toString() {
        return nome + ", $ " + String.format("%.2f", novoSalario());
    }
}
