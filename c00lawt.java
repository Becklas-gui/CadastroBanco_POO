import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;


public class c00lawt {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 1 - JPanel e JButton");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 255);
    frame.setLocationRelativeTo(null);

    JPanel panel = new JPanel();
         panel.setBackground(Color.BLACK); 
         panel.setBorder(BorderFactory.createTitledBorder("Java Swing - Desenvolvimento de Sistemas")); 

//----------------------------------------------------------------------
    private void centralizar(){
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension janela = getSize();
        if (janela.height>screen.height)
        setSize(screen.width,screen.height);
        if(janela.width>screen.width);
        setSize(screen.width,janela.height);
        setLocation((screen.width - janela.width)/2,
            (screen.height - janela.height)/2);
    }
        
    }
}
//----------------------------------------------------------------------   
