package ex2firma;

import javax.swing.JOptionPane;

public class Empregado {
    
    public static void main(String[] args) {
        String primeiroNome; 
        String sobrenome; 
        double salarioMensal;
        double salarioAnual; 
        
        primeiroNome = JOptionPane.showInputDialog("Primeiro Nome: ");
        sobrenome = JOptionPane.showInputDialog("Sobrenome: ");
        String n1 = JOptionPane.showInputDialog("Salário Mensal: ");
        salarioMensal = Double.parseDouble(n1); 
        String n2 = JOptionPane.showInputDialog("Salário Anual: ");
        salarioAnual = Double.parseDouble(n2); 
        
        EmpregadoTeste et = new EmpregadoTeste(primeiroNome, sobrenome, salarioMensal, salarioAnual); 
        
        JOptionPane.showMessageDialog(null, primeiroNome + sobrenome + " O valor do aumento será: = " + et.GetEmpregadoTeste() + "E salário: " + salarioAnual);
        
    }
}
