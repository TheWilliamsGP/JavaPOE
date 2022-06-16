/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sadeeq_st10070002;

import java.util.Scanner;


/**
 *
 * @author sadeeqwilliams
 */
public class Login {

    // Declare & initialise class variables
    public static User user = new User();    
    private static final User[] userList = new User[2];                  
    private static final Scanner myObj = new Scanner(System.in);  //Create a Scanner object
    private static boolean login = false;
    public static Task task = new Task(); 
    
  //  public static TaskClass taskClass = new TaskClass();
   
    public Login(User user) {

    }

    public static boolean checkUserExists(String username) {     //Allows the user to be stored into a list
        boolean userExists = false;

        for (User u : userList) {
            if (username.equalsIgnoreCase(user.getUsername())) {
                userExists = true;
            } else userExists = false;
            }
            return userExists;
        } 
   
    public static boolean checkUserName(String username) {    //This methods is checking if the username  is properly formatted
        String usernameTrue = "Username successfully captured";
        String usernameFalse = "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length .";

        if (username.contains("_") && username.length() <= 5) { 
            System.out.println(usernameTrue);
            return true;
        } else {
            System.out.println(usernameFalse);
        }
        return false;
    }   

    public static boolean checkPasswordComplexity(String password) {  //This methods is checking if the Password  is properly formatted
        boolean uppercase = false;
        boolean lowercase = false;
        boolean numeric = false;
        
        boolean specialCharacters = false;
        for (int i = 0; i < password.length(); i++) {
            //validate password Alphanumeric & special characters
            if (Character.isUpperCase(password.charAt(i))) uppercase = true;  
            if (Character.isLowerCase(password.charAt(i))) lowercase = true;
            if (Character.isDigit(password.charAt(i))) numeric = true; 
            if (!((Character.getNumericValue(password.charAt(i)) > -1) && (Character.getNumericValue(password.charAt(i)) < 36))) {
                specialCharacters = true;   //testing if the Passowrd is has an Uppercase LowerCase and a Number 
            }
        }
        return (specialCharacters);
    } 

    public static String registerUser() {
        String invalidUserName = "The username is incorrectly formatted";
        String invalidPassword = "The password is not correctly formatted, please ensure that the password contains at least 8 characters, a capiital letter, a number and a special character.";
        String response = "The two above conditions have been met and the user has been registered successfully ";
        
        System.out.println("Create Account");
        System.out.println("---------------------------");
        System.out.println("Enter First Name");                                          //scanner input for First name
        user.setFirstName(myObj.next());
       
        System.out.println("Enter Last Name");                                          //scanner input for Last name
        user.setLastName(myObj.next());

        System.out.println("Create Username with '_', and no more than 5 characters");
        user.setUsername(myObj.next());                                              //scanner input for Username   
        while (checkUserName(user.getUsername()) == false) {
            System.out.println(invalidUserName);
            System.out.println("Enter Username");
            user.setUsername(myObj.next());
        }
        System.out.println("Create Password");                                          
        user.setPassword(myObj.next());                                               //scanner input for Password
        while (checkPasswordComplexity(user.getPassword()) == false) {
            System.out.println(invalidPassword);
            System.out.println("Enter Password");
            user.setPassword(myObj.next());
        }        
        // user gets created and stored
        userList[0] = new User(user.getFirstName(), user.getLastName(), user.getUsername(), user.getPassword());
        System.out.println(response);      
        
        return user.toString();
    }   
    
    public static boolean loginUser() {

        
        //Asking for username and password to login
        System.out.println("Enter Username");
        String userInput = myObj.next();
        System.out.println("Enter Password");
        String passwordInput = myObj.next();
        
        
        //checking if both username and password is from a account created
        if((checkUserExists(userInput) == true) && (user.getPassword().equals(passwordInput))){
            login = true;
            System.out.println(user.toString());
        } //Else  will print incorrect message and start over 
        if ((checkUserExists(userInput) == false) || (!user.getPassword().equals(passwordInput))){
            login = false;
            System.out.println("Username or password incorrect, please try again");
        }
        
        return login;
    }   

    public static String returnLoginStatus() {
        
        
        String loginSuccess = "Welcome " + user.getFirstName() + " " + user.getLastName() + " ,it is great to see you again.";   //message displays once the user is succefully logged in   
        String loginFailed = "Username or password incorrect, please try again";  //message displays once the user typed in a incorrect username or password  
        
        System.out.println("Login");
        System.out.println("---------------------------");
        if (loginUser()==true){
            System.out.println(loginSuccess);
        }
        else if (loginUser() == false)
            System.out.println(loginFailed);
        System.out.println("---------------------------");
        return "";
   
    }
    
    public static void main(String[] args) { 
        registerUser();
        returnLoginStatus();

        TaskClass tasks = new TaskClass();
            tasks.createTaskID();
            tasks.printTaskDetails();
            tasks.TotalHours();
    }

}



