package exerciciosp3;

import javax.swing.JOptionPane;

public class ExercicioTwo {

    static double n; 

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        String M = "";
        try {
            String A = JOptionPane.showInputDialog("Digite até qual termo deseja ir: ");
            n = Double.parseDouble(A);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        } finally {
            for (int i = 1; i <= n; i++) {
                M = M + String.valueOf("(" + i + "):" + ExercicioTwo.fibo(i) + " ");
            }

            JOptionPane.showMessageDialog(null, M);
        }
    }
}
