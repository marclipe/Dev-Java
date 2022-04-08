package projetomusica.controller;

import java.util.List;
import java.sql.SQLException;
import projetomusica.model.bean.Clientes;
import projetomusica.model.dao.DaoClientes;

public class ControllerClientes {

    DaoClientes daoCli = null;

    public Clientes excluir(Clientes cl) throws SQLException, ClassNotFoundException {
        daoCli = new DaoClientes();
        return daoCli.excluir(cl);
    }

    public Clientes alterar(Clientes cl) throws SQLException, ClassNotFoundException {
        daoCli = new DaoClientes();
        return daoCli.alterar(cl);
    }

    public List<Clientes> listar(Clientes cl) throws SQLException, ClassNotFoundException, Exception {
        daoCli = new DaoClientes();
        List<Clientes> clientes = daoCli.listar(cl);
        
        if(clientes == null) {
            throw new Exception("Não tem clientes cadastrados!");
        }
        return clientes;  
    }

    public Clientes buscar(Clientes cl) throws SQLException, ClassNotFoundException {
        daoCli = new DaoClientes();
        return daoCli.buscar(cl);
    }

    public Clientes inserir(Clientes cl) throws SQLException, ClassNotFoundException {
        daoCli = new DaoClientes();
        return daoCli.inserir(cl);
    }

}
