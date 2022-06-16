/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looops;

/**
 *
 * @author sadeeqwilliams
 */
public class Looops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
     int age = 60;
     if (age < 18){ //checks if your age is below 18
        System.out.println("You a minor");
    }else if (age< 40){//checks if your age is below 40
         System.out.println("You are an adult");         
    }else{
         System.out.println("You're old retirement time");
    }
     
      for (int i = 1; i <= 5; i = i + 1){// This loop will run the amount of times you tell it too
          System.out.println(i);
      }
      int i = 0;
      while (i < 5){
          System.out.println(i);
          i++;
      }
    }
    
   
    
}
