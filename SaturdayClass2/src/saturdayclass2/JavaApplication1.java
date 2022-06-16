/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saturdayclass2;

/**
 *
 * @author sadeeqwilliams
 */
public class JavaApplication1 {
    String name = "John";
    String name2 = "Chad";
    int age = 233;
    int id = 12;
    char test = 'k';
    public static void main(String[] args) {
       
        JavaApplication1 testObject = new JavaApplication1();
        System.out.println("This is my name entered:" + testObject.name);
        if (testObject.age > 10){
            System.out.print("You are older than 10");
            if (testObject.name == "Bad"){
                System.out.println("Your results was bad");
      
            } else if(testObject.age < 20){
                System.out.println("You are older than 20");
            }else{
                System.out.println("You are younger than 10");
            }
        }else{
           System.out.print("Your results was good"); 
        }
        for(int i = 0; testObject.age > 5; i++){
            System.out.println(i);
        }
        
    } 
    
}   


