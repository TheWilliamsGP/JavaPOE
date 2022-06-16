/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE_Java;
    
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author sadeeqwilliams
 */


public class Create_Account extends JFrame  {

  /**
     *
     * @param Names
     * @param Surnames
     * @param Usernames
     * @param Passwords
     */
 //public ArrayList<User> userArray = new ArrayList<User>();
   
    private JFrame frame = new JFrame();
    private final JButton Cancel = new JButton();
    private JButton Confirm = new JButton();
    public JLabel NameLabel = new JLabel();
    private JLabel SurnameLabel = new JLabel();
    private JLabel UsernameLabel = new JLabel();
    private JLabel passwordLabel = new JLabel();
    private JLabel Header = new JLabel();
    private final JLabel Condition = new JLabel("<html>Your username should be no more than 5 charaters and should contain a underscore.<br/> The password should be atleast 8 characters long <br/> and contain atleast one Uppercase letter,<br/> one Lowercase letter,<br/> one Number and one Special Character.</html>");
    public JTextField NameText = new JTextField();
    private JTextField SurnameText = new JTextField();
    public JTextField usernameText = new JTextField();
    private JPasswordField passwordText = new JPasswordField();
    public String Names; 
    private String Surnames;   
    public String Usernames;
    private String Passwords;

    public Create_Account() {
   // }  
   // private static String Users[] = {Names, Surnames,Usernames, Passwords} ;
    


        //frame attributes
        frame.setLayout(null);
        frame.setTitle("Login");
        frame.setSize(550, 570);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(Confirm);
        
        
        Header = new JLabel("Create Account");
        Header.setBounds(70, 20, 400, 100);
        Header.setFont(new java.awt.Font("Kannada MN", 3, 48)); 
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frame.add(Header);
        
        
        NameLabel = new JLabel("Name");
        NameLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18)); 
        NameLabel.setBounds(100, 150, 80, 25);
        frame.add(NameLabel);
 
        NameText = new JTextField(20);
        NameText.setBounds(180, 150, 200, 24);
        frame.add(NameText);
        
        SurnameLabel = new JLabel("Surname");
        SurnameLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18));
        SurnameLabel.setBounds(100,190, 80, 25);
        frame.add(SurnameLabel);
 
        SurnameText = new JTextField(20);
        SurnameText.setBounds(180, 185, 200, 23);
        frame.add(SurnameText);
        
        UsernameLabel = new JLabel("Username");
        UsernameLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18));
        UsernameLabel.setBounds(100, 225, 80, 25);
        frame.add(UsernameLabel);
 
        usernameText = new JTextField(20);
        usernameText.setBounds(180, 220, 200, 29);
        frame.add(usernameText);
        
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 18));
        passwordLabel.setBounds(100, 265, 80, 25);
        frame.add(passwordLabel);
 
        passwordText = new JPasswordField(20);
        passwordText.setBounds(180, 260, 200, 29);
        frame.add(passwordText);
       
      
        Condition.setBounds(10, 350, 550, 150);
        frame.add(Condition);
        
          //btnCreateAccount
        Cancel.setText("Cancel");
        Cancel.setSize(85,25);
        Cancel.setLocation(260, 320);
        
        Cancel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           
    
            }
        }); 
        
        //btnCreateAccount
        Confirm.setText("Confrim");
        Confirm.setSize(85,25);
        Confirm.setLocation(170, 320);
        
        Confirm.addActionListener(new ActionListener(){
        @Override
     
        public void actionPerformed(ActionEvent ae) {
            
           
            
             //Names = NameText.getText();
             Surnames = SurnameText.getText() ;
            
             Usernames =  usernameText.getText();
          // } public String registerUser(String Username, String Password){
            if( checkUsername(Usernames)) {
            JOptionPane.showMessageDialog(null,"username correct");
            
            }
            
             else{
            JOptionPane.showMessageDialog(null,"username incorrect","error message",JOptionPane.ERROR_MESSAGE);
             }
    
        
            Passwords  = String.valueOf(passwordText.getPassword());
        

             if(checkPasswordComplexity(Passwords))// && checkUser(Username))
             {
            JOptionPane.showMessageDialog(null,"password correct");
    
             }else{
        
            JOptionPane.showMessageDialog(null,"password incorrect","error message",JOptionPane.ERROR_MESSAGE);
             }
           
             
             // NameLabel.setText(NameText.getText());
             // User newUser = new User(Name,Surname,Username, Password);
             //userArray.add(newUser); 
             
             if (ae.getSource().equals(Confirm)) {
            frame.dispose();
            Main main = new Main();
            main.setVisible(true);

             }
            
      
      
    }
        
        }); 
        
        //add Objects to frame
        frame.add(Confirm);
        frame.add(Cancel);
        frame.setVisible(true);
        
        
        
       
    
    }
        
 @Override
    
      

    public void setName(String Names) {
        this.Names = Names;
    }

    public String getName() {
        return Names;
    }
    public String getSurname() {
        return Surnames;
    }

    public void setSurname(String sSurnames) {
        this.Surnames = sSurnames;
    }

    public String getUsername() {
        return Usernames;
    }

    public void setUsername(String sUsernames) {
        this.Usernames = sUsernames;
    }

    public String getPassword() {
        return Passwords;
    }

    public void setPassword(String sPassword) {
        this.Passwords = sPassword;
    }
    
    public String[] toStringArray()
    {
        return new String[] { Names, Surnames,  Usernames, Passwords};
    
    }public  boolean checkUsername(String username){
        // no need to have conditional statements
        return username.contains("_") && username.length() <= 5;
    
    }
    public boolean checkPasswordComplexity(String word){
        boolean UpperC = false;
        boolean LowerC = false;
        boolean Num = false;
        boolean SpecialC = false;
        for (int i=0; i < word.length(); i++){
            if (Character.isUpperCase(word.charAt(i)))
               UpperC = true;
   
            if (Character.isLowerCase(word.charAt(i)))
               LowerC = true;
            
            if (Character.isDigit(word.charAt(i)))
                Num = true;
            
            if ( ! ((Character.getNumericValue(word.charAt(i)) > -1) && 
                    (Character.getNumericValue(word.charAt(i)) < 36)))
                SpecialC = true;
        }
        return (UpperC && LowerC && Num && SpecialC);
    }
        
            
        
   
 
    public static void main(String[] args) {
        Create_Account create_Account = new Create_Account();
          create_Account.setVisible(true);
    
 }
    
}

