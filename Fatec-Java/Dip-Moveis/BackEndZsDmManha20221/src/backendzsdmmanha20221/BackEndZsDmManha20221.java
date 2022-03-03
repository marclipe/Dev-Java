/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzsdmmanha20221;

import backendzsdmmanha20221.view.ManterUsuario;

/**
 *
 * @author ProfAlexandre
 */
public class BackEndZsDmManha20221 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        if(ManterUsuario.valida()) {
            ManterUsuario.inserir();
        } else {
            System.out.println("USUARIO INVALIDO");
        }
        
    }
    
}
