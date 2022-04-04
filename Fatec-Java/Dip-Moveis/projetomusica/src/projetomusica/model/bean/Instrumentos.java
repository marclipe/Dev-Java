package projetomusica.model.bean;

public class Instrumentos {

    private int id;
    private String nome;
    private String valor;
    private String tipo;

    public Instrumentos(int id) {
        this.id = id;
    }

    public Instrumentos(String nome, String valor, String tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Instrumentos(int id, String nome, String valor, String tipo) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Instrumentos(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setLogin(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Usuario{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + ", tipo=" + tipo + '}';
    }

    public Object getLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
