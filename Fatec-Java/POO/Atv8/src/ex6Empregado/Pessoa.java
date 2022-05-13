package ex6Empregado;

public class Pessoa {

    private String nome;
    private int idade;
    private int altura;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public Pessoa(String nome, int idade, int altura, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nome:" + nome + "\nidade:" + idade + "\naltura:" + altura + "\nsexo:" + sexo;
    }

}
