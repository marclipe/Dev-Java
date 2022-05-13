package ex5Cachorro;

import javax.swing.JOptionPane;

public class CockerTeste {

    public static void main(String[] args) {
        Animal animal = new Animal(
                JOptionPane.showInputDialog("Tipo do animal"),
                JOptionPane.showInputDialog("Cor do animal"));

        JOptionPane.showMessageDialog(null, animal.toString());

        animal.setTipo(JOptionPane.showInputDialog("Tipo do animal"));
        animal.setCor(JOptionPane.showInputDialog("Cor do animal"));

        JOptionPane.showMessageDialog(null, animal.toString());

        Cachorro cachorro = new Cachorro(
                JOptionPane.showInputDialog(null, "Digite o nome do cachorro "),
                JOptionPane.showInputDialog(null, "Digite a raça do cachorro "),
                "Cachorro",
                JOptionPane.showInputDialog(null, "Digite a cor do cachorro "));

        JOptionPane.showMessageDialog(null, cachorro.toString());

        cachorro.setNome(JOptionPane.showInputDialog(null, "Digite o nome de outro cachorro "));
        cachorro.setRaca(JOptionPane.showInputDialog(null, "Agora a raça do cachorro"));
        cachorro.setCor(JOptionPane.showInputDialog(null, "Agora a cor do cachorro"));

        JOptionPane.showMessageDialog(null, cachorro.toString());

        String[] opcoes = {"Sim", "Não"};

        Cocker cocker = new Cocker(
                JOptionPane.showInputDialog(null, "Digite o nome do cocker "),
                "Cocker",
                "Cachorro",
                JOptionPane.showInputDialog(null, "Digite a cor do cocker "),
                (JOptionPane.showOptionDialog(null, "O cocker precisa de tosa?", "", JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,
                        opcoes,
                        opcoes[0]) == 0) ? true : false);

        JOptionPane.showMessageDialog(null, cocker.toString());

        cocker.setNome(JOptionPane.showInputDialog(null, "Digite o nome de outro cocker "));
        cocker.setCor(JOptionPane.showInputDialog(null, "Agora a cor do cocker"));
        cocker.setTosa((JOptionPane.showOptionDialog(null, "O cocker precisa de tosa?", "", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                opcoes,
                opcoes[0]) == 0) ? true : false);

        JOptionPane.showMessageDialog(null, cocker.toString());

    }
}
