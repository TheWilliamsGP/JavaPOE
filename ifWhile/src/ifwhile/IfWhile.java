/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifwhile;

import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author sadeeqwilliams
 */
public class IfWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Scanner Sc = new Scanner(System.in);
        
//        System.out.println(" Please select an option : 1 Addtask, 2 Show report , 3 Quit");
//        int Response = Sc.nextInt();
//
//       while(Response<=2){
//       if (Response < 2)
//         {
//             for (int i = 0; i < 1; i++) {
//                 
//             
//                System.out.println("What is your name?");
//                String DeveloperName = Sc.next();
//                System.out.println("What is your surname?");
//                String DeveloperSurname = Sc.next();
//                System.out.println("What is the name of the task?");
//                String taskName = Sc.next();
//                System.out.println("What is the number of the task?");
//                int taskNumber = Sc.nextInt();
//                System.out.println("How long will it take?");
//                int hours= Sc.nextInt();
//               String taskID = taskName.substring(0, 2) + ":" + taskNumber + ":" + DeveloperName.substring(DeveloperName.length()-3);
//               
//              System.out.println(taskID.toString());
//            taskID = taskID.toUpperCase(); 
//     }
//         }
//       else if(Response < 3){
//           System.out.println("Coming Soon");
//       }
//       else{
//           System.out.println("Quit");
//       }
//       
//         System.out.println(" Please select an option : 1 Addtask, 2 Show report , 3 Quit");
//        Response = Sc.nextInt(); 
//         Response++;


    String Response;
        Response = JOptionPane.showInputDialog(null," Please select an option : 1 Addtask, 2 Show report , 3 Quit");
        int i= Integer.parseInt(Response);

       while(i<=2){
       if (i < 2)
         {
             for (int j = 0; j < 1; j++) {
                 
             
            String DeveloperName = JOptionPane.showInputDialog(null,"What is your name?");
   
            String DeveloperSurname = JOptionPane.showInputDialog(null,"What is your surname?");
              
            String taskName = JOptionPane.showInputDialog(null,"What is the name of the task?");
                
            String taskNumber = JOptionPane.showInputDialog(null,"What is the number of the task?");
          
            String hours = JOptionPane.showInputDialog(null,"How long will it take?");
                
               String taskID = taskName.substring(0, 2) + ":" + taskNumber + ":" + DeveloperName.substring(DeveloperName.length()-3);
               
              JOptionPane.showMessageDialog(null,taskID.toString());
            taskID = taskID.toUpperCase(); 
     }
         }
       else 
           JOptionPane.showMessageDialog(null,"Coming Soon");
       
     
       
         Response = JOptionPane.showInputDialog(null," Please select an option : 1 Addtask, 2 Show report , 3 Quit");
         i= Integer.parseInt(Response);
         
    } 
     
       
    }
        
}       
//     int addTask = 1;
//       int showReport = 2;
//    int quit = 3;
//   
//       String response = JOptionPane.showInputDialog(null, " Please select an option" 
//                                                                            + "\n 1.  Add Task " + addTask 
//                                                                            + "\n 2. Coming Soon "  + showReport
//                                                                            + "\n 3. Quit "+ quit,  "Welocome to EasyKanBan" ,JOptionPane.QUESTION_MESSAGE); 
//        
//                
//             while ( != 3 ){ 
//              
//    
//     
//         if (quit < 2){
////             for (int j = 0; j < 2; j++) {
//   
//                String DeveloperName = JOptionPane.showInputDialog("What is your name?");
//                
//               
//                String DeveloperSurname = JOptionPane.showInputDialog("What is your surname?");
//              
//               
//                String taskName = JOptionPane.showInputDialog("What is the name of the task?");
//              
//                
//                String taskNumber = JOptionPane.showInputDialog("What is the number of the task?");
//                int tasknum = Integer.parseInt(taskNumber);
//                
//             
////                anotherTask = JOptionPane.showConfirmDialog(null, "Would you like to continue?", "Add task",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
////
////                if (anotherTask == JOptionPane.YES_OPTION);
//                    String hour = JOptionPane.showInputDialog("How long would it take?");
//                    int hours =Integer.parseInt(hour);
//                    
//             //}
//
//     }else if (quit >= 2 ){
//             JOptionPane.showMessageDialog(null, "Coming Soon!", "Coming Soon", JOptionPane.OK_OPTION);
//         }
//      else{
//           JOptionPane.showMessageDialog(null, "Thank you");
//         }
////          response = JOptionPane.showInputDialog(null, " Please select an option" 
////                                                                            + "\n 1. Add Task" 
////                                                                            + "\n 2. Coming Soon"  
////                                                                            + "\n 3. Quit",  "Welocome to EasyKanBan",JOptionPane.QUESTION_MESSAGE); 
//          quit++;
//    } 
//    }

    

