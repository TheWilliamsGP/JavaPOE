/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

/**
 *
 * @author sadeeqwilliams
 */
public class user {
    
    
    
    private String name; 
    private String surname;   
    private String Username;  

    
     /**
     *
     * @param name
     * @param surname
     * @param Username
     * @param password
     */
    public user(String Aname,String Asurname,String AUsername){
        
        name = Aname;
        surname = Asurname;
        AUsername = Username;
       
    
    
      }public String getname(){
        return name; 
        
          }public String getsurname(){
        return surname;  
        
          }public String getUsername(){
        return Username;  
        
       
}

}