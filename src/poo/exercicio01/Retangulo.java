package poo.exercicio01;

public class Retangulo {
    /*
    Fazer um programa para ler os valores da largura e altura de ret�ngulo. Em seguida, mostrar na tela o valor de
    sua �rea, per�metro e diagonal. Usar uma classe como mostrado no projeto.
     */
    double altura;
    double largura;

    public  double area(){
        return altura * largura;
    }
    public  double perimetro(){
        return 2 * (altura + largura);
    }
    public  double diagonal (){
        return  Math.sqrt(altura * altura + largura * largura);
    }
}
