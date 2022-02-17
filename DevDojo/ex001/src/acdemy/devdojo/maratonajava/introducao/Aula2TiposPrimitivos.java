package acdemy.devdojo.maratonajava.introducao;

public class Aula2TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, lang, boolean
        int age = 20;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; /*Vai mostrar o caractere da tabela Asscii e ovalor unicode*/
        String nome = "MarcLipe"; //Aspas dupla
        System.out.println("A idade é: " + age + " anos.");
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " + nome);
    }
}
