package poo.exercicio02;

public class Funcionario {
    /*
    Fazer um programa para ler os dados de um funcionario(nome,sálario Bruto e imposto). Em seguida, mostrar os dados
    do funcionario(nome e salario líquido). Em seguida, aumentar o sálario do funcionário com base em uma porcentagem
    dada(somente o salário bruto é afetado pela a porcentagem) e mostrar novamente os dados do funcionário.
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
