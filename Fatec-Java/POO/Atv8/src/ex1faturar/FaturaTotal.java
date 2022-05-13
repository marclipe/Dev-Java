package ex1faturar;

public class FaturaTotal {

    int numero;
    String decricão;
    int quantidade;
    int preço;
    int total;

    public FaturaTotal(int numero, String decricão, int quantidade, int preço) {
        this.numero = numero;
        this.decricão = decricão;
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
        if (preço < 0) {
            this.preço = 0;
        } else {
            this.preço = preço;
        }

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDecricão() {
        return decricão;
    }

    public void setDecricão(String decricão) {
        this.decricão = decricão;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreço() {
        return preço;
    }

    public void setPreço(int preço) {
        this.preço = preço;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void Setvalores(int n, String d, int q, int p) {
        numero = n;
        decricão = d;
        quantidade = q;
        preço = p;
    }

    public float GetFaturarTotal() {

        total = quantidade * preço;
        return total;

    }
}
