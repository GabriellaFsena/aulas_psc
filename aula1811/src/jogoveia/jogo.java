
package jogoveia;
import javax.swing.*;
import java.awt.*;
 
public class jogo {
    String jogadorInicial = "X";
    
    private JButton[] [] botoes ={
        {new JButton(), new JButton(), new JButton()},
        {new JButton(), new JButton(), new JButton()},
        {new JButton(), new JButton(),new JButton() },
    };
    
    public void show() {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);
    
    JPanel panel = new JPanel();
    panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
    panel.setLayout(new GridLayout(3,3));
    panel.setPreferredSize(new Dimension(500,500));
    
     for (int i = 0; i < 3; i++){
         for(int j = 0; j < 3; j++) {
             JButton btnAtual = botoes [i] [j];
             panel.add(btnAtual);
         }
     }
    JButton btnl = new JButton();
    frame.add(panel);
    frame.setVisible(true);
           
    
}
}