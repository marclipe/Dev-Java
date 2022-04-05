package projetomusica.view;

import javax.swing.JOptionPane;
import projetomusica.controller.ControllerInstrumentos;
import java.sql.SQLException;
import java.util.List;
import projetomusica.model.bean.Instrumentos;

public class ManterInstrumentos {

    static ControllerInstrumentos contIns;

    public static void inserir() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog("Nome");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
        String tipo = JOptionPane.showInputDialog("Tipo");
        Instrumentos instEntrada = new Instrumentos(nome, valor, tipo);
        contIns = new ControllerInstrumentos();
        Instrumentos instSaida = contIns.inserir(instEntrada);
        JOptionPane.showMessageDialog(null, instSaida.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("Nome");
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
        String tipo = JOptionPane.showInputDialog("Tipo");
        Instrumentos instEntrada = new Instrumentos(id, nome, valor, tipo);
        contIns = new ControllerInstrumentos();
        Instrumentos instSaida = contIns.alterar(instEntrada);
        JOptionPane.showMessageDialog(null, instSaida.toString());
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Instrumentos instEntrada = new Instrumentos(id);
        contIns = new ControllerInstrumentos();
        Instrumentos instSaida = contIns.buscar(instEntrada);
        JOptionPane.showMessageDialog(null, instSaida.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog(null, "NOME");
        Instrumentos instEntrada = new Instrumentos(nome);
        contIns = new ControllerInstrumentos();
        List<Instrumentos> listainstSaida = contIns.listar(instEntrada);

        for (Instrumentos ins : listainstSaida) {
            JOptionPane.showMessageDialog(null, ins.toString());
        }
    }

    public static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Instrumentos instEntrada = new Instrumentos(id);
        contIns = new ControllerInstrumentos();
        Instrumentos instSaida = contIns.excluir(instEntrada);
        JOptionPane.showMessageDialog(null, instSaida.toString());
    }

    //valida só no usuario
    /*public static boolean valida() throws SQLException, ClassNotFoundException {
        boolean validado = false;
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        Instrumentos instEntrada = new Instrumentos(login, senha);
        contIns = new ControllerInstrumentos();
        validado = contIns.validar(instEntrada);
        JOptionPane.showMessageDialog(null, "Usuario = " + validado);
        return validado;
    }*/
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
