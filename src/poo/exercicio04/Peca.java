package poo.exercicio04;

public class Peca {
    /*
    Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1,
    o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o valor
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
