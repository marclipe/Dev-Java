package projetomusica.view;

import javax.swing.JOptionPane;
import projetomusica.controller.ControllerCompras;
import java.sql.SQLException;
import java.util.List;
import projetomusica.model.bean.Compras;

public class ManterCompras {

    static ControllerCompras contCOMP;

    public static void inserir() throws SQLException, ClassNotFoundException {
        double valor_total = Double.parseDouble(JOptionPane.showInputDialog("Valor Total"));
        int id_instrumentos = Integer.parseInt(JOptionPane.showInputDialog("ID Instrumentos"));
        int id_clientes = Integer.parseInt(JOptionPane.showInputDialog("ID Clientes"));
        String nome_clientes = JOptionPane.showInputDialog("Nome CLIENTE"); 
        Compras compEntrada = new Compras(valor_total, id_instrumentos, id_clientes, nome_clientes);
        contCOMP = new ControllerCompras();
        Compras compSaida = contCOMP.inserir(compEntrada);
        JOptionPane.showMessageDialog(null, compSaida.toString());
    }

    public static void alterar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        double valor_total = Double.parseDouble(JOptionPane.showInputDialog("Valor Total"));
        int id_instrumentos = Integer.parseInt(JOptionPane.showInputDialog("ID Instrumentos"));
        int id_clientes = Integer.parseInt(JOptionPane.showInputDialog("ID Clientes"));
        String nome_clientes = JOptionPane.showInputDialog("Nome CLIENTE"); 
        Compras compEntrada = new Compras(id, valor_total, id_instrumentos, id_clientes,nome_clientes);
        contCOMP = new ControllerCompras();
        Compras compSaida = contCOMP.alterar(compEntrada);
        JOptionPane.showMessageDialog(null, compSaida.toString());
    }
    
    //listar compras 
    public static void listar() throws SQLException, ClassNotFoundException {
        try {
        String nome_clientes = JOptionPane.showInputDialog("Nome CLIENTE"); 
        Compras compEntrada = new Compras(nome_clientes);
        contCOMP = new ControllerCompras();
        List<Compras> listaCOMPSaida = contCOMP.listar(compEntrada);
        for(Compras comp_ : listaCOMPSaida) {
            JOptionPane.showMessageDialog(null, comp_.toString());
        }
        } catch ( Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void buscar() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Compras compEntrada = new Compras(id);
        contCOMP = new ControllerCompras();
        Compras compSaida = contCOMP.buscar(compEntrada);
        JOptionPane.showMessageDialog(null, compSaida.toString());
    }

    public static void excluir() throws SQLException, ClassNotFoundException {
        int id = Integer.parseInt(JOptionPane.showInputDialog("ID"));
        Compras compEntrada = new Compras(id);
        contCOMP = new ControllerCompras();
        Compras aceSaida = contCOMP.excluir(compEntrada);
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
