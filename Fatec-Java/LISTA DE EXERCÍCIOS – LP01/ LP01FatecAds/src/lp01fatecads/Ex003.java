package lp01fatecads;

import java.util.Scanner; 

public class Ex003 {

    public static void main(String[] args) {
        float n1, n2, media; 
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite o valor 1: ");
        n1 = input.nextFloat(); 
        System.out.println("Digite o valor 2: ");
        n2 = input.nextFloat(); 
        
        media = n1 / n2; 
        
        System.out.printf("\\no Valor da média é %2f", media);
    }
    
}
