package javaapplication7;

import java.util.Scanner;
/**
 *
 * @author aluno04aluno
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     int produto,desconto;
     Scanner input = new Scanner(System.in);
     System.out.println("Digite o valor do produto:");
     produto=input.nextFloat();
      
     desconto=produto*9/100;
  
        System.out.printf("\\ndesconto= %d",desconto);
        
    }
    
}