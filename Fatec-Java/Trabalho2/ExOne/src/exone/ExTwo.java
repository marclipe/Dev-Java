/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exone;

import java.util.Scanner; 
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class ExTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        
        int vet[] = new int [3]; 
        int aux = 0; 
        for (int i = 0; i < vet.length; i++) {
            vet[i] = ("Informe o valor: " + i);
            vet = input.nextInt(); 
        }
    }
}
