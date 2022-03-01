package listadeexerciciosl02;

import java.util.Scanner;

public class Ex002OrdemCrescente {

    public static void main(String[] args) {
        int primeiroValor, segundoValor, terceiroValor;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        primeiroValor = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        segundoValor = input.nextInt();
        System.out.println("Digite o terceiro valor: ");
        terceiroValor = input.nextInt();

        if (primeiroValor < segundoValor) {
            if (primeiroValor < terceiroValor) {
                System.out.println(primeiroValor + "\n" + segundoValor + "\n" + terceiroValor);
            }
        } else if (primeiroValor < terceiroValor) {
            System.out.println(primeiroValor + "\n" + terceiroValor + "\n" + segundoValor);
        } else {
            System.out.println(terceiroValor + "\n" + primeiroValor + "\n" + terceiroValor);
            if (segundoValor < terceiroValor) {
                if (primeiroValor < terceiroValor) 
                    System.out.println(segundoValor + "\n" + primeiroValor + "\n" + terceiroValor);  
            } else {
                System.out.println(segundoValor + "\n" + terceiroValor + "\n" + primeiroValor);
            } else{
                    System.out.println(terceiroValor + "\n" + segundoValor + "\n" + primeiroValor);
                    }
        } 
        
    }
}
