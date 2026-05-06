package questao3;

import java.util.Scanner;

public class triangulos {

    Scanner sc = new Scanner(System.in);
    double ladoA;
    double ladoB;
    double ladoC;
    double ladoD;
    double ladoE;
    double ladoF;
    double area1;
    double area2;

    public void triangulo1() {
        System.out.println("insira lado 1");
        ladoA = sc.nextDouble();
        System.out.println("insira lado 2");
        ladoB = sc.nextDouble();
        System.out.println("insira lado 3");
        ladoC = sc.nextDouble();

    }
    public void triangulo2() {
        System.out.println("insira lado 1");
        ladoD = sc.nextDouble();
        System.out.println("insira lado 2");
        ladoE = sc.nextDouble();
        System.out.println("insira lado 3");
        ladoF = sc.nextDouble();

    }
    public void calcTri1() {
        double p1 = (ladoA + ladoB + ladoC) / 2;
        area1 = Math.sqrt(p1 * (p1 - ladoA) * (p1 - ladoB) * (p1 - ladoC));
    }
    public void calcTri2() {
        double p2 = (ladoD + ladoE + ladoF) / 2;
        area2 = Math.sqrt(p2 * (p2 - ladoD) * (p2 - ladoE) * (p2 - ladoF));
    }
    public void mostrarCalc() {
        System.out.println("Area do triangulo 1:" + area1);
        System.out.println("Area do triangulo 2:" + area2);
                if(area1 > area2) {
                    System.out.println("Triangulo 1 é maior");
                } else {
                    System.out.println("Triangulo 2 é maior");
                }
    }

}
