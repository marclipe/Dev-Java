package praticaum;


import praticaum.view.ManterUsuario; 

public class PraticaUm {

    public static void main(String[] args) {
        if (ManterUsuario.valida()) {
            ManterUsuario.inserir(); 
        } else {
            System.out.println("[ERRO USUARIO IVALIDO]");
        }
    }

}
