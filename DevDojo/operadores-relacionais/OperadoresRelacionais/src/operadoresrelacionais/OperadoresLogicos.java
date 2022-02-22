package operadoresrelacionais;

/**
 *
 * @author marco
 */
public class OperadoresLogicos {
    public static void main(String[] args) {
        //Operadores lógicos: true e false (boleanos)  < > <= >= == != 
        boolean isDezMaiorQueVinte = 10 > 20; 
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10; 
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
        
        //AND (&&) OR (||) NOT (!)
        int idade = 35; 
        float salario = 3500F; 
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612; 
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381; 
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
    }
}
