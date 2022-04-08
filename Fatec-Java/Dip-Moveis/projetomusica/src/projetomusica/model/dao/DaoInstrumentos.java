package projetomusica.model.dao;

import projetomusica.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import projetomusica.model.bean.Instrumentos;

public class DaoInstrumentos {

    private final Connection c;

    public DaoInstrumentos() throws SQLException, ClassNotFoundException {
        this.c = new Conexao().getConnection();
    }

    public Instrumentos inserir(Instrumentos ins) throws SQLException {
        String sql = "insert into instrumentos (nome, valor, tipo) values (?,?,?)";

        // prepared statement para inserção
        PreparedStatement instru = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        instru.setString(1, ins.getNome());
        instru.setDouble(2, ins.getValor());
        instru.setString(3, ins.getTipo());

        // executa
        instru.executeUpdate();
        ResultSet rs = instru.getGeneratedKeys();
        if (rs.next()) {
            ins.setId(rs.getInt(1));
        }
        instru.close();
        return ins;
    }

    public Instrumentos buscar(Instrumentos ins) throws SQLException {
        String sql = "select * from instrumentos WHERE id = ?";
        PreparedStatement instru = this.c.prepareStatement(sql);
        // seta os valores
        instru.setInt(1, ins.getId());
        // executa
        ResultSet rs = instru.executeQuery();
        Instrumentos retorno = null;
        while (rs.next()) {
            // criando o objeto Usuario
            retorno = new Instrumentos(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getString(4));
            // adiciona o usu à lista de usus
        }
        instru.close();
        return retorno;
    }

    public Instrumentos alterar(Instrumentos ins) throws SQLException {
        String sql = "UPDATE instrumentos SET nome = ?, valor = ?, tipo = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement instru = c.prepareStatement(sql);
        // seta os valores
        instru.setString(1, ins.getNome());
        instru.setDouble(2, ins.getValor());
        instru.setString(3, ins.getTipo());
        instru.setInt(4, ins.getId());

        // executa
        instru.execute();
        instru.close();
        return ins;
    }

    public Instrumentos excluir(Instrumentos ins) throws SQLException {
        String sql = "delete from instrumentos WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement instru = c.prepareStatement(sql);
        // seta os valores
        instru.setInt(1, ins.getId());
        // executa
        instru.execute();
        instru.close();
        c.close();
        return ins;
    }

    public List<Instrumentos> listar(Instrumentos insEnt) throws SQLException {
        // usus: array armazena a lista de registros
        //Trocar usuarios para instrumentos
        List<Instrumentos> inst = new ArrayList<>();

        String sql = "select * from instrumentos where nome like ?";
        PreparedStatement instru = this.c.prepareStatement(sql);
        // seta os valores
        //Nome para Instrumentos
        instru.setString(1, "%" + insEnt.getNome() + "%");

        ResultSet rs = instru.executeQuery();

        while (rs.next()) {

            Instrumentos ins = new Instrumentos(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDouble(3),
                    rs.getString(4)
            );
            // adiciona o usu à lista de usus
            inst.add(ins);
        }

        rs.close();
        instru.close();
        return inst;
    }

}
