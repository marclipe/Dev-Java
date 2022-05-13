package ex6Empregado;

import javax.swing.JOptionPane;

public class EmpregadoTeste {

    public static void main(String[] args) {
        Empregado empregado = new Empregado(
                JOptionPane.showInputDialog(null, "Digite o nome do empregado: "),
                Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do empregado: ")),
                Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a altura do empregado: ")),
                JOptionPane.showInputDialog(null, "Digite o sexo do empregado: ").charAt(0),
                Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário do empregado: ")));

        JOptionPane.showMessageDialog(null, empregado.toString() + "\nOs lucros : " + empregado.obterLucros());
    }

}
