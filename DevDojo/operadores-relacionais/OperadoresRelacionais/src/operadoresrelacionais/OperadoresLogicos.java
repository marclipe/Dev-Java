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
        
        double valorTotalContaCorrente = 200; 
        double valorTotalContaPoupanca = 10000; 
        float valorPlaystation = 5000F; 
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);
        
        // = += -= *= %= 
        double bonus = 1800; 
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2; 
        bonus /= 2; 
        bonus %= 2; 
        System.out.println(bonus);
        
        int contador = 0; 
        contador += 1; //contador = contador + 1
        contador++; 
        contador--; 
        ++contador; 
        --contador; 
        System.out.println(contador);
    }
}
