package questao2;

import java.util.Scanner;

public class salario {

    Scanner sc = new Scanner(System.in);
    String nome;
    double salario;
    double salario2;


    public void lerNome() {
        System.out.println("Qual é o seu nome");
        this.nome = sc.nextLine();
    }

    public void lerSalario() {
        System.out.println("Qual é o seu salário?");
        this.salario = sc.nextDouble();
    }
    public void calcSalario() {
       if (salario >= 1 && salario <= 1000) {
           salario2 = salario + salario / 100 * 15;

       } else if (salario >= 1001 && salario <= 1500) {
           salario2 = salario + salario / 100 * 10;

       } else if (salario >= 1501 && salario <= 2000) {
           salario2 = salario + salario / 100 * 5;
       }
    }
    public void mostraSalario() {
        System.out.println("Nome:" + nome);
        System.out.println("Salario antigo:" + salario);
        System.out.println("Salario novo:" + salario2);
    }
}