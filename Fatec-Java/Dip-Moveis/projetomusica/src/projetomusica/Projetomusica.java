package projetomusica;

import projetomusica.view.ManterUsuario;
import projetomusica.view.ManterInstrumentos; 
import projetomusica.view.ManterClientes; 
import projetomusica.view.ManterAcessorios; 
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Projetomusica {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        if (ManterUsuario.valida()) {
            menu();
        } else {
            System.out.println("USUARIO INVALIDO");
        }
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair \n 1 - Usuario \n 2 - Cliente \n 3 - Instrumentos \n 4 - Acessórios"));
        switch (operacao) {
            case 0:
                int sair = JOptionPane.showConfirmDialog(null, "Deseja Sair");
                if (sair > 0) {
                    menu();
                }
                System.out.println("Valor de Sair = " + sair);
                break;
            case 1:
                ManterUsuario.menu();
                break;
            case 2:
                ManterClientes.menu();
                break;
            case 3:
                ManterInstrumentos.menu();
                break;
            case 4:
                ManterAcessorios.menu();
                break;
            default:        
                JOptionPane.showMessageDialog(null, "Erro opcao invalida");
                menu();
                break;
        }
    }

}
