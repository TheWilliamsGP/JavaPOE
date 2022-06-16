/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE_Java;

/**
 *
 * @author sadeeqwilliams
 */
public class User {
    
    private String Name; 
    private String Surname;   
    private String Username; 
    private String Password;

    
     /**
     *
     * @param Aname
     * @param Asurname
     * @param AUsername
     * @param Apassword
     */
    public User(String Aname,String Asurname,String AUsername, String Apassword){
        
        Name = Aname;
        Surname = Asurname;
        Username = AUsername ;
        Password = Apassword;
    
    
      }

    User(String Name, String Surname, String Username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public String getname(){
        return Name; 
        
          }public String getsurname(){
        return Surname;  
        
          }public String getUsername(){
        return Username;  
          }
          
          public String getpassword(){
              return Password;
          }
        
        
    
}
