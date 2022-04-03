package projetomusica;

import projetomusica.view.ManterUsuario;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Projetomusica {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        if (ManterUsuario.valida()) {
            menu();
        } else {
            System.out.println("USUARIO INVALIDO");
        }
    }

    public static void menu() throws SQLException, ClassNotFoundException {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair \n 1 - Usuario \n 2 - Pessoa \n 3 - Endereco \n 4 - UsuarioPessoa \n 5 - PessoaEndereco"));
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
                //ManterPessoaFisica.menu();
                break;
            case 3:
                //ManterLogradouro.menu();
                break;
            case 4:
                //ManterUsuarioPessoa.menu();
                break;
            case 5:
                //ManterPessoaLogradouro.menu();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro opcao invalida");
                menu();
                break;
        }
    }

}
