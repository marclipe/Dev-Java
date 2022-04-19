package projetomusica.controller;

import java.util.List;
import java.sql.SQLException;
import projetomusica.model.bean.Compras;
import projetomusica.model.dao.DaoCompras;

public class ControllerCompras {

    DaoCompras daoCOMP = null;

    public Compras excluir(Compras comp) throws SQLException, ClassNotFoundException {
        daoCOMP = new DaoCompras();
        return daoCOMP.excluir(comp);
    }

    public Compras alterar(Compras comp) throws SQLException, ClassNotFoundException {
        daoCOMP = new DaoCompras();
        return daoCOMP.alterar(comp);
    }

    public Compras buscar(Compras comp) throws SQLException, ClassNotFoundException {
        daoCOMP = new DaoCompras();
        return daoCOMP.buscar(comp);
    }

    public Compras inserir(Compras comp) throws SQLException, ClassNotFoundException {
        daoCOMP = new DaoCompras();
        return daoCOMP.inserir(comp);
    }

}
