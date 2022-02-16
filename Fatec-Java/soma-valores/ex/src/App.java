import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int v1, v2, soma; 
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor 1: ");
        v1 = input.nextInt();
        System.out.println("Digite o valor 2: "); 
        v2 = input.nextInt();
        soma = v1 + v2;
        System.out.printf("\nSoma =d%", soma);
    }
}
