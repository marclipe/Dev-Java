/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzsdmmanha20221.view;

import javax.swing.JOptionPane;

import backendzsdmmanha20221.controller.ControllerUsuario;
import backendzsdmmanha20221.model.bean.Usuario;

/**
 *
 * @author ProfAlexandre
 */
public class ManterUsuario {
    
    static ControllerUsuario contUsu;

    public static void excluir() {
        
    }

    public static void alterar() {
        
    }

    public static void listar() {
        
    }

    public static void buscar() {
        
    }

    public static void inserir() {
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        String status = JOptionPane.showInputDialog("Status");
        String tipo = JOptionPane.showInputDialog("Tipo");
        Usuario usuEntrada = new Usuario(login, senha, status, tipo);
        contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.inserir(usuEntrada);
        JOptionPane.showMessageDialog(null, usuSaida.toString());
        
    }
    
    public static boolean valida() {
        boolean validado = false;
        String login = JOptionPane.showInputDialog("Login");
        String senha = JOptionPane.showInputDialog("Senha");
        Usuario usuEntrada = new Usuario(login, senha);
        contUsu = new ControllerUsuario();
        Usuario usuSaida = contUsu.valida(usuEntrada);
        JOptionPane.showMessageDialog(null, usuSaida.toString());
        if(usuSaida.getTipo().equals("ADM")) {
            validado = true;
        }
        return validado;
    }
    
    
}
