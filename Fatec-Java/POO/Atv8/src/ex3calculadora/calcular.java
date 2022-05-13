package ex3calculadora;

import javax.swing.JOptionPane;

public class calcular {

    public static void main(String[] args) {

        try {
            String[] operations = {"+", "-", "*", "/"};

            calculadora cal = new calculadora(
                    Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro número:")),
                    Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo número:")),
                    operations[JOptionPane.showOptionDialog(null, "Escolha a operação matematica", "",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE, null,
                            operations, operations[0])].charAt(0));

            JOptionPane.showMessageDialog(null, "O resultado será: " + cal.result());
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            main(args);
        }
    }

}
