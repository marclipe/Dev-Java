package listadeexerciciosl02;

import java.util.Scanner;

public class Ex004ClasseEleitoral {
    public static void main(String[] args) {
        int idadePessoa; 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual a idade da pessoa: ");
        idadePessoa = input.nextInt(); 
        
        boolean NaoEleitor = idadePessoa < 16; 
        boolean EleitorObrigatorio = idadePessoa > 18 && idadePessoa < 65; 
        boolean EleitorFacultativo = idadePessoa >= 16 && idadePessoa <= 18 || idadePessoa > 65;
        
        if (NaoEleitor) {
            System.out.println("Não-eleitor (abaixo de 16 anos)");
        } else if (EleitorFacultativo) {
            System.out.println("Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)");
        } else if (EleitorObrigatorio) {
            System.out.println("Eleitor obrigatório(entre 18 e 65 anos)");
        }
    }
}
