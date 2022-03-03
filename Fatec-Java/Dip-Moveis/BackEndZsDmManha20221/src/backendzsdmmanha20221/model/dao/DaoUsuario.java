/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzsdmmanha20221.model.dao;

import backendzsdmmanha20221.model.bean.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class DaoUsuario {
    
    public Usuario excluir(Usuario u) {
        return u;
    }

    public Usuario alterar(Usuario u) {
        return u;

    }

    public List<Usuario> listar(Usuario u) {
        List<Usuario> usus = new ArrayList<>();
        return usus;
        
    }

    public Usuario buscar(Usuario u) {
        return u;
        
    }

    public Usuario inserir(Usuario u) {
        return u; 
    }

    public Usuario valida(Usuario u) {
        if(u.getLogin().equals("XXX")) {
            u.setId(1000);
            u.setStatus("ATIVO");
            u.setTipo("ADM");
        } else {
            u.setId(000);
            u.setStatus("INATIVO");
            u.setTipo("NÃO");
        }
        return u; 
    }

    
}
