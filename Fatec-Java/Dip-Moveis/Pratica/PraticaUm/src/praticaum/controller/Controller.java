package praticaum.controller;

import java.util.List; 
import praticaum.bean.Usuario; 
import praticaum.model.dao.DaoUsuario; 

public class Controller {
    
    DaoUsuario daoUsu; 

    public Usuario excluir(Usuario u) {
        return daoUsu.excluir; 
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
