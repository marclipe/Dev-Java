package listadeexerciciosl02;

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        double valor;
        Scanner input = new Scanner(System.in);
        System.out.println("Veja se o valor é múltiplo de 3: ");
        valor = input.nextDouble();

        if (valor % 3 == 0) {
            System.out.println("O valor " + valor + " é múltiplo de 3!");
        } else {
            System.out.println("O valor " + valor + " não é múltiplo de 3!");
        }
    }

}
