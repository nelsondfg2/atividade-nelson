package questao1;

import java.util.Scanner;

public class Produto {
    Scanner sc = new Scanner(System.in);
    double preco;
    String nome;
    int uniEstoque;
    double precoEstoque;

    public void mostrarEstoque() {
        this.precoEstoque = uniEstoque * preco;
        System.out.println("Nome:" + nome);
        System.out.println("Preço:" + preco);
        System.out.println("Unidades em estoque:" + uniEstoque);
        System.out.println("Valor total:" + precoEstoque);
    }

    public void lerNome() {
        System.out.println("Qual é o nome do produto?");
        this.nome = sc.nextLine();
    }

    public void addEstoque() {
        System.out.println("Quanto adicionar ao estoque?");
        int qtd1 = sc.nextInt();
        this.uniEstoque = uniEstoque + qtd1;
    }

    public void mudarPreco() {
        System.out.println("qual é o novo preço?");
        double qtd2 = sc.nextDouble();
        this.preco = qtd2;
    }

    public void subEstoque() {
        int x = 0;
        while (x == 0) {
            System.out.println("Quanto subtrair do estoque?");
            int qtd3 = sc.nextInt();
            if (uniEstoque > qtd3) {
                this.uniEstoque = uniEstoque - qtd3;
                x ++;
            } else {
                System.out.println("Valor errado");
            }
        }
    }
}