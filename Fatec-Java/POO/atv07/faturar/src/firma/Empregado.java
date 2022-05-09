package firma;

import javax.swing.JOptionPane;

public class Empregado {
    
    public static void main(String[] args) {
        String primeiroNome; 
        String sobrenome; 
        double salarioMensal;
        
        primeiroNome = JOptionPane.showInputDialog("Primeiro Nome: ");
        sobrenome = JOptionPane.showInputDialog("Sobrenome: ");
        String n1 = JOptionPane.showInputDialog("Salário Anual: ");
        salarioMensal = Double.parseDouble(n1); 
        
        
        
    }
}
