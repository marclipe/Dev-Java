package exerciciosp3;

/*Um  programa  capaz  de  imprimir  todos  os  números  pares  em  um  intervalo de números informador pelo usuário;*/
import javax.swing.JOptionPane;

public class ExercicioOne {

    static double inicio, fim;

    public static void main(String[] args) {
        String Q = ""; 
        try {
            String x = JOptionPane.showInputDialog("Digite o um inicio: ");
            inicio = Double.parseDouble(x);
            
            String y = JOptionPane.showInputDialog("Digite o fim: "); 
            fim = Double.parseDouble(y); 
            

            for (inicio = inicio; inicio <= fim; inicio++) {
                if (inicio % 2 == 0) {
                    Q = Q + String.valueOf(inicio + " "); 
                }

            }
            JOptionPane.showMessageDialog(null, Q);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "[ERRO] Digite apenas números!!");
            System.exit(0);
        }

    }
}
