package lp01fatecads;

import java.util.Scanner; 

public class Ex004 {
    public static void main(String[] args) {
        float celsius, fahrenheit; 
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite a temperatura em Celsius: ");
        celsius = input.nextFloat(); 
        
        fahrenheit = (9 * celsius + 160) / 5;
        System.out.printf("\\O valor de Celsius convertido em Fahrenheit é = %2f", fahrenheit);
    }
}
