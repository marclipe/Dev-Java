package calculadora;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelOperacao extends JPanel implements ActionListener{
    
    private JTextField textText; 

    public PainelOperacao(JTextField txtField)
    {
        this.textText = textText; 
        
        setLayout(new GridLayout(4,3));
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
