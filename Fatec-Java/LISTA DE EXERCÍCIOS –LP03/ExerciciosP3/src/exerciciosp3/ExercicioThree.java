package exerciciosp3;

import javax.swing.JOptionPane;

public class ExercicioThree {

    static int inicio, fim, primo = 0;

    public static void main(String[] args) {
        try {
            String I = JOptionPane.showInputDialog("Digite o inicio: ");
            inicio = Integer.parseInt(I);

            String F = JOptionPane.showInputDialog("Digite o fim: ");
            fim = Integer.parseInt(F);

            for (int i = inicio; i <= fim; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        primo++;
                    }
                }
                if (primo == 2) {
                    JOptionPane.showMessageDialog(null, i + " ");
                }

                primo = 0;

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
        }
    }
}
