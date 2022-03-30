package listadeexercicios04funcoes;

import javax.swing.JOptionPane;

public class ExercicioSeven {

    static {

        JOptionPane.showMessageDialog(null, "Este programa exibir o fatorial a "
                + " partir de um número informado pelo usuário.\n\n\n");
    }

    public static int fatorial(int a) {

        int fatorial = 1;
        int aux = 0;

        for (int i = 1; i < a; i++) {
            aux = i + 1;
            fatorial *= aux;
        }
        return fatorial;
    }

    public static void comeco() {

        try {

            String numero = JOptionPane.showInputDialog(null, "Informe um número "
                    + ":", "Entrada", 1);

            if (numero.equals("")) {

                throw new Exception("NOVA_REGRA");
            }

            int numeroConvertido = Integer.parseInt(numero);

            int fatorial = fatorial(numeroConvertido);

            JOptionPane.showMessageDialog(null, "O fatorial de " + numeroConvertido + " é " + fatorial);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Apenas números são permitidos!");

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Verifique o número digitado!");

        } catch (Exception NOVA_REGRA) {
            JOptionPane.showMessageDialog(null, "Este campo não pode ser vazio!");

        } finally {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "CONFIRMAÇÃO", 2, 3, null);

            if (resp == 0) {
                comeco();
            }
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        comeco();
    }
}