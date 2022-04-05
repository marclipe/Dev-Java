package projetomusica.model.bean;

public class Instrumentos {

    private int id;
    private String nome;
    private double valor;
    private String tipo;

    public Instrumentos(int id) {
        this.id = id;
    }
    
    public Instrumentos(String nome) {
        this.nome = nome;
    }

    public Instrumentos(String nome, double valor, String tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Instrumentos(int id, String nome, double valor, String tipo) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Instrumentos(int aInt, String string, String string0, String string1, String string2) {
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + ", tipo=" + tipo + '}';
    }

    public String getLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
