/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomusica.model.dao;

import projetomusica.model.bean.Usuario;
import projetomusica.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class DaoInstrumentos {
    
    private final Connection c;
    
    public DaoInstrumentos() throws SQLException, ClassNotFoundException{
        this.c = new Conexao().getConnection();
    }

    public Instrumentos buscar(Instrumentos ins) throws SQLException{
        String sql = "select * from usuarios WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setInt(1,usu.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Instrumentos retorno = null;
            while (rs.next()) {      
            // criando o objeto Usuario
                retorno = new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5));
            // adiciona o usu à lista de usus
            }
            stmt.close();
        return retorno;
   }
    
    public Usuario alterar(Instrumentos ins) throws SQLException{
        String sql = "UPDATE usuarios SET login = ?, senha = ?, status = ?, tipo = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,usu.getLogin());
        stmt.setString(2,usu.getSenha());
        stmt.setString(3,usu.getStatus());
        stmt.setString(4,usu.getTipo());
        stmt.setInt(5,usu.getId());

        // executa
        stmt.execute();
        stmt.close();
        return usu;
    }

    public Usuario excluir(Usuario usu) throws SQLException{
        String sql = "delete from usuarios WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,usu.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return usu;
    }

    public List<Usuario> listar(Usuario usuEnt) throws SQLException{
        // usus: array armazena a lista de registros

        List<Usuario> usus = new ArrayList<>();
        
        String sql = "select * from usuarios where login like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + usuEnt.getLogin() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Usuario usu = new Usuario(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5)
            );
            // adiciona o usu à lista de usus
            usus.add(usu);
        }
        
        rs.close();
        stmt.close();
        return usus;
    }

    public Usuario validar(Usuario usu) throws SQLException {
        // cria o select para ser executado no banco de dados 
        String sql = "select * from usuarios WHERE login = ? AND senha = ?";
        // prepared statement para seleção
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,usu.getLogin());
        stmt.setString(2,usu.getSenha());
        // executa
        ResultSet rs = stmt.executeQuery();
        // percorrendo o rs
        Usuario retorno = null;
        while (rs.next()) {      
            // criando o objeto Usuario
            retorno = new Usuario(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5));
            // adiciona o usu à lista de usus
        }
        stmt.close();
        System.out.println("Usuario: " + retorno.toString());

        return retorno; 
    }
    
    public Usuario inserir(Usuario usu) throws SQLException{
        String sql = "insert into usuarios" + " (login, senha, status, tipo)" + " values (?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,usu.getLogin());
        stmt.setString(2,usu.getSenha());
        stmt.setString(3,usu.getStatus());
        stmt.setString(4,usu.getTipo());

        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            usu.setId(id);
        }
        stmt.close();
        return usu;
    }

    
}