package dominio.test;

import dominio.Estudante;

public class PessoaTest01 {
    public static void main(String[] args) {
        String nome; 
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy"; 
        estudante.idade = 21; 
        estudante.sexo = 'M'; 
        
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
