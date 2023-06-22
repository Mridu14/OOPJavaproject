/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package novelproject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author HP
 */
public class NovelProject {

    public static void main(String[] args) {
         JFrame j= new JFrame();
   j.setSize(600, 700);
   j.setTitle("NOVEL PRIZE");
   j.setLocationRelativeTo(null);
   j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   j.setLayout(null);
   
    Font f= new Font("Serif", Font.BOLD,35 );
    Font f2= new Font("serif", Font.CENTER_BASELINE ,20);
    
    
    JPanel heading= new JPanel();
    heading.setLayout(null);
     heading.setBounds(18, 10, 550,600);
     heading.setBackground(new Color(0,0,0,80));
    
    
     ////////////////////////////Label///////////////////////////////////
     JLabel l1= new JLabel("LAUREATES");
     l1.setBounds(180, 30, 300, 30);
     l1.setFont(f);
     l1.setForeground(Color.WHITE);
      heading.add(l1);
      
     JLabel l2= new JLabel();
     l2.setText("5 FAMOUS NOBEL PRIZE HOLDERS NAME ARE GIVEN:");
     l2.setBounds(20, 70, 550, 30);
     l2.setFont(f2);
     l2.setForeground(Color.WHITE);
      heading.add(l2);
      
     JLabel l3= new JLabel("CLICK ANY OF THESE TO SEE THE PICTURE:");
     l3.setFont(f2);
     l3.setBounds(20, 90, 500, 60);
     l3.setForeground(Color.WHITE);
      heading.add(l3);
      
      
    ///////////////////////////RadioButton///////////////////////////////////////
    
      JRadioButton rb1= new JRadioButton("Alfred Nobel");
      rb1.setBounds(50, 200, 220, 40);
      heading.add(rb1);
      
      JRadioButton rb2= new JRadioButton("Marie Curie");
      rb2.setBounds(300, 200, 220, 40);
     heading.add(rb2);
      
      JRadioButton rb3= new JRadioButton(" Abdus Salam");
      rb3.setBounds(50, 280, 220, 40);
      heading.add(rb3);
      
      JRadioButton rb4= new JRadioButton("Jhon B.Good Enough");     
      rb4.setBounds(300, 280, 220, 40);
      heading.add(rb4);
      
      JRadioButton rb5= new JRadioButton("Doris Lessing");
      rb5.setBounds(150, 350, 220, 40);
      heading.add(rb5);
      
      
     
      
      ButtonGroup bg1= new ButtonGroup();
      bg1.add(rb1);
      bg1.add(rb2);
      bg1.add(rb3);
      bg1.add(rb4);
      bg1.add(rb5);
 
      

      
     ///// ///////////////////////BUTTON/////////////////////////////////
      JButton b =new JButton();
      b.setText("CLICK");
      b.setBounds(200, 500, 200, 50);
     
      
      
      
      
 ////////////////////////////////////////IMAGE///////////////////////////////////
 
     ImageIcon ic= new ImageIcon("pct/galaxy.png");
    
     Image bck= ic.getImage();
     Image temp=bck.getScaledInstance(600,700, Image.SCALE_SMOOTH);
     ic= new ImageIcon(temp);
     JLabel im=new JLabel("",ic, (int) JLabel.CENTER);
    
     im.add(heading);
     im.add(b);
     im.setBounds(0, 0,600,700);
     im.setIcon(ic);
     j.add(im);
    
     
     
    /////////////////////////////////////NAVIGATE///////////////////////////////////////
    
    b.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       
           if(rb1.isSelected()){
               pctShow IMG=new pctShow("pct/Noble5.png"," Alfred Noble, (in Economics-1867) ");
               j.dispose();
           }
           
          else if(rb2.isSelected()){
              pctShow IMG=new pctShow("pct/noble4.png", "Marie Curie, (in Physics-1903)");
                 j.dispose();
           }
           
         else if(rb3.isSelected()){
              pctShow IMG=new pctShow("pct/nobel1.png", " Abdus Salam, (in Physics-1979)");
                 j.dispose();
           }
           
          else if(rb4.isSelected()){
              pctShow IMG=new pctShow("pct/Nobel3.png", "Jhon B.Good Enough,(in Chemistry-1969) ");
                 j.dispose();
           }
           
          else if(rb5.isSelected()){
               pctShow IMG=new pctShow("pct/noble2.png", "Doris Lessing,(In Literature-2007)");
                 j.dispose();
           }
          else{
              JOptionPane.showMessageDialog(j, "For god sake select something!!");
          }

           }
           
       
    });
     
     
       j.setVisible(true);


    }
   
}
