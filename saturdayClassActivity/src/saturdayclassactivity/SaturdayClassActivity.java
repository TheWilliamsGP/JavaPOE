/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saturdayclassactivity;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author sadeeqwilliams
 */
public class SaturdayClassActivity {
    private static final Scanner myObj = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
//         int num ;
//         int num1 = 10;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number below 10");
//         num = sc.nextInt();
//         while(num>num1){
//             if(num>num1)
//                 System.out.println("too high");
//             else 
//                 System.out.println("thanks");
//                 System.out.println("Try again");
//                num = sc.nextInt();
//                num++;
//        int quit  ;
//        int comingSoon  ;
//        int addTask ;
//        int option ;
//        boolean isYes;
//             String[] options = new String[] {"Quit", "Coming Soon", "Add Task"};
//    int response = JOptionPane.showOptionDialog(null, "What would you like todo", "Welcome to EasyKanban",
//        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
//        null, options, options[0]);


choose options =  new choose(); 
String response = JOptionPane.showInputDialog(null, " What would you like todo", "Welocome to kanban",JOptionPane.QUESTION_MESSAGE);
int a = Integer.parseInt(response);
    }
}
//        System.out.println("1: Add Tasks 2: Coming Soon 3: Quit");  
//        option = myObj.nextInt();
//        
//        while (option < 2)
//            if(option > 1)
//                System.out.println("Coming Soon");
//            else if (option > 2)
//                System.out.println("Thank You");
//            else System.out.println("Thank You");
//        
//        option++;
//    }
    

    
    
//   Scanner type=new Scanner(System.in);
//   
//        int num=1;
//        System.out.println("Enter a number ");
//        int num1=type.nextInt();
//
//        int i=1;
//
//         if(num1 < 10) {
//           System.out.println("To Low");
//          }
//         else{
//
//              while(i<=num)
//              {
////               fact*=i;
//               i++;    
//               }
//        System.out.println("Factorial of number " + num + " is " + fact);
//       }
//    }
//
//}

//System.out.println("Enter a non negative number :: ");
//int num = type.nextInt();
//while(num < 0){
//    System.out.println("The number you entered was negative!");
//    System.out.println("Enter a non negative number :: ");
//    num = type.nextInt();
//    int age = 60;
//     if (age < 18){ //checks if your age is below 18
//        System.out.println("You a minor");
//    }else if (age< 40){//checks if your age is below 40
//         System.out.println("You are an adult");         
//    }else{
//         System.out.println("You're old retirement time");
//    }
//     
//      for (int i = 1; i <= 5; i = i + 1){// This loop will run the amount of times you tell it too
//          System.out.println(i);
//      }
//      int i = 0;
//      while (i < 5){
//          System.out.println(i);
//          i++;
//      }

//    int num1 ;
//    Scanner input = new Scanner(System.in);
//    System.out.println("A number above 20");
//     
//     
//        for (int i = 0; i < 4; i++) {
//        num1 = input.nextInt();
//        if (num1 < 20){
//           System.out.println("add another number");    
//        }else if (num1 > 20){
//            System.out.println("Meet requirments");
//        }
//        
//    }
//    }
//}