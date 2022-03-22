package listadeexercicios04funcoes;

import javax.swing.JOptionPane;

public class ExercicioFour {

    public final static double pi = 3.14;

    public static double Radiano(double grau) {

        return grau * pi / 180;
    }

    public static void main(String[] args) {
        try {
            double grau;
            grau = Double.parseDouble(JOptionPane.showInputDialog("Digite o grau para conversão: "));
            JOptionPane.showMessageDialog(null, "O Grau convertido em radianos será: " + Radiano(grau));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        } 
    }
}
