package listadeexercicios04funcoes;

import javax.swing.JOptionPane;

/*Criar um programa que receba 2 valores e calcule o produto através de um método que  retorna valores.*/

public class ExercicioThree {
    public static int Mult(int numeroUm, int numeroDois) {
        
        return numeroUm * numeroDois; 
    }
  
    public static void main(String[] args) {
        int numeroUm, numeroDois; 
        String numberOne = JOptionPane.showInputDialog("Digite o primeiro número: ");
        numeroUm = Integer.parseInt(numberOne);
        String numberTwo = JOptionPane.showInputDialog("Digite o segundo número: ");
        numeroDois = Integer.parseInt(numberTwo);
         
        JOptionPane.showMessageDialog(null, "O produto do dois valores será: " + Mult(numeroUm, numeroDois));
    }
}
