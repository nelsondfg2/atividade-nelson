package questão3;
import java.util.Scanner;

public class funcionario {
    private int idFuncionario;
    private String nomeFuncionario;
    private double salarioFuncionario;
    Scanner scam = new Scanner(System.in);

    public int getIdFuncionario(){
        return idFuncionario;
    }
    public void setIdFuncionario(){
        System.out.println("Qual é o numero do id?");
        idFuncionario = scam.nextInt();

    }
    public String getNomeFuncionario(){
        return nomeFuncionario;
    }
    public void setNomeFuncionario() {
        scam.nextLine();
        System.out.println("Qual é o nome do funcionário?");
        nomeFuncionario = scam.nextLine();
    }
    public funcionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
    public String getSalarioFuncionario(){
        return String.format("R$ %.2f", salarioFuncionario);
    }
    public void mostarInfo(){
        System.out.println("Id:" + idFuncionario);
        System.out.println("Nome:" + nomeFuncionario);
        System.out.println("Salário:" + getSalarioFuncionario());
    }
}
