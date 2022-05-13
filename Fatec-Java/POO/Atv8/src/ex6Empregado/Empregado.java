package ex6Empregado;

public class Empregado extends Pessoa{

    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double obterLucros() {
        return this.salario;
    }
    
    public Empregado(String nome, int idade, int altura, char sexo, double salario) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
