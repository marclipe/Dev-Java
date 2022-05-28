package projetomusica.model.bean;

public class Compras {

    private int id;
    private double valor_total;
    private int id_instrumentos;
    private int id_clientes;
    private String nome_clientes; 
    
    public Compras(int id) {
        this.id = id;
    }

    public Compras(double valor_total, int id_instrumentos, int id_clientes, String nome_clientes) {
        this.valor_total = valor_total;
        this.id_instrumentos = id_instrumentos;
        this.id_clientes = id_clientes;
        this.nome_clientes = nome_clientes;
    }

    public Compras(int id, double valor_total, int id_instrumentos, int id_clientes, String nome_clientes) {
        this.id = id;
        this.valor_total = valor_total;
        this.id_instrumentos = id_instrumentos;
        this.id_clientes = id_clientes;
        this.nome_clientes = nome_clientes;
    }

    public Compras(String nome_clientes) {
        this.nome_clientes = nome_clientes;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public int getId_instrumentos() {
        return id_instrumentos;
    }

    public void setId_instrumentos(int id_instrumentos) {
        this.id_instrumentos = id_instrumentos;
    }

    public int getId_clientes() {
        return id_clientes;
    }

    public void setId_clientes(int id_clientes) {
        this.id_clientes = id_clientes;
    }

    public String getNome_clientes() {
        return nome_clientes;
    }

    public void setNome_clientes(String nome_clientes) {
        this.nome_clientes = nome_clientes;
    }

    @Override
    public String toString() {
        return "Compras{" + "id=" + id + ", valor_total=" + valor_total + ", id_instrumentos=" + id_instrumentos + ", id_clientes=" + id_clientes + ", nome_clientes=" + nome_clientes + '}';
    }
}
