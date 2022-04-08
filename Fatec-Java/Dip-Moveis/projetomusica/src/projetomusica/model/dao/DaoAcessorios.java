package projetomusica.model.dao;

import projetomusica.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import projetomusica.model.bean.Acessorios;

public class DaoAcessorios {

    private final Connection c;
    private List<Acessorios> aces;

    public DaoAcessorios() throws SQLException, ClassNotFoundException {
        this.c = new Conexao().getConnection();
    }

    public Acessorios inserir(Acessorios ins) throws SQLException {
        String sql = "insert into acessorios (nome, valor, id_instrumentos) values (?,?, ?)";

        // prepared statement para inserção
        PreparedStatement acess = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        acess.setString(1, ins.getNome());
        acess.setDouble(2, ins.getValor());
        acess.setInt(3, ins.getId_instrumentos());

        // executa
        acess.executeUpdate();
        ResultSet rs = acess.getGeneratedKeys();
        if (rs.next()) {
            ins.setId(rs.getInt(1));
        }
        acess.close();
        return ins;
    }

    public Acessorios buscar(Acessorios ins) throws SQLException {
        String sql = "select * from acessorios WHERE id = ?";
        PreparedStatement acess = this.c.prepareStatement(sql);
        // seta os valores
        acess.setInt(1, ins.getId());
        // executa
        ResultSet rs = acess.executeQuery();
        Acessorios retorno = null;
        while (rs.next()) {
            // criando o objeto Usuario
            retorno = new Acessorios(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getInt(4)
            );
            // adiciona o usu à lista de usus
        }
        acess.close();
        return retorno;
    }

    public Acessorios alterar(Acessorios ace) throws SQLException {
        String sql = "UPDATE acessorios SET nome = ?, valor = ?, id_instrumentos = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement acess = c.prepareStatement(sql);
        // seta os valores
        acess.setString(1, ace.getNome());
        acess.setDouble(2, ace.getValor());
        acess.setInt(3, ace.getId_instrumentos());
        acess.setInt(4, ace.getId());

        // executa
        acess.execute();
        acess.close();
        return ace;
    }

    public Acessorios excluir(Acessorios ace) throws SQLException {
        String sql = "delete from acessorios WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement acess = c.prepareStatement(sql);
        // seta os valores
        acess.setInt(1, ace.getId());
        // executa
        acess.execute();
        acess.close();
        c.close();
        return ace;
    }

    public List<Acessorios> listar(Acessorios aceEnt) throws SQLException {
        // usus: array armazena a lista de registros
        //Trocar usuarios para instrumentos
        List<Acessorios> aces = new ArrayList<>();

        String sql = "select * from acessorios where nome like ?";
        PreparedStatement acess = this.c.prepareStatement(sql);
        // seta os valores
        //Nome para Instrumentos
        acess.setString(1, "%" + aceEnt.getNome() + "%");

        ResultSet rs = acess.executeQuery();

        while (rs.next()) {

            Acessorios ace = new Acessorios(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getInt(4)
            );
            // adiciona o usu à lista de usus
            aces.add(ace);
        }

        rs.close();
        acess.close();
        return aces;
    }

}
