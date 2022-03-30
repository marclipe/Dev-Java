package lista_de_extwo;

public class Equacao {

    int a, b, c;
    double delta, R1, R2;

    public void SetLerEquacao(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
    }

    public int getDelta() {
        return (b * b) - (4 * a * c);
    }

    public double GetR1() {
        double r1 = (-b + Math.sqrt(delta)) / (2 * a);
        return r1;
    }

    public double GetR2() {
        double r2 = (-b - Math.sqrt(delta)) / (2 * a);
        return r2; 
    }

    Equacao() {
        a = 0;
        b = 0;
        c = 0;
        delta = 0;
    }
}
