/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sadeeqwilliams
 */
public class main {
   
    private JFrame frame = new JFrame();
    private JButton CreateAccount = new JButton();
    private JButton Display = new JButton();
    
    //user variebales
    private ArrayList<user> userArray = new ArrayList<user>();
    private String name;
    private String surname;
    private String username;
    
  
            
    
    public main() {
        //frame attributes
        frame.setLayout(null);
        frame.setTitle("Login");
        frame.setSize(400,600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //btnCreateAccount
        CreateAccount.setText("Create Account");
        CreateAccount.setSize(200,50);
        CreateAccount.setLocation(90, 100);
        
        CreateAccount.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
        name = JOptionPane.showInputDialog("enter name:  ");
        surname = JOptionPane.showInputDialog("enter surname:  ");
        //username = JOptionPane.showInputDialog("enter username:  ");
      
        
        //add user to array
        user newUser = new user(name,surname,username);
        userArray.add(newUser);
    }
        
        }); 
        
        //btnCreateAccount
        Display.setText("Display");
        Display.setSize(200,50);
        Display.setLocation(90, 200);
        
        Display.addActionListener(new ActionListener(){
        @Override
        
        public void actionPerformed(ActionEvent e) {
      for (int i = 0; i < userArray.size(); i ++){
          JOptionPane.showMessageDialog(null,"Name:  " + userArray.get(i).getname());
          JOptionPane.showMessageDialog(null,"surname:  " + userArray.get(i).getsurname());
          //JOptionPane.showMessageDialog(null,"UserName:  " +  userArray.get(i).getUsername());
      
      }
    }
        
        }); 
        
        //add Objects to frame
        frame.add(CreateAccount);
        frame.add(Display);
}

 
    
    public static void main(String[] args) {
        new main();
    
}
}