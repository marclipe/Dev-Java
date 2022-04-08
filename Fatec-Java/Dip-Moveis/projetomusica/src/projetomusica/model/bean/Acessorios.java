package projetomusica.model.bean;

public class Acessorios {

    private int id;
    private String nome;
    private double valor;
    private int id_instrumentos; 

    public Acessorios(int id) {
        this.id = id;
    }
    
    public Acessorios(String nome) {
        this.nome = nome;
    }

    public Acessorios(String nome, double valor, int id_instrumentos) {
        this.nome = nome;
        this.valor = valor;
        this.id_instrumentos = id_instrumentos; 
    }

    public Acessorios(int id, String nome, double valor, int id_instrumentos) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.id_instrumentos = id_instrumentos; 
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId_instrumentos() {
        return id_instrumentos;
    }

    public void setId_instrumentos(int id_instrumentos) {
        this.id_instrumentos = id_instrumentos;
    }

    
    @Override
    public String toString() {
        return "Acessorio{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + '}';
    }
    
}
