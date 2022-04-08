package projetomusica.view;

import projetomusica.controller.ControllerClientes;
import projetomusica.model.bean.Clientes;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class ManterClientes {
    
    static ControllerClientes contCL;
    
    public static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Clientes clEntrada = new Clientes(id);
        contCL = new ControllerClientes();
        Clientes clSaida = contCL.excluir(clEntrada);
        JOptionPane.showMessageDialog(null, clSaida.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        String nome = JOptionPane.showInputDialog("Nome");
        String cpf = JOptionPane.showInputDialog("Cpf");
        String produto = JOptionPane.showInputDialog("Produto");
        String email = JOptionPane.showInputDialog("Email");
        Clientes clEntrada = new Clientes(id, nome, cpf, produto, email );
        contCL = new ControllerClientes();
        Clientes clSaida = contCL.alterar(clEntrada);
        JOptionPane.showMessageDialog(null, clSaida.toString());
    }

    public static void listar() throws SQLException, ClassNotFoundException {
        try {
        String nome = JOptionPane.showInputDialog("Nome");
        Clientes clEntrada = new Clientes(nome);
        contCL = new ControllerClientes();
        List<Clientes> listaCLSaida = contCL.listar(clEntrada);
        for(Clientes cl : listaCLSaida) {
            JOptionPane.showMessageDialog(null, cl.toString());
        }
        } catch ( Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Clientes pfEntrada = new Clientes(id);
        contCL = new ControllerClientes();
        Clientes clSaida = contCL.buscar(pfEntrada);
        JOptionPane.showMessageDialog(null, clSaida.toString());
    }

    public static void inserir() throws SQLException, ClassNotFoundException {
        String nome = JOptionPane.showInputDialog("Nome");
        String cpf = JOptionPane.showInputDialog("Cpf");
        String produto = JOptionPane.showInputDialog("Produto");
        String email = JOptionPane.showInputDialog("Email");
        Clientes clEntrada = new Clientes(nome,cpf, produto,email );
        contCL = new ControllerClientes();
        Clientes clSaida = contCL.inserir(clEntrada);
        JOptionPane.showMessageDialog(null, clSaida.toString());
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair \n 1 - Inserir \n 2 - Alterar \n 3 - Excluir \n 4 - Buscar \n 5 - Listar"));
        switch (operacao) {
            case 0:
               int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
               System.out.println("Valor de Sair = " + sair);
               if(sair > 0) menu();
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
               JOptionPane.showMessageDialog(null,"Erro opcao invalida");
               menu();
               break;
        }
    }

    
}