package faturar;

import javax.swing.JOptionPane;

public class Faturar {

    public static void main(String[] args) {
        int numero;
        int quantidade;
        int preço;

        String v1 = JOptionPane.showInputDialog("Numero do Item:");
        String descricão = JOptionPane.showInputDialog("Descrição do Item:");
        String v3 = JOptionPane.showInputDialog("Quantidade por Item:");
        String v4 = JOptionPane.showInputDialog("Preço por Item:");

        numero = Integer.parseInt(v1);

        quantidade = Integer.parseInt(v3);
        preço = Integer.parseInt(v4);

        FaturaTotal a1 = new FaturaTotal(numero, descricão, quantidade, preço);

        JOptionPane.showMessageDialog(null, "O valolr total é = " + a1.GetFaturarTotal());

    }

}
