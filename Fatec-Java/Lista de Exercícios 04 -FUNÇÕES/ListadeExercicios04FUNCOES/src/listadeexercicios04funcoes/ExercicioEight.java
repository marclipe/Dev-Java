package listadeexercicios04funcoes;

import javax.swing.JOptionPane;

public class ExercicioEight {
    public static void NumPrimo(int numero) {
        int aux = 0;

        for (int i = 1; i <= numero; i++) {

            if (numero % i == 0) {
                aux += 1;
            }
        }

        if (aux == 2) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é primo.");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo.");
        }
    }

    public static void main(String[] args) {
        try {
            int numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            NumPrimo(numero); 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        }
    }
}
