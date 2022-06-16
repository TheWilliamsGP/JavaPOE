/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sadeeq_st10070002;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JOptionPane;

import static sadeeq_st10070002.Login.task;

/**
 *
 * @author sadeeqwilliams
 */
public class TaskClass {
          
         private static boolean taskDescription = false;
         List <Task> details = new ArrayList<>();
         String taskID;
         int numTask = 0;
         
        public  boolean checkTaskDescription(String taskDescription){
       String taskDescriptionTrue = "Task successfully captured";
       String taskDescriptionFalse = "Please enter a task description of less than 50 characters";

        if (taskDescription.length() <= 50) { 
            JOptionPane.showMessageDialog(null,taskDescriptionTrue);
            return true;
        }else {
            JOptionPane.showMessageDialog(null,taskDescriptionFalse);
        }
        return false;
 
}
 
    public  String createTaskID(){
            
          
          String response;
          String taskNum;
          String invalidTaskDescription = "The Task Description is incorrectly formatted";
          
     
          JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan", "EasyKanBan",JOptionPane.PLAIN_MESSAGE); //Displays the Welcome message.
                
          //Displays Options before anything can be excuted. 
          response = JOptionPane.showInputDialog(null, " Please select an option" 
                                                                            + "\n 1. Add Task" 
                                                                            + "\n 2. Show Report"  
                                                                            + "\n 3. Quit",  "EasyKanBan",JOptionPane.QUESTION_MESSAGE); 
                                                                    

        int i= Integer.parseInt(response); //Changes the String into a int called i.
       
        
             while(i<=2){ //The While loops runs until the user exit.
                if (i < 2) { //The If statement runs while i is = 1. 
                    taskNum = JOptionPane.showInputDialog(null, "How many tasks would you like to add", "Tasks",JOptionPane.QUESTION_MESSAGE); //Prompts the user to how many task they would like to enter.
                    int l= Integer.parseInt(taskNum);
                    for (int j = 0; j < l; j++) {
                        
                        Task item = new Task();
                        //Prompts the user to enter the name of the task and get stored. 
                        String taskName = JOptionPane.showInputDialog(null,"What is the name of the task?","Task Name",JOptionPane.QUESTION_MESSAGE);
                        task.setTaskName(taskName);
                        item.setTaskName(taskName);
                        
                        //Prompts the user to enter a description task and get stored. 
                        String taskDescription = JOptionPane.showInputDialog(null,"Give a short description about the task","Task Description",JOptionPane.QUESTION_MESSAGE);
                        task.setTaskDescription(taskDescription);
                        item.setTaskDescription(taskDescription);
                        while (checkTaskDescription(task.getTaskDescription()) == false) {//Checks if the descriptions is matching the requirements.  
                        JOptionPane.showMessageDialog(null,invalidTaskDescription);
                        taskDescription = JOptionPane.showInputDialog(null,"Give a short description about the task","Task Description",JOptionPane.QUESTION_MESSAGE);
                        task.setTaskDescription(taskDescription);
                        item.setTaskDescription(taskDescription);
                        }
                            
                        //Prompts the user to enter the devolopers details and get stored. 
                        String DeveloperDetails = JOptionPane.showInputDialog(null,"What is your first and last name?","Developers Details",JOptionPane.QUESTION_MESSAGE);
                        task.setDeveloperDetails(DeveloperDetails);
                        item.setDeveloperDetails(DeveloperDetails);

                        //Prompts the user to enter the amount of hours it will take and get stored. 
                        String hours = JOptionPane.showInputDialog(null,"How long will it take?","Amount of hours it would take",JOptionPane.QUESTION_MESSAGE);   
                        int number = Integer.parseInt(hours);
                        task.setHours(number);
                        item.setHours(number);
                            
                        //Prompts the user to enter the status of the task and get stored. 
                        String taskStatus = JOptionPane.showInputDialog(null," Please select an option" 
                                                                                        + "\n  To Do" 
                                                                                        + "\n  Done"  
                                                                                        + "\n  Doing",  "Task Status",JOptionPane.QUESTION_MESSAGE); 
                        task.setTaskStatus(taskStatus);
                        item.setTaskStatus(taskStatus);
                        
                        //Displays the task ID of the entered details above. 
                        taskID  = task.getTaskName().substring(0, 2) + ":" + Integer.toString(numTask)
                        + ":" + task.getDeveloperDetails().substring(task.getDeveloperDetails().length()-3);
                        item.setTaskID(taskID);
                        taskID = taskID.toUpperCase(); 
                        JOptionPane.showMessageDialog(null,taskID.toString());
                        
                       numTask++;//Increments the number of tasks
                       item.setTaskNumber(numTask);
                       
                       details.add(item);
                        }
                }else 
                    JOptionPane.showMessageDialog(null,"Coming Soon","Show Report",JOptionPane.OK_OPTION); //Displays once the user response 2
       
     
            response = JOptionPane.showInputDialog(null, " Please select an option" 
                                                                            + "\n 1. Add Task" 
                                                                            + "\n 2. Show Report"  
                                                                            + "\n 3. Quit",  "Welcome to EasyKanBan",JOptionPane.QUESTION_MESSAGE); 
         
            i= Integer.parseInt(response);          
    } 
           
       return response;
    }
    
    public  String printTaskDetails(){

        for(Task Task  : details) {//Details are displayed in full details of each task.
            JOptionPane.showMessageDialog(null,"\n Task Status: " + Task.getTaskStatus() 
                                        + " " +"\n Developer Details: " + Task.getDeveloperDetails() 
                                        + " " +"\n Task Number: " + Integer.toString(Task.getTaskNumber())
                                        + " " + "\n Task Name: " + Task.getTaskName()
                                        + " " +"\n Task Description: " +  Task.getTaskDescription() 
                                        +" " +"\n Task ID: " +  Task.getTaskID().toUpperCase()
                                        + " "+"\n Task Duration: " +  Integer.toString(Task.getHours())+"hrs","Full Task Description",JOptionPane.PLAIN_MESSAGE);                                       
        }
       return null;
    }
    
    public  int TotalHours(){
        
        //Takes all the hours thats stored and add it up.
        int totalHours=0;
        for(Task Task  : details) {
          totalHours+=Task.getHours();
        }

        JOptionPane.showMessageDialog(null, totalHours+" Hours");
        return totalHours;
    }
    
}