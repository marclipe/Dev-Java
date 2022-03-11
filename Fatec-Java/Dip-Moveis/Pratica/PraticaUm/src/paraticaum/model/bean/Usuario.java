package paraticaum.model.bean;

public class Usuario {

    private int id;
    private String login;
    private String senha;
    private String status;
    private String tipo;

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

    public Usuario(String login, String senha, String status, String tipo) {
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }

    public Usuario(int id, String login, String senha, String status, String tipo) {
        this.id = id; 
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }
}
