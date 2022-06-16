/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sadeeq_st10070002;

/**
 *
 * @author sadeeqwilliams
 */
public class Task {
    
    // dcelare attributes for a task
    public String taskName, developerDetails,developerName,developerSurname,taskDescription,taskStatus,taskID;
    public int taskNumber, hours;

    public Task(){} 
    //override default constructor by initializing declared variables
    public Task (String taskName,String developerDetails ,String developerName,String developerSurname,String taskDescription,String taskStatus, String taskID,int taskNumber, int hours) {
       this.taskName = taskName;
       this.developerDetails = developerDetails;
       this.developerName = developerName;
       this.developerSurname = developerSurname;
       this.taskNumber = taskNumber;
       this.hours = hours;
       this.taskDescription = taskDescription;
       this.taskStatus = taskStatus;
       this.taskID = taskID;
   }
    
    //getters and setter for the task
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }
       public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
        
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public String getTaskDescription() {
        return taskDescription;

    }
    
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
     public String getTaskStatus() {
        return taskStatus;
    }
    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }
     public String getTaskID() {
        return taskID;
     }
    @Override
    public String toString() { return taskName;}

    
    public String[] toStringArray() { return new String [] {developerName,developerSurname, taskName, taskDescription}; }
    
    
}