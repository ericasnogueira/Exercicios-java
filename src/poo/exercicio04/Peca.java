package poo.exercicio04;

public class Peca {
    /*
    Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
    o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor
    a ser pago.
     */
    // atributos
    double codigo1,numero1,valor1;
    double codigo2,numero2,valor2;

    public double valorPagar(){
        return   (this.numero1  * this.valor1) + (this.numero2 * this.valor2);
    }
    public  String toString(){
        return "VALOR A PAGAR : " + String.format("%.2f", valorPagar());
    }
}
