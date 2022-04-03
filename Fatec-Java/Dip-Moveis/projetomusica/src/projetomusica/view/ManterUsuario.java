package projetomusica.view;

import javax.swing.JOptionPane;
import projetomusica.controller.ControllerUsuario;
import projetomusica.model.bean.Usuario;
import java.sql.SQLException;
import java.util.List;

public class ManterUsuario {

    static ControllerUsuario contUsu;

    public static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario usuEntrada = new Usuario(id);
        contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.excluir(usuEntrada);
        JOptionPane.showMessageDialog(null, usuSaida.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");
        Usuario usuEntrada = new Usuario(id, login, senha, status, tipo);
        contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.alterar(usuEntrada);
        JOptionPane.showMessageDialog(null, usuSaida.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        String login = JOptionPane.showInputDialog("Login");
        Usuario usuEntrada = new Usuario(login);
        contUsu = new ControllerUsuario();
        List<Usuario> listaUsuSaida = contUsu.listar(usuEntrada);
        for (Usuario usu : listaUsuSaida) {
            JOptionPane.showMessageDialog(null, usu.toString());
        }
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Usuario usuEntrada = new Usuario(id);
        contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.buscar(usuEntrada);
        JOptionPane.showMessageDialog(null, usuSaida.toString());
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");
        Usuario usuEntrada = new Usuario(login, senha, status, tipo);
        contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.inserir(usuEntrada);
        JOptionPane.showMessageDialog(null, usuSaida.toString());
    }

    public static boolean valida() throws SQLException, ClassNotFoundException {
        boolean validado = false;
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        Usuario usuEntrada = new Usuario(login, senha);
        contUsu = new ControllerUsuario();
        validado = contUsu.validar(usuEntrada);
        JOptionPane.showMessageDialog(null, "Usuario = " + validado);
        return validado;
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
