
package novelproject;
import java.awt.Image;
import javax.swing.*;

public class pctShow {
       pctShow( String IMAGE, String PROJECT_NAME){
        
        JFrame j= new JFrame();
   j.setSize(600, 700);
   j.setTitle(PROJECT_NAME);
   j.setLocationRelativeTo(null);
   j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   j.setLayout(null);
   
  
   ImageIcon icon= new ImageIcon(IMAGE); 
     Image bck= icon.getImage();
     Image temp=bck.getScaledInstance(600,700, Image.SCALE_SMOOTH);
     icon= new ImageIcon(temp);
     JLabel im=new JLabel("",icon, (int) JLabel.CENTER);
    
     im.setBounds(0, 0,600,700);
     im.setIcon(icon);
   
     j.add(im);
 
   
   
   j.setVisible(true);
   
       }
}


