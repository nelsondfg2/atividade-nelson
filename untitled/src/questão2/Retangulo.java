package questão2;
import java.util.Scanner;

public class Retangulo {
    Scanner scam = new Scanner(System.in);

    private double comprimento;
    private double largura;

    public double getComprimento (){
        return comprimento;
    }
    public void setComprimento (){
        System.out.println("Digite comprimento");
        comprimento = scam.nextDouble();
        System.out.println(getComprimento());
    }
    public double getLargura(){
        return largura;
    }
    public void setLargura(){
        System.out.println("Digite largura");
        largura = scam.nextDouble();
        System.out.println(getLargura());

    }
}
