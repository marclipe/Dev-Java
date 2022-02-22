/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exone;

import java.util.Scanner; 

/**
 *
 * @author marco
 */
public class ExOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor; 
        Scanner input = new Scanner(System.in); 
        System.out.println("Veja se o valor é múltiplo de 3: ");
        valor = input.nextDouble(); 
        
        if(valor % 3 == 0 ){
            System.out.println("O valor " + valor + " é múltiplo de 3!");
        } else {
            System.out.println("O valor " + valor + " não é múltiplo de 3!");
        }
        
    }
    
}
