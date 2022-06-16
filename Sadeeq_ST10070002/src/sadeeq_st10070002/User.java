/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sadeeq_st10070002;

/**
 *
 * @author sadeeqwilliams
 */
public class User {
    
    
     // dcelare attributes for a user
   public String firstName,lastName,username,password;
   
    public User(){} 
    //override default constructor by initializing declared variables
    public User (String firstName,String lastName,String username,String password) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.username = username;
       this.password = password;
   }
      //getters and setter for the User
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() { return username;}

    
    public String[] toStringArray() { return new String [] {firstName,lastName}; }

   
}
    






