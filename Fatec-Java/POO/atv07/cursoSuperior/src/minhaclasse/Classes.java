package minhaclasse;

import javax.swing.JOptionPane;

public class Classes {

    public double N1, N2, N3, media;

    public void Setvalores(double n1, double n2, double n3) {
        N1 = n1;
        N2 = n2;
        N3 = n3;
    }

    public double GetMedia() {      
        media = (N1 * 0.35 + N2 * 0.5 + N3 * 0.5);
        return media;
    }

    Classes() {
        N1 = 0;
        N2 = 0;
        N3 = 0;
    }

    public static void main(String[] args) {
        double N1, N2, N3;
        try {
            String nota1 = JOptionPane.showInputDialog("Digite a nota 1: ");
            String nota2 = JOptionPane.showInputDialog("Digite a nota 2: ");
            String nota3 = JOptionPane.showInputDialog("Digite a nota 3: ");
            N1 = Double.parseDouble(nota1);
            N2 = Double.parseDouble(nota2);
            N3 = Double.parseDouble(nota3);
            
            Main ct = new Main();
            ct.Setvalores(N1, N2, N3);
            
            Classes cs = new Classes();
            cs.Setvalores(N1, N2, N3);
            
            JOptionPane.showMessageDialog(null, "A média da Classe Superior é = " + cs.GetMedia());
            JOptionPane.showMessageDialog(null, "A média da Classe Técnica é = " + ct.GetMediaTe());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        }

    }

}
