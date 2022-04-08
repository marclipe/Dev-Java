package projetomusica.view;

import javax.swing.JOptionPane;
import projetomusica.controller.ControllerAcessorios;
import java.sql.SQLException;
import java.util.List;
import projetomusica.model.bean.Acessorios;

public class ManterAcessorios {

    static ControllerAcessorios contAce;

    public static void inserir() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog("Nome");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
        int id_instrumentos = Integer.parseInt(JOptionPane.showInputDialog("ID Instrumento"));
        Acessorios aceEntrada = new Acessorios(nome, valor, id_instrumentos);
        contAce = new ControllerAcessorios();
        Acessorios aceSaida = contAce.inserir(aceEntrada);
        JOptionPane.showMessageDialog(null, aceSaida.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("Nome");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
        int id_instrumentos = Integer.parseInt(JOptionPane.showInputDialog("ID Instrumento"));
        Acessorios aceEntrada = new Acessorios(id, nome, valor, id_instrumentos);
        contAce = new ControllerAcessorios();
        Acessorios aceSaida = contAce.alterar(aceEntrada);
        JOptionPane.showMessageDialog(null, aceSaida.toString());
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Acessorios aceEntrada = new Acessorios(id);
        contAce = new ControllerAcessorios();
        Acessorios aceSaida = contAce.buscar(aceEntrada);
        JOptionPane.showMessageDialog(null, aceSaida.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog(null, "NOME");
        Acessorios aceEntrada = new Acessorios(nome);
        contAce = new ControllerAcessorios();
        List<Acessorios> listaaceSaida = contAce.listar(aceEntrada);

        for (Acessorios ace : listaaceSaida) {
            JOptionPane.showMessageDialog(null, ace.toString());
        }
    }

    public static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Acessorios aceEntrada = new Acessorios(id);
        contAce = new ControllerAcessorios();
        Acessorios aceSaida = contAce.excluir(aceEntrada);
        JOptionPane.showMessageDialog(null, aceSaida.toString());
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair \n 1 - Inserir \n 2 - Alterar \n 3 - Excluir \n 4 - Buscar \n 5 - Listar"));
        switch (operacao) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair");
                System.out.println("Valor de Sair = " + sair);
                if (sair > 0) {
                    menu();
                }
                break;
            case 1:
                inserir();
                break;
            case 2:
                alterar();
                break;
            case 3:
                excluir();
                break;
            case 4:
                buscar();
                break;
            case 5:
                listar();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro opcao invalida");
                menu();
                break;
        }
    }

}
