package projetomusica.model.bean;

public class Clientes {

    private String nome;
    private String cpf;
    private String produto;
    private String email;
    private int id;

    public Clientes(int id) {
        this.id = id;
    }

    public Clientes(String nome) {
        this.nome = nome;
    }

    public Clientes(String nome, String cpf, String produto, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.produto = produto;
        this.email = email;
    }

    public Clientes(int id, String nome, String cpf, String produto, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.produto = produto;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {

        return "Cliente{" + "  nome " + nome + "cpf=" + cpf + ", produto=" + produto + ", email=" + email + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
