package listadeexercicios04funcoes;

import javax.swing.JOptionPane;

/* Criar  um  programa  que  receba  4  notas  e  calcule  a  média  aritmética,  através  de  um método.*/
public class ExercicioTwo {

    public static void Media(double notaUm, double notaDois, double notaTres, double notaQuatro) {
        double media = (notaUm+ notaDois + notaTres + notaQuatro) / 4;
        JOptionPane.showMessageDialog(null, "A média do aluno será: " + media);

    }

    public static void main(String[] args) {
        try {
            double notaUm, notaDois, notaTres, notaQuatro;
            String notaA = JOptionPane.showInputDialog("Digite a nota 1: ");
            notaUm = Double.parseDouble(notaA);
            String notaB = JOptionPane.showInputDialog("Digite a nota 2: ");
            notaDois = Double.parseDouble(notaB);
            String notaC = JOptionPane.showInputDialog("Digite a nota 3: ");
            notaTres = Double.parseDouble(notaC);
            String notaD = JOptionPane.showInputDialog("Digite a nota 4: ");
            notaQuatro = Double.parseDouble(notaD);
            Media(notaUm, notaDois, notaTres, notaQuatro);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        }

    }
}
