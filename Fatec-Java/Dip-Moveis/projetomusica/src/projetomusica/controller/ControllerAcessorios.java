package projetomusica.controller;

import java.util.List;
import java.sql.SQLException;
import projetomusica.model.bean.Acessorios;
import projetomusica.model.dao.DaoAcessorios;

public class ControllerAcessorios {

    DaoAcessorios daoAce = null;

    public Acessorios excluir(Acessorios ace) throws SQLException, ClassNotFoundException {
        daoAce = new DaoAcessorios();
        return daoAce.excluir(ace);
    }

    public Acessorios alterar(Acessorios ace) throws SQLException, ClassNotFoundException {
        daoAce = new DaoAcessorios();
        return daoAce.alterar(ace);
    }

    public List<Acessorios> listar(Acessorios ace) throws SQLException, ClassNotFoundException {
        daoAce = new DaoAcessorios();
        return daoAce.listar(ace);
    }

    public Acessorios buscar(Acessorios ace) throws SQLException, ClassNotFoundException {
        daoAce = new DaoAcessorios();
        return daoAce.buscar(ace);
    }

    public Acessorios inserir(Acessorios ace) throws SQLException, ClassNotFoundException {
        daoAce = new DaoAcessorios();
        return daoAce.inserir(ace);
    }

}
