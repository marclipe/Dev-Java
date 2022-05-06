package projetomusica.model.dao;

import projetomusica.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import projetomusica.model.bean.Compras;

public class DaoCompras {

    private final Connection c;

    public DaoCompras() throws SQLException, ClassNotFoundException {
        this.c = new Conexao().getConnection();
    }

    public Compras inserir(Compras ins) throws SQLException {
        String sql = "insert into compras (valor_total, id_instrumentos, id_clientes) values (?,?,?)";

        // prepared statement para inserção
        PreparedStatement COMP = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        COMP.setDouble(1, ins.getValor_total());
        COMP.setInt(2, ins.getId_instrumentos());
        COMP.setInt(3, ins.getId_clientes());

        // executa
        COMP.executeUpdate();
        ResultSet rs = COMP.getGeneratedKeys();
        if (rs.next()) {
            ins.setId(rs.getInt(1));
        }
        COMP.close();
        return ins;
    }

    public Compras buscar(Compras ins) throws SQLException {
        String sql = "select * from compras WHERE id_compras = ?";
        PreparedStatement COMP = this.c.prepareStatement(sql);
        // seta os valores
        COMP.setInt(1, ins.getId());
        // executa
        ResultSet rs = COMP.executeQuery();
        Compras retorno = null;
        while (rs.next()) {
            retorno = new Compras(
                    rs.getInt(1),
                    rs.getDouble(2),
                    rs.getInt(3),
                    rs.getInt(4)
            );
        }
        COMP.close();
        return retorno;
    }

    public Compras alterar(Compras comp) throws SQLException {
        System.out.println(comp.getId());
        String sql = "UPDATE compras SET valor_total = ?, id_instrumentos = ?, id_clientes = ? WHERE id_compras = ?";
        // prepared statement para inserção
        PreparedStatement COMP = c.prepareStatement(sql);
        // seta os valores
        COMP.setDouble(1, comp.getValor_total());
        COMP.setInt(2, comp.getId_instrumentos());
        COMP.setInt(3, comp.getId_clientes());
        COMP.setInt(4, comp.getId());

        // executa
        COMP.execute();
        COMP.close();
        return comp;
    }

    public Compras excluir(Compras comp) throws SQLException {
        String sql = "delete from compras WHERE id_compras = ?";
        // prepared statement para inserção
        PreparedStatement COMP = c.prepareStatement(sql);
        // seta os valores
        COMP.setInt(1, comp.getId());
        // executa
        COMP.execute();
        COMP.close();
        c.close();
        return comp;
    }

}

