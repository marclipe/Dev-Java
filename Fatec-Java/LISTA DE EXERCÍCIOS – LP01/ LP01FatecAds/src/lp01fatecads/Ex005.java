package lp01fatecads;

import java.util.Scanner; 

public class Ex005 {

    public static void main(String[] args) {

        double volume, raio, altura;

        Scanner input = new Scanner(System.in);
        System.out.println("Digite a Altura: ");
        altura = input.nextDouble();
        System.out.println("Digite o Raio: ");
        raio = input.nextDouble();

        volume = 3.14159 * (raio * raio) * altura;

        System.out.printf("\\O volume da lata de óleo é = %2f", volume);

    }
