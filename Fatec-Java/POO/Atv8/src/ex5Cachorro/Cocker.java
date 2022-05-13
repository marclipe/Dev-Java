package ex5Cachorro;

public class Cocker extends Cachorro {

    private boolean tosa;

    public Cocker(String nome, String raca, String tipo, String cor, boolean tosa) {
        super(nome, raca, tipo, cor);
        this.tosa = tosa;

    }

    public boolean precisaTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPrecisa de Tosa: " + (tosa ? "Sim" : "Não");
    }

}
