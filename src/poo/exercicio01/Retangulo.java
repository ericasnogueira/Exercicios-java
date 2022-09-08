package poo.exercicio01;

public class Retangulo {
    /*
    Fazer um programa para ler os valores da largura e altura de retângulo. Em seguida, mostrar na tela o valor de
    sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto.
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
