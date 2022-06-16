/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task;

import javax.swing.JOptionPane;

/**
 *
 * @author sadeeqwilliams
 */
public class Task {

 public Task (Task task){
     
 }
public static boolean checkTaskDescription(String taskDescription){

    if (taskDescription.length() <= 50){
    return true;
    }else{
    return false;
    }
 }

public String createTaskID(String taskName, int taskNumber, String developerName)

{

String taskID = taskName.substring(0,2)+ ":" +

Integer.toString(taskNumber)+ ":" + developerName.substring(developerName.length()-3);

return taskID.toUpperCase() ;

}

public String printTaskDetails(String taskName, int taskNumber, String taskDescription ,

String devFirstName, String devLastName, int taskDuration, String taskID, String taskStatus )

{

  

String printValue = taskName+ " " + Integer.toString(taskNumber)+ " " + taskDescription +

" " + devFirstName+ " " + devLastName+ " " + Integer.toString(taskDuration)+" " + taskID+ " "+ taskStatus;

  

return printValue;

  

}

public int returnTotalHours(int numTasks,int enteredHours)

{

int totalHours=0;

for (int i = 0; i < numTasks; i++)

{

totalHours+=enteredHours;

}

  

return totalHours;

}

public int addSlackTime(int numTasks, int duration, int slackTime)

{

int totalTimeWithSlack = 0;

for (int i = 1; i < numTasks; i++)

{

  

slackTime+=slackTime;

totalTimeWithSlack = slackTime+duration;

//JOptionPane.showMessageDialog(null, "slack currently is " + slack);

}

return totalTimeWithSlack;

}

public String [] populateDeveloperArray()

{

String [] developers = new String[] {"Mike Smith", "Edward Harrington"

, "Samantha Paulson", "Glenda Oberholzer"};

return developers;

}

public String [] populateTaskNameArray()

{

String [] TaskName = new String[] {"Create Login", "Create Add Features"

, "Create Reports", "Create Arrays"};

return TaskName;

}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int menu = 3;
        
        while (menu <= 3)
            if (menu == 1 )
                for menu = nextInt();
                for (menu  = 0; menu <= 2; menu++) {
                    String response = JOptionPane.showInputDialog(null, " What would you like todo Press 1: Add Task 2: Coming Soon 3: Quit", "Welocome to kanban",JOptionPane.QUESTION_MESSAGE);
         String DeveloperName = JOptionPane.showInputDialog("What is your name?");
         options.setDeveloperName(DeveloperName);
         String DeveloperSurname = JOptionPane.showInputDialog("What is your surname?");
         options.setDeveloperSurname(DeveloperSurname);
         String taskName = JOptionPane.showInputDialog("What is the name of the task?");
         options.setTaskName(taskName);
         String taskNumber = JOptionPane.showInputDialog("What is the number of the task?");
         int tasknum = Integer.parseInt(taskNumber);
         options.setTaskNumber(tasknum);
         anotherTask = JOptionPane.showConfirmDialog(null, "Would you like to continue?", "Add task",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

                    
                }
                
        
        
    }
    
}
