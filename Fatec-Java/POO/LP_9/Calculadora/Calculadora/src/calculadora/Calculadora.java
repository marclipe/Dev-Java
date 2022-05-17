package calculadora;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class Calculadora {

    private JFrame janela;

    private JPanel painelPrincipal, painelEntrada, painelBOTOES;

    private TextField t1;

    private JButton botaoSoma, botaodiv, botaoSub, botaomult, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, botaoigual, botaoponto;

    double n1, n2;
    String sinal;

    public static void main(String[] args) {

        new Calculadora().montaTela();

    }

    private void montaTela() {

        preparaJanela();

        definirEventos();

    }

    private void preparaJanela() {

        janela = new JFrame("CALCULADORA");

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painelEntrada = new JPanel();
        painelEntrada.setLayout(new BoxLayout(painelEntrada, BoxLayout.PAGE_AXIS));

        janela.add(painelEntrada, BorderLayout.NORTH);

        t1 = new TextField("");
        painelEntrada.add(t1);

        painelBOTOES = new JPanel(new GridLayout(4, 4)); //define layout do painelREG

        janela.add(painelBOTOES, BorderLayout.CENTER);

        b7 = new JButton("7");

        painelBOTOES.add(b7);

        b8 = new JButton("8");

        painelBOTOES.add(b8);

        b9 = new JButton("9");

        painelBOTOES.add(b9);

        botaodiv = new JButton("/");

        painelBOTOES.add(botaodiv);

        b4 = new JButton("4");

        painelBOTOES.add(b4);

        b5 = new JButton("5");

        painelBOTOES.add(b5);

        b6 = new JButton("6");

        painelBOTOES.add(b6);

        botaomult = new JButton("*");

        painelBOTOES.add(botaomult);

        b1 = new JButton("1");

        painelBOTOES.add(b1);

        b2 = new JButton("2");

        painelBOTOES.add(b2);

        b3 = new JButton("3");

        painelBOTOES.add(b3);

        botaoSub = new JButton("-");

        painelBOTOES.add(botaoSub);

        b0 = new JButton("0");

        painelBOTOES.add(b0);

        botaoponto = new JButton(".");

        painelBOTOES.add(botaoponto);

        botaoigual = new JButton("=");

        painelBOTOES.add(botaoigual);

        botaoSoma = new JButton("+");

        painelBOTOES.add(botaoSoma);

//mostra Janela
        janela.pack();

        janela.setSize(400, 250);

        janela.setVisible(true);

    }

    private void definirEventos() {

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "1");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "2");
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "3");
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "4");
            }
        });
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "5");
            }
        });
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "6");
            }
        });
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "7");
            }
        });
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "8");
            }
        });
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "9");
            }
        });
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + "0");
            }
        });
        botaoponto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t1.setText(t1.getText() + ".");
            }
        });
        botaoigual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n2 = Double.parseDouble(t1.getText());

                if (sinal == "soma") {
                    t1.setText(String.valueOf(n1 + n2));
                }
                if (sinal == "sub") {
                    t1.setText(String.valueOf(n1 - n2));
                }
                if (sinal == "div") {
                    t1.setText(String.valueOf(n1 / n2));
                }
                if (sinal == "mult") {
                    t1.setText(String.valueOf(n1 * n2));
                }

            }
        });
        botaoSoma.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                n1 = Double.parseDouble(t1.getText());
                t1.setText("");
                sinal = "soma";
            }

        });
        botaomult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(t1.getText());
                t1.setText("");
                sinal = "mult";
            }
        });
        botaodiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(t1.getText());
                t1.setText("");
                sinal = "div";
            }
        });
        botaoSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                n1 = Double.parseDouble(t1.getText());
                t1.setText("");
                sinal = "sub";
            }
        });

    }

}
