package questao1;

import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        Produto n1 = new Produto();

        while (x == 0) {
            n1.lerNome();
            n1.mostrarEstoque();
            n1.addEstoque();
            n1.mudarPreco();
            n1.subEstoque();

            System.out.println("sair? 1 = sim 2 = não");
            int y = sc.nextInt();
            if (y == 1) {
                x = 1;
            }

        }
    }
}
