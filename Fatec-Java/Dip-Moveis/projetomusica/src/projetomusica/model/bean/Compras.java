package projetomusica.model.bean;

public class Compras {

    private int id;
    private double valor_total;
    private int id_instrumentos;
    private int id_clientes;
    
    public Compras(int id) {
        this.id = id;
    }

    public Compras(double valor_total, int id_instrumentos, int id_clientes) {
        this.valor_total = valor_total;
        this.id_instrumentos = id_instrumentos;
        this.id_clientes = id_clientes;
    }

    public Compras(int id, double valor_total, int id_instrumentos, int id_clientes) {
        this.id = id;
        this.valor_total = valor_total;
        this.id_instrumentos = id_instrumentos;
        this.id_clientes = id_clientes;
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
    
    @Override
    public String toString() {
        return "Acessorio{" + "id=" + id + ", Valor Total=" + valor_total + ", ID Instrumentos=" + id_instrumentos + ", ID Instrumentos=" + id_clientes + '}';
    }
}
