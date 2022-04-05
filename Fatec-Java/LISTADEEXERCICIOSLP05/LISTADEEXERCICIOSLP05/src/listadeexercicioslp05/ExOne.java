package listadeexercicioslp05;

import javax.swing.JOptionPane;

public class ExOne {

    public static void main(String[] args) {
        float Base, Altura;
        String BaseTri = JOptionPane.showInputDialog("Digite a Base do Triângulo: ");
        String AlturaTri = JOptionPane.showInputDialog("Digite a Altura do Triângulo:");
        Base = Float.parseFloat(BaseTri);
        Altura = Float.parseFloat(AlturaTri);
        Triangulo tri = new Triangulo();
        tri.SetTriangulo(Base, Altura);
        JOptionPane.showMessageDialog(null, "A área é = " + tri.GetTriangulo());
    }

}
