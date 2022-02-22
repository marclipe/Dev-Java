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
public class ExTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sp, qsm; 
        double sm = 1100; 
        Scanner input = new Scanner(System.in); 
        System.out.println("Digite o seu salário: ");
        sp = input.nextDouble(); 
        qsm = sp / sm; 
        System.out.printf("\\nQuantidade de Salarios minimos = %2f ", qsm);
    }
    
}
