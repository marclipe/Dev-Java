package exerciciosp3;

import javax.swing.JOptionPane;

public class ExercicioFive {

    static double limite, salto;

    public static void main(String[] args) {
        
        String mensagem = ""; 
        
        try {
            String Limite = JOptionPane.showInputDialog(null, "Digite o limite: ");
            limite = Double.parseDouble(Limite);
            Limite = Limite.replace(",", ".");

            String Salto = JOptionPane.showInputDialog("Digite o valor do salto: ");
            salto = Double.parseDouble(Salto);
            Limite = Limite.replace(",", ".");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        } finally {
            for (int i = 0; i <= limite; i += salto) {

                mensagem = mensagem + String.valueOf(i + "   ");

            }
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }
}
