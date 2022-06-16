/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE_Java;
    
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
public class Main extends Create_Account {



   
    private JFrame frame = new JFrame();
    private JButton CreateAccount = new JButton();
    private JButton Display = new JButton();
    
    //user variebales
  // private ArrayList<User> userArray = new ArrayList<User>();
    //private String Name; 
    //private String Surname;   
    //private String Username;
    //private String Password;
  
            
    
    public Main() {
    
        
    
    
   
 String a,b,c,d;
  Create_Account obj = new Create_Account();
  
  a = obj.NameText.getText();
  //b = obj.Surname;
  //c = obj.usernameText.getText();
  //d = obj.Password;
  
//a = obj.NameText.getName();
        
  

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
      //  Name = JOptionPane.showInputDialog("enter name:  ");
       // Surname = JOptionPane.showInputDialog("enter surname:  ");
      //  Username = JOptionPane.showInputDialog("enter username:  ");
      
        
       // add user to array
       //User newUser = new User(Name,Surname,Username, Password);
       //userArray.add(newUser);
    }
        
        }); 
        
        //btnCreateAccount
        Display.setText("Display");
        Display.setSize(200,50);
        Display.setLocation(90, 200);
        
        Display.addActionListener(new ActionListener(){
        @Override
        
        public void actionPerformed(ActionEvent e) {
     // for (int i = 0; i < userArray.size(); i ++){
          JOptionPane.showMessageDialog(null,"Name:  " + (a)); //userArray.get(i).getname());
        //  JOptionPane.showMessageDialog(null,"surname:  " + (b)); //userArray.get(i).getsurname());
          //JOptionPane.showMessageDialog(null,"UserName:  " +  userArray.get(i).getUsername());
      
      
    }
       // }
        }); 
        
        //add Objects to frame
        frame.add(CreateAccount);
        frame.add(Display);
        frame.setVisible(true);
        
       
}

 //userArry<User> = String.
    
    public static void main(String[] args) {
        Main main = new Main();
        
        main.setVisible(true);
}

}