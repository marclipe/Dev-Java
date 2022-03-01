/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extwo;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ExOne {
    public static void main(String[] args) {
        int produto,desconto;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do produto:");
        produto=input.nextInt();
      
        desconto=produto*9/100;
  
        System.out.printf("\\nDesconto= %d",desconto);
    }
}
