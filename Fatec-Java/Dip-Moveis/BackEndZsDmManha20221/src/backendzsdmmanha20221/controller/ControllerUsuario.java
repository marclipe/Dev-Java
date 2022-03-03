/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzsdmmanha20221.controller;

import java.util.List;
import backendzsdmmanha20221.model.bean.Usuario;
import backendzsdmmanha20221.model.dao.DaoUsuario;

/**
 *
 * @author ProfAlexandre
 */
public class ControllerUsuario {
    
    DaoUsuario daoUsu;
    
    public Usuario excluir(Usuario u) {
        return daoUsu.excluir(u);
    }

    public Usuario alterar(Usuario u) {
        return daoUsu.alterar(u);
    }

    public List<Usuario> listar(Usuario u) {
        return daoUsu.listar(u);
    }

    public Usuario buscar(Usuario u) {
        return daoUsu.buscar(u);
    }

    public Usuario inserir(Usuario u) {
        daoUsu = new DaoUsuario();
        return daoUsu.inserir(u);
    }

    public Usuario valida(Usuario u) {
        daoUsu = new DaoUsuario();
        return daoUsu.valida(u);
    }
    
}
