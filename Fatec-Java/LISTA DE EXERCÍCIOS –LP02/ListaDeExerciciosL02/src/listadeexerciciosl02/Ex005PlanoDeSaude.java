package listadeexerciciosl02;

import java.util.Scanner;

public class Ex005PlanoDeSaude {

    public static void main(String[] args) {
        String nomePessoa;
        int idadePessoa;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        nomePessoa = input.next();

        System.out.println("Qual a sua idade? ");
        idadePessoa = input.nextInt();

        boolean primeiraOpcao = idadePessoa <= 10;
        boolean segundaOpcao = idadePessoa > 10 && idadePessoa <= 29;
        boolean terceiraOpcao = idadePessoa > 29 && idadePessoa <= 45;
        boolean quartaOpcao = idadePessoa > 45 && idadePessoa <= 59;
        boolean quintaOpcao = idadePessoa > 59 && idadePessoa <= 65;
        boolean sextaOpcao = idadePessoa > 65;

        System.out.println("Olá " + nomePessoa);

        if (primeiraOpcao) {
            System.out.println("Até 10 anos – R$ 30,00");
        } else if (segundaOpcao) {
            System.out.println("Acima de 10 até 29 anos – R$ 60,00");
        } else if (terceiraOpcao){
            System.out.println("Acima de 29 até 45 anos –R$ 120,00");
        } else if (quartaOpcao){
            System.out.println("Acima de 45 até 59 anos –R$ 150,00");
        } else if (quintaOpcao) {
            System.out.println("Acima de 59 até 65 anos –R$ 250,00");
        } else if (sextaOpcao) {
            System.out.println("Maior que 65 anos –R$ 400,00");
        }
        
        
    }
}
