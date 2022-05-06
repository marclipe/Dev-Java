package exemplosoma;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Soma {

    private JFrame janela;
    private JPanel painelPrincipal;
    private Label label1, lblr, t3;
    private TextField t1, t2;

    public static void main(String[] args) {
        new Soma().montaTela();
    }

    private void montaTela() {
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoCarregar();
        preparaBotaoSair();
        mostraJanela();
    }

    private void preparaJanela() {
        janela = new JFrame("Exemplo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void mostraJanela() {
        janela.pack();
        janela.setSize(600, 300);
        janela.setVisible(true);
    }

    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));
        janela.add(painelPrincipal);
        //painelPrincipal.setLayout(new GridLayout(3,2));
    }

    private void preparaLabel() {
        label1 = new Label("Calculando a soma de 2 números: ");
        painelPrincipal.add(label1);
    }

    private void preparaText() {
        t1 = new TextField("");
        t2 = new TextField("");
        lblr = new Label("Resultado=");
        t3 = new Label(" ");
        painelPrincipal.add(t1);
        painelPrincipal.add(t2);
        painelPrincipal.add(lblr);
        painelPrincipal.add(t3);
    }

    private void preparaBotaoCarregar() {
        JButton botaoCarregar = new JButton("SOMA");
        botaoCarregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int soma = Integer.parseInt(t1.getText())
                        + Integer.parseInt(t2.getText());
                String r = Integer.toString(soma);
                t3.setText(r);
            }
        });
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(botaoCarregar);//adiciona botão ao painel
    }

    private void preparaBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        painelPrincipal.add(botaoSair);//adiciona botão Sair ao painel
    }

}
