package listadeexercicios04funcoes;

import javax.swing.JOptionPane;

public class ExercicioFive {

    public static void MaiorMenor(int numeroUm, int numeroDois) {
        if (numeroUm > numeroDois) {
            JOptionPane.showMessageDialog(null, "Maior valor: " + numeroUm);
        } else {
            JOptionPane.showMessageDialog(null, "Maior valor: " + numeroDois);
        }
    }

    public static void main(String[] args) {
        try {
            int numeroUm, numeroDois;
            numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
            MaiorMenor(numeroUm, numeroDois);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        }
    }
}
