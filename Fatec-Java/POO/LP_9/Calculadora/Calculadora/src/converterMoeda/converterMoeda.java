package converterMoeda;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class converterMoeda {

    private JFrame janela;

    private JPanel painelPrincipal, painelEntrada, painelBOTOES;

    private Label label1, lblv1, lblv2, lblr, lblt;

    private TextField t1, t2;

    JRadioButton dolar, euro, libra;
    double converter;
    String sinal;
    String veuro;
    JButton convert;
    ButtonGroup moeda; 

    public static void main(String[] args) {
        new converterMoeda().montaTela();
    }

    private void montaTela() {

        preparaJanela();

        definirEventos();

    }

    private void preparaJanela() {

        janela = new JFrame("Converção Moeda");

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//painelEntrada
        painelEntrada = new JPanel();
        painelEntrada.setLayout(new BoxLayout(painelEntrada, BoxLayout.PAGE_AXIS));
        janela.add(painelEntrada, BorderLayout.NORTH);
        label1 = new Label("Converter de Moedas ", Label.CENTER);
        painelEntrada.add(label1);
        lblv1 = new Label("Digite o valor em real ");
        t1 = new TextField("");
        painelEntrada.add(lblv1);
        painelEntrada.add(t1);

//painelPrincipal
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new FlowLayout(0, 1, 1));
        janela.add(painelPrincipal, BorderLayout.CENTER);

        lblv2 = new Label("Converter para qual Moeda ");
        painelPrincipal.add(lblv2);

        euro = new JRadioButton("euro");

        painelPrincipal.add(euro);

        dolar = new JRadioButton("dolar");

        painelPrincipal.add(dolar);

        libra = new JRadioButton("libra");

        painelPrincipal.add(libra);

        convert = new JButton("converter");

        painelPrincipal.add(convert);
        
        moeda = new ButtonGroup(); 
        moeda.add(euro);
        moeda.add(dolar);
        moeda.add(libra);

//painelbotoes
        painelBOTOES = new JPanel();

        painelBOTOES.setLayout(new BoxLayout(painelBOTOES, BoxLayout.PAGE_AXIS));
        janela.add(painelBOTOES, BorderLayout.SOUTH);

        lblv2 = new Label("Resultado ");
        t2 = new TextField("");

        painelBOTOES.add(lblv2);
        painelBOTOES.add(t2);

        //mostra Janela
        janela.pack();

        janela.setSize(400, 220);

        janela.setVisible(true);
    }

    private void definirEventos() {

        euro.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                converter = Double.parseDouble(t1.getText());
                sinal = "euro";

            }

        });
        dolar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                converter = Double.parseDouble(t1.getText());
                sinal = "dolar";

            }

        });
        libra.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                converter = Double.parseDouble(t1.getText());
                sinal = "libra";

            }

        });
        convert.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                converter = Double.parseDouble(t1.getText());

                if (sinal == "euro") {
                    t2.setText(String.valueOf(converter * 0.19));
                }
                if (sinal == "dolar") {
                    t2.setText(String.valueOf(converter * 0.20));
                }
                if (sinal == "libra") {
                    t2.setText(String.valueOf(converter * 0.16));
                }

            }
        });

    }

}
