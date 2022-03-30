package lista_de_extwo;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int A, B, C;
        String valorA = JOptionPane.showInputDialog("Digite o valor de A: ");
        A = Integer.parseInt(valorA);
        String valorB = JOptionPane.showInputDialog("Digite o valor de B: ");
        B = Integer.parseInt(valorB);
        String valorC = JOptionPane.showInputDialog("Digite o valor de C: ");
        C = Integer.parseInt(valorC);
        Equacao abc = new Equacao();
        abc.SetLerEquacao(A, B, C);
        
        JOptionPane.showMessageDialog(null, "O valor de Delta = " + abc.getDelta());
        
        if (abc.getDelta() == 0) {
            JOptionPane.showMessageDialog(null, "As raízes são iguais!");
        } else if (abc.getDelta() < 0 ) {
            JOptionPane.showMessageDialog(null, "Não existem raízes reais!");
        } else {
            JOptionPane.showMessageDialog(null, "Existem 2 raízes diferentes!");
        }
        JOptionPane.showMessageDialog(null, "A raiz R1 = " + abc.GetR1());
        JOptionPane.showMessageDialog(null, "A raiz R2 = " + abc.GetR2());
    }
}
