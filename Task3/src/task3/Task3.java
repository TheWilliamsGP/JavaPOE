/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task3;
import java.util.*;

class Employee{
    private int empno;
    private String ename;
    private int salary;
    
    Employee(int empno, String ename, int salary){
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
                
    }
    public int getEmpno(){
        return empno;
    }
    public int getSalary(){
        return salary;
 }
 
         public String getEname(){
        return ename;
    }
         public String toString(){
             return empno + " " + ename+" "+salary;
         }
    
}
/**
 *
 * @author sadeeqwilliams
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Collection<Employee> c = new ArrayList<Employee>(); 
       Scanner s = new Scanner(System.in);
       int ch;
       do{
           System.out.println("0.Quit");
           System.out.println("1.Insert");
           System.out.println("2.Display");
           System.out.println("3.Search");
           System.out.println("4.Delete");
           System.out.println("Enter your Choice : ");
           ch = s.nextInt();
           
           switch(ch){
               case 1:
                   System.out.println("Enter Empno : ");
                   int eno = s.nextInt();
                   System.out.println("Enter Name : ");
                   String ename = s.next();
                   System.out.println("Enter Salary : ");
                   int salary = s.nextInt();
                   
                   c.add(new Employee(eno,ename,salary));
                   break;
               case 2:
                   System.out.println("-------------------------");
                   Iterator<Employee> i = c.iterator();
                   while(i.hasNext()){
                       Employee e = i.next();
                       System.out.println(e);
                   }
                   System.out.println("-------------------------");
                   break;
               case 3:
                   boolean found = false;
                   System.out.println("Enter Empno : ");
                   int empno = s.nextInt();
                   System.out.println("-------------------------");
                   i = c.iterator();
                   while(i.hasNext()){
                       Employee e = i.next();
                       if(e.getEmpno() == empno){
                       System.out.println(e);
                       found = true;
                       }
                   }  
                   if(!found){
                       System.out.println("Record not found");
                   }
                   System.out.println("-------------------------");
                   break;
                   
               case 4:
                   found = false;
                   System.out.println("Enter Empno to Delete : ");
                   empno = s.nextInt();
                   System.out.println("-------------------------");
                   i = c.iterator();
                   while(i.hasNext()){
                       Employee e = i.next();
                       if(e.getEmpno() == empno){
                       i.remove();
                       found = true;
                       }
                   }  
                   if(!found){
                       System.out.println("Record not found");
                   }else{
                       System.out.println("Record has been deleted");
                   }
                   System.out.println("-------------------------");
                   break;
                   
           }
       }while(ch!=0);
    }
    
}
