package projetomusica.controller;

import java.util.List;
import java.sql.SQLException;
import projetomusica.model.bean.Instrumentos;
import projetomusica.model.bean.Usuario;
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

    public boolean validar(Instrumentos instEntrada) throws SQLException, ClassNotFoundException {
        boolean validado = false;
        daoIns = new DaoInstrumentos();
        Instrumentos instSaida = daoIns.validar(instEntrada);
        if (instEntrada.getLogin().equals(instSaida.getLogin())) {
            if (instEntrada.getSenha().equals(instSaida.getSenha())) {
                validado = true;
            }
        }
        return validado;
    }

    public List<Instrumentos> listar(Usuario instEntrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
