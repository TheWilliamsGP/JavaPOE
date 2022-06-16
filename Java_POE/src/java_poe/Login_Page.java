/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_poe;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java_poe.Reg;
/**
 *
 * @author sadeeqwilliams
 */
public class Login_Page implements ActionListener {
     
    

    
    public static final int UserName_LENGTH = 5;
    private static JLabel UsernameLabel;
    private static JTextField usernameText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton Login;
    private static JButton CreateACC;
    private static JButton Exit; 
    private static JLabel condition;
    private static JLabel Header;
    private static JLabel or;

    
    private static JLabel Head;
    
    
 

        public static void main(String[] args) {
    
       
        JPanel panel = new JPanel();
        
        panel.setBackground(new java.awt.Color(255,0,0));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 30));
        panel.setForeground(new java.awt.Color(0, 0, 0));
        
        
        JPanel panelT = new JPanel();
        panelT.setBounds(30, 30, 620, 50);
        panelT.setBackground(new java.awt.Color(255,255,255));
           
        JPanel panelb = new JPanel();
        panelb.setBounds(30, 385, 620, 50);
        panelb.setBackground(new java.awt.Color(255,255,255));
             
        JPanel panells = new JPanel();
        panells.setBounds(30, 30, 50, 400);
        panells.setBackground(new java.awt.Color(255,255,255));
        
        JPanel panelrs = new JPanel();
        panelrs.setBounds(600, 30, 50, 390);
        panelrs.setBackground(new java.awt.Color(255,255,255));
            
        JFrame frame = new JFrame();
        frame.setSize(680, 490);
        frame.setBackground(new java.awt.Color(204, 204, 204));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login");
        
        frame.add(panelb);
        frame.add(panells);
        frame.add(panelrs);
        frame.add(panel);
        frame.add(panelT);
        frame.add(panel);
        
        panel.setLayout(null);
        
       
        
     
       
        UsernameLabel = new JLabel();
        UsernameLabel.setIcon(new javax.swing.ImageIcon("/Users/sadeeqwilliams/Desktop/585e4bf3cb11b227491c339a.png")); 
        UsernameLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 24));
        UsernameLabel.setBounds(205, 165, 150, 35);
        panel.add(UsernameLabel);
 
        usernameText = new JTextField(20);
        usernameText.setBounds(245, 165, 200, 36);
        panel.add(usernameText);
        
        passwordLabel = new JLabel();
        passwordLabel.setIcon(new javax.swing.ImageIcon("/Users/sadeeqwilliams/Desktop/lock-icon-transparent-background-19.png")); 
        passwordLabel.setFont(new java.awt.Font("Kannada Sangam MN", 1, 24));
        passwordLabel.setBounds(200, 210, 150, 35);
        panel.add(passwordLabel);
 
        passwordText = new JPasswordField(20);
        passwordText.setBounds(245, 210, 200, 36);
        panel.add(passwordText);
        
        
        
        Header = new JLabel("Login");
        Header.setBounds(250, 50, 200, 25);
        Header.setFont(new java.awt.Font("Kannada MN", 3, 39)); 
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelT.add(Header);
        
        
        Login = new JButton("Login");
        Login.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        Login.setBounds(295, 260, 80, 25);
        Login.addActionListener(new Login_Page());
        panel.add(Login);
        
        CreateACC = new JButton("Create Account");
        CreateACC.setFont(new java.awt.Font("Helvetica Neue", 0, 18));
        CreateACC.setBounds(250, 320, 165, 25);
        CreateACC.addActionListener(new Login_Page());
        panel.add(CreateACC);
        
        Exit = new JButton("X");
        Exit.setBounds(580, 80, 20, 15);
        Exit.addActionListener(new Login_Page());
        panel.add(Exit);
        
        or = new JLabel("or");
        or.setFont(new java.awt.Font("Helvetica Neue", 0, 12));
        or.setBounds(330, 285, 150, 35);
        panel.add(or);
 
        
        
         frame.setVisible(true);
}
    
    Object frame;

    @Override
    public void actionPerformed(ActionEvent e) {
        
     Object source = e.getSource();
        if (source == CreateACC)
        {
         
            
        }
         
 
    }
}

