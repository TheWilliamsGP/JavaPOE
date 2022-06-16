/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listexample;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//class Model {
//
//    public String name;
//    public String surname;
//
//    public String getName() {
//        return name;
//    }
//    
//    public String getsName() {
//        return surname;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    
//     public void setSurname(String surname) {
//        this.surname = surname;
//    }
//}
//public class ListExample {
//
//    public static void main(String[] args) {
//        List<Model> models = new ArrayList<>();
//
//        // TODO: First create your model and add to models ArrayList, to prevent NullPointerException for trying this example
//        Scanner input = new Scanner(System.in);
//        int count = 0;
//        System.out.print("How many Models are you capturing : ");
//        int numberOfModels = input.nextInt();
//        
//        while (count != numberOfModels){
//           
//            
//            Model item = new Model();
//            System.out.print("Please enter your name :  ");
//            String name = input.next();
//            System.out.print("Please enter your surname :  ");
//            String surname = input.next();
//            item.setName(name);
//            item.setSurname(surname);
//            models.add(item);
//        
//        }
//
//        // Print the name from the list....
//        for(Model model : models) {
//            System.out.println(model.getName());
//        }
//
//        // Or like this...
//       /* for(int i = 0; i < models.size(); i++) {
//            System.out.println(models.get(i).getName());
//        } */
//    }
//}

import java.util.* ;

class Model {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }
    
    public String getsName() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public void setsName(String surname) {
        this.surname = surname;
    }
}
public class ListExample {

    public static void main(String[] args) {
        List<Model> models = new ArrayList<>();

        // TODO: First create your model and add to models ArrayList, to prevent NullPointerException for trying this example
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("How many Models are you capturing : ");
        int numberOfModels = input.nextInt();
        
        while (count != numberOfModels){
            Model item = new Model();
            System.out.print("Please enter your name :  ");
            String name = input.next();
            System.out.print("Please enter your surname :  ");
            String surname = input.next();
            item.setName(name);
            item.setsName( surname);
            models.add(item);
            count++;
        }

        // Print the name from the list....
        for(Model model : models) {
            System.out.println(model.getName() +" "+ model.getsName());
        }

        // Or like this...
       /* for(int i = 0; i < models.size(); i++) {
            System.out.println(models.get(i).getName());
        } */
    }
}