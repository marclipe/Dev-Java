package calculadora;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;


public class Calculadora extends JFrame{

    
    public Calculadora() throws Exception{
        super("Calculadora");
        
        //UIManager.setLookAndFeel("com.sun.java.plaf.windows.WindowsLookAndFeel");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setSize(350, 350);
        setLocation(400, 200); 
        
        setLayout(new BorderLayout());
        
        TextoPainel textpainel = new TextoPainel(); 
        add(BorderLayout.NORTH, textpainel); 
        
        /*Painel inferior*/
        /*Painel Esquerda*/
        JPanel painelDigital = new JPanel(); 
        painelDigital.setLayout(new BorderLayout());
        painelDigital.add(BorderLayout.CENTER, new PainelNumero(textpainel.getTxtNumber())); 
        
        /*Painel da Direita*/
        painelDigital.add(BorderLayout.EAST, new PainelOperacao(textpainel.getTxtNumber())); 
        
        
        add(BorderLayout.CENTER, painelDigital); 
        
        
        setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Calculadora(); 
    }

}
