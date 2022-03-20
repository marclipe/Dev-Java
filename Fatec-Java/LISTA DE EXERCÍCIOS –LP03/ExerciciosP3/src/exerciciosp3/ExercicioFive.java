package exerciciosp3;

import javax.swing.JOptionPane;

public class ExercicioFive {

    static int inicio, fim;

    public static void main(String[] args) {
        int salto ; 
        try {
            String Inicio = JOptionPane.showInputDialog("Digite o limite inferior: ");
            inicio = Integer.parseInt(Inicio);

            String Fim = JOptionPane.showInputDialog("Digite o limite superior: ");
            fim = Integer.parseInt(Fim);
            
            String Salto = JOptionPane.showInputDialog("Digite o tamanho do salto: ");
            salto = Integer.parseInt(Salto); 

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        } finally {
            for (int i = inicio; i <= fim; i++) {
            
            }
        }
    }
}
