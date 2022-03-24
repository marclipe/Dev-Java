package listadeexercicios04funcoes;

import javax.swing.JOptionPane;

/*Criar um programa que permita a entrada de um  número inteiro e retorne o seu dobro, através de um método.*/
public class ExercicioOne {
    public static void Dobro(int n) {
        int dobro = n * 2;
        JOptionPane.showMessageDialog(null, "Dobro: " + dobro);
         
    }
    
    public static void main(String[] args) {
        
    int numero; 
    String n = JOptionPane.showInputDialog(null, "Insira o valor:");
    numero=Integer.parseInt(n);
    Dobro(numero);
    

    }

}