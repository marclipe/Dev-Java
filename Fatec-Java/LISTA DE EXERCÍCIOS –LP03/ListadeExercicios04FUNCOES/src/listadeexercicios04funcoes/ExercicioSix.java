package listadeexercicios04funcoes;

import javax.swing.JOptionPane;

public class ExercicioSix {

    public static void Mes(int valorDoMes) throws Exception {
        switch (valorDoMes) {
            case 1:
                JOptionPane.showMessageDialog(null, "Janeiro");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Fevereiro");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Março");
                break;
            default: 
                throw new Exception("[ERRO] Mês errado!!");
                
        }
    }

    public static void main(String[] args) {
        try {
            int valorDoMes;
            valorDoMes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
            Mes(valorDoMes);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }

    }
}
