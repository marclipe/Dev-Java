package ex4Data;

import javax.swing.JOptionPane;

public class DataTeste {

    public static void main(String[] args) {
        Data date = new Data(
                Integer.parseInt(JOptionPane.showInputDialog("Dia: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Mês: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Ano: ")));

        JOptionPane.showMessageDialog(null, date.displayData()
        );
    }
}
