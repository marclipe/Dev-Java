/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresrelacionais;

/**
 *
 * @author marco
 */
public class OperadoresRelacionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero01 = 10; 
        int numero02 = 20; 
        double resultado = numero01 /(double) numero02; 
        System.out.println(resultado);
        
        //% - Resto da divisão 
        int resto = 20 % 2; 
        System.out.println(resto);
        
        //Operadores lógicos: true e false (boleanos)  < > <= >= == != 
        boolean isDezMaiorQueVinte = 10 > 20; 
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10; 
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
    }
    
}
