package minhaclasse;

import javax.swing.JOptionPane;

public class Classes {

    float n1, n2, n3, media;

    public void Setvalores(float a, float b, float c) {
        n1 = a;
        n2 = b;
        n3 = c;
    }

    public static void main(String[] args) {
        try {
            float N1, N2, N3;
            String v1 = JOptionPane.showInputDialog("Nota1:");
            String v2 = JOptionPane.showInputDialog("Nota2:");
            String v3 = JOptionPane.showInputDialog("Nota3:");
            N1 = Float.parseFloat(v1);
            N2 = Float.parseFloat(v2);
            N3 = Float.parseFloat(v3);

            Superior cs = new Superior();
            cs.Setvalores(N1, N2, N3);
            Tecnico ct = new Tecnico();
            ct.Setvalores(N1, N2, N3);

            JOptionPane.showMessageDialog(null, "A média da Classe Superior é = " + cs.GetSuperior());
            JOptionPane.showMessageDialog(null, "A média da Classe Técnica é = " + ct.GetTecnico());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        }

    }

}
