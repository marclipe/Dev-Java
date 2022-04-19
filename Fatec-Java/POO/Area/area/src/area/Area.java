package area;

import javax.swing.JOptionPane;

public class Area {

    float base, altura, ar;

    public void Setvalores(float B, float H) {
        base = B;
        altura = H;
    }

    public float GetArea() {
        ar = (base * altura) / 2;
        return ar;
    }

    Area() {
        base = 0;
        altura = 0;
        ar = 0;
    }

    public static void main(String[] args) {
        float N1, N2;
        try {
            String v1 = JOptionPane.showInputDialog("Base");
            String v2 = JOptionPane.showInputDialog("Altura");
            N1 = Float.parseFloat(v1);
            N2 = Float.parseFloat(v2);
            Area a1 = new Area();
            a1.Setvalores(N1, N2);
            retangulo a2 = new retangulo();
            a2.Setvalores(N1, N2);
            JOptionPane.showMessageDialog(null, "A area é = " + a1.GetArea());
            JOptionPane.showMessageDialog(null, "A area é = " + a2.GetAreAr());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        }

    }
}
