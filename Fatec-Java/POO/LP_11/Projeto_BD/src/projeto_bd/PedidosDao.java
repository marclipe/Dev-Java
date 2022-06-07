package projeto_bd;


import java.sql.*; 

public class PedidosDao {
    public Pedidos aluno;
    public bd bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    private int numero;
    public static final byte INCLUSAO=1;
    public static final byte ALTERACAO=2;
    public static final byte EXCLUSAO=3;
}
