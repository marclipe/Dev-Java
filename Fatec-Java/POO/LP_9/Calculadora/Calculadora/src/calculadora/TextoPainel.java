package calculadora;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TextoPainel extends JPanel{
    
    
    private JTextField txtNumber; 
    
    /*Painel superior*/
    public TextoPainel() {
        setLayout(new FlowLayout());
        
        
        txtNumber = new JTextField(15);
        txtNumber.setHorizontalAlignment(JTextField.RIGHT);
        txtNumber.setEnabled(false);
        add(txtNumber); 
    }

    public JTextField getTxtNumber() {
        return txtNumber;
    }
    
    
}
