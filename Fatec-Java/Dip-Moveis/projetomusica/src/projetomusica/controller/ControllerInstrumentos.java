package projetomusica.controller;

import java.util.List;
import java.sql.SQLException;
import projetomusica.model.bean.Instrumentos;
import projetomusica.model.dao.DaoInstrumentos;

public class ControllerInstrumentos {

    DaoInstrumentos daoIns = null;

    public Instrumentos excluir(Instrumentos ins) throws SQLException, ClassNotFoundException {
        daoIns = new DaoInstrumentos();
        return daoIns.excluir(ins);
    }

    public Instrumentos alterar(Instrumentos ins) throws SQLException, ClassNotFoundException {
        daoIns = new DaoInstrumentos();
        return daoIns.alterar(ins);
    }

    public List<Instrumentos> listar(Instrumentos ins) throws SQLException, ClassNotFoundException {
        daoIns = new DaoInstrumentos();
        return daoIns.listar(ins);
    }

    public Instrumentos buscar(Instrumentos ins) throws SQLException, ClassNotFoundException {
        daoIns = new DaoInstrumentos();
        return daoIns.buscar(ins);
    }

    public Instrumentos inserir(Instrumentos ins) throws SQLException, ClassNotFoundException {
        daoIns = new DaoInstrumentos();
        return daoIns.inserir(ins);
    }

}
