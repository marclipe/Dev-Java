package exerciciosp3;

import javax.swing.JOptionPane;

public class ExercicioFour {

    static double p1, p2;

    public static void main(String[] args) {

        try {
            String provaUm = JOptionPane.showInputDialog("Digite a primeira nota (P1): ");
            p1 = Double.parseDouble(provaUm);

            String provaDois = JOptionPane.showInputDialog("Digite a segunda nota (P2): ");
            p2 = Double.parseDouble(provaDois);

            double media = (p1 + p2) / 2;

            JOptionPane.showMessageDialog(null, "Média final do Aluno Fatecano: " + media + " ");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        }

    }

}
