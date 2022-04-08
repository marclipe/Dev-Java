package projetomusica.model.dao;

import projetomusica.model.bean.Clientes;
import projetomusica.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DaoClientes {
    
    private final Connection c;
    
    public DaoClientes() throws SQLException, ClassNotFoundException{
        this.c = new Conexao().getConnection();
    }

    public Clientes excluir(Clientes clEntrada) throws SQLException {
        String sql = "delete from clientes WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement cli = c.prepareStatement(sql);
        // seta os valores
        cli.setInt(1,clEntrada.getId());
        // executa
        cli.execute();
        cli.close();
        c.close();
        return clEntrada;
    }

    public Clientes buscar(Clientes clEntrada) throws SQLException {
        String sql = "select * from clientes WHERE id = ?";
        PreparedStatement cli = this.c.prepareStatement(sql);
            // seta os valores
            cli.setInt(1,clEntrada.getId());
            // executa
            ResultSet rs = cli.executeQuery();
            Clientes retorno = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                retorno = new Clientes(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5));
            // adiciona o usu à lista de usus
            }
            cli.close();
        return retorno;

    }

    public Clientes inserir(Clientes clEntrada) throws SQLException {
        String sql = "insert into clientes" + " (nome, cpf, produto, email)" + " values (?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement cli = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        cli.setString(1,clEntrada.getNome());
        cli.setString(2,clEntrada.getCpf());
        cli.setString(3,clEntrada.getProduto());
        cli.setString(4,clEntrada.getEmail());

        // executa
        cli.executeUpdate();
        ResultSet rs = cli.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            clEntrada.setId(id);
        }
        cli.close();
        return clEntrada;
    }

    public Clientes alterar(Clientes clEntrada) throws SQLException {
        String sql = "UPDATE clientes SET nome = ?, cpf = ?, produtos = ?, email = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement cli = c.prepareStatement(sql);
        // seta os valores
        cli.setString(1,clEntrada.getNome());
        cli.setString(2,clEntrada.getCpf());
        cli.setString(3,clEntrada.getProduto());
        cli.setString(4,clEntrada.getEmail());
        cli.setInt(5,clEntrada.getId());

        // executa
        cli.execute();
        cli.close();
        return clEntrada;

    }

    public List<Clientes> listar(Clientes clEntrada) throws SQLException {
        // usus: array armazena a lista de registros

        List<Clientes> listacl = new ArrayList<>();
        
        String sql = "select * from clientes where nome like ?";
        PreparedStatement cli = this.c.prepareStatement(sql);
        // seta os valores
        cli.setString(1,"%" + clEntrada.getNome() + "%");
        
        ResultSet rs = cli.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Clientes cl = new Clientes(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)
            );
            // adiciona o usu à lista de usus
            listacl.add(cl);
        }
        
        rs.close();
        cli.close();
        
        return listacl;

    }
    
}