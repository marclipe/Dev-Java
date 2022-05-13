package ex2firma;

public class EmpregadoTeste {

    String primeiroNome;
    String sobrenome;
    double salarioMensal;
    double salarioAnual;
    double resultado;

    public EmpregadoTeste(String primeiroNome, String sobrenome, double salarioMensal, double salarioAnual) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioMensal < 0) {
            this.salarioMensal = 0;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public void Setvalores(String a, String b, double c, double d) {
        primeiroNome = a;
        sobrenome = b;
        salarioMensal = c;
        salarioAnual = d;
    }

    public double GetEmpregadoTeste() {
        salarioAnual = 10  + salarioMensal;
        return salarioAnual;
    }
}
