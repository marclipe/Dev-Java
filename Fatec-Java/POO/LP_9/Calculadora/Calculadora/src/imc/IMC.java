package imc;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class IMC {

    private JFrame janela;

    private JPanel painelPrincipal, painelEntrada, painelBOTOES;

    private Label label1, label2, label3, label4, label5;

    private TextField t1, t2, t3, t4;

    double altura;
    double peso;
    double imc;
    String sinal;
    double calculo;
    JButton calcula;

    public static void main(String[] args) {
        new IMC().montaTela();
    }

    private void montaTela() {

        preparaJanela();

        definirEventos();

    }

    private void preparaJanela() {

        janela = new JFrame("CÁLCULO IMC");

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//painelEntrada
        painelEntrada = new JPanel();
        painelEntrada.setLayout(new BoxLayout(painelEntrada, BoxLayout.PAGE_AXIS));
        janela.add(painelEntrada, BorderLayout.NORTH);
        label1 = new Label("Calcular IMC ", Label.CENTER);
        painelEntrada.add(label1);
        label2 = new Label("Digite seu Peso ");
        t1 = new TextField("");
        painelEntrada.add(label2);
        painelEntrada.add(t1);
        label3 = new Label("Digite sua Altura ");
        t2 = new TextField("");
        painelEntrada.add(label3);
        painelEntrada.add(t2);

//painelPrincipal
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new FlowLayout(0, 1, 1));
        janela.add(painelPrincipal, BorderLayout.CENTER);

        calcula = new JButton("Calcular");
        painelPrincipal.add(calcula);

//painelBotões
        painelBOTOES = new JPanel();

        painelBOTOES.setLayout(new BoxLayout(painelBOTOES, BoxLayout.PAGE_AXIS));
        janela.add(painelBOTOES, BorderLayout.SOUTH);

        label4 = new Label("Seu indice de massa corporal ");
        t4 = new TextField("");
        painelBOTOES.add(label4);
        painelBOTOES.add(t4);

        label5 = new Label(" ");
        painelBOTOES.add(label5);

        //mostra Janela
        janela.pack();

        janela.setSize(450, 250);

        janela.setVisible(true);
    }

    private void definirEventos() {

        calcula.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculo = Double.parseDouble(t1.getText());
                peso = Double.parseDouble(t1.getText());
                altura = Double.parseDouble(t2.getText());
                imc = peso / (altura * altura);

                if (imc < 18.5) {
                    t4.setText(String.valueOf(peso / (altura * altura)));
                    label5.setText(String.valueOf("Você esté abaixo do peso ideal"));
                }
                if (imc >= 18.5 && imc <= 24.9) {
                    t4.setText(String.valueOf(peso / (altura * altura)));
                    label5.setText(String.valueOf("Parabéns - você está em seu peso normal!"));
                }
                if (imc >= 25 && imc <= 29.9) {
                    t4.setText(String.valueOf(peso / (altura * altura)));
                    label5.setText(String.valueOf("Você está acima de seu peso (sobrepeso)"));
                }
                if (imc >= 30 && imc <= 34.9) {
                    t4.setText(String.valueOf(peso / (altura * altura)));
                    label5.setText(String.valueOf("Obesidade grau 1"));
                }
                if (imc >= 35 && imc <= 39.9) {
                    t4.setText(String.valueOf(peso / (altura * altura)));
                    label5.setText(String.valueOf("Obesidade grau 2"));
                }
                if (imc >= 40 && imc > 40) {
                    t4.setText(String.valueOf(peso / (altura * altura)));
                    label5.setText(String.valueOf("Obesidade grau 3"));
                }
            }
        });

    }
}
