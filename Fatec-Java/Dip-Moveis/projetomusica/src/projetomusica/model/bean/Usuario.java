package projetomusica.model.bean;

public class Usuario {

    private int id;
    private String login;
    private String senha;
    private String status;
    private String tipo;
    private int id_clientes; 

    public Usuario(int id) {
        this.id = id;
    }

    public Usuario(String login) {
        this.login = login;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String login, String senha, String status, String tipo, int id_clientes) {
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
        this.id_clientes = id_clientes; 
    }

    public Usuario(int id, String login, String senha, String status, String tipo, int id_clientes) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
        this.id_clientes = id_clientes; 
    }

    public Usuario(String login, String senha, String status, String tipo) {
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", senha=" + senha + ", status=" + status + ", tipo=" + tipo + '}';
    }

}
