package projetomusica.controller;

import java.util.List;
import java.sql.SQLException;
import projetomusica.model.bean.Usuario;
import projetomusica.model.dao.DaoUsuario;

public class ControllerUsuario {

    DaoUsuario daoUsu = null;

    public Usuario excluir(Usuario usu) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.excluir(usu);
    }

    public Usuario alterar(Usuario usu) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.alterar(usu);
    }

    public List<Usuario> listar(Usuario usu) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.listar(usu);
    }

    public Usuario buscar(Usuario usu) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.buscar(usu);
    }

    public Usuario inserir(Usuario usu) throws SQLException, ClassNotFoundException {
        daoUsu = new DaoUsuario();
        return daoUsu.inserir(usu);
    }

    public boolean validar(Usuario usuEntrada) throws SQLException, ClassNotFoundException {
        boolean validado = false;
        daoUsu = new DaoUsuario();
        Usuario usuSaida = daoUsu.validar(usuEntrada);
        if (usuEntrada.getLogin().equals(usuSaida.getLogin())) {
            if (usuEntrada.getSenha().equals(usuSaida.getSenha())) {
                validado = true;
            }
        }
        return validado;
    }

}
