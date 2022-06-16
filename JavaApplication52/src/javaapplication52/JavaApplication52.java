/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication52;

/**
 *
 * @author sadeeqwilliams
 */
public class JavaApplication52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
String name = "sadeeq";
String surname = "williams";
String college = "Rosebank College Cape Town";
String reversed =" ";
char letter = name.charAt(5);
for (int counter = name.length() -1; counter >=0; counter -- ){
    reversed += name.charAt(counter);
}
    
        System.out.println(name+" ".concat(surname));
       // System.out.println("");
        System.out.println(name.substring(0,3));
        System.out.println(name.replace('a', 'i'));
        System.out.println(letter);
        System.out.println(college.indexOf(' '));
        System.out.println("Reversed name " + reversed);
    }
    
}
