package javatrabalho;

public class Trabalho {
    public static void main(String[] args) {
        String[] nome = {"Marcos", "Maria", "Francisca", "Tiago", "Mark", "Tainara", "Tanandra", "Miqueias", "Márcio", "Felipe", "Sousa", "Lima", "Madson", "Luan", "Alice", "Leticia", "Lucas", "Matheus", "Michelly", "Antonia", "João", "Luís", "Pedro", "Sabrina", "Carmem", "Denilson", "Álvaro", "Denise", "Guanabara", "Gustavo"
        };
        int[] idade = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30
        };

        String[] sexo = {
                "M", "F", "F", "M", "M", "F", "F", "M", "M", "M", "M", "M", "M", "F", "F", "M", "M", "F", "F", "M", "M", "M", "F", "F", "M", "M","F", "M", "M", "M"
        };

        for(int i = 0; i <= 30; i++) {
            System.out.println(i+ " Nome: " + nome[i] + " Idade: " + idade[i] + " Sexo:  " + sexo[i]);
        }

    };


}
