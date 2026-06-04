package questão4;
import java.util.Scanner;
public class Circulo {

    private double raio;
    Scanner scam = new Scanner(System.in);

    double getRaio() {
        return raio;
    }
    void setRaio() {
        System.out.println("Qual é o raio?");
        raio = scam.nextDouble();
    }
    void calcularArea() {
        double area = getRaio() * getRaio() * 3.14;
        System.out.println("Area:" + area);

    }
    void calcularPerimetro(){
        double perimetro = 2 * 3.14 * getRaio();
        System.out.println("perimetro:" + perimetro);
    }
}
