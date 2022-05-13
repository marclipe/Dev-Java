package ex3calculadora;

public class calculadora {

    private Double numberOne;
    private Double numberTwo;
    private char operation;

    public calculadora(Double numberOne, Double numberTwo, char operation) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operation = operation;
    }

    private Double sum() {
        return numberOne + numberTwo;
    }

    private Double subtraction() {
        return numberOne - numberTwo;
    }

    private Double multiplication() {
        return numberOne * numberTwo;
    }

    private Double division() {
        if (numberTwo != 0) {
            return numberOne / numberTwo;
        }

        throw new ArithmeticException("[ERRO] É um valor zero!");
    }

    public Double result() {
        switch (operation) {
            case '+':
                return sum();
            case '-':
                return subtraction();
            case '*':
                return multiplication();
            case '/':
                return division();
            default:
                return null;
        }
    }

}
