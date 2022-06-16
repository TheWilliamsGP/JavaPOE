/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prld;
import java.util.Scanner;
/**
 *
 * @author sadeeqwilliams
 */
public class Prld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner VAR = new Scanner(System.in);
        String con = "shouldContinue";
        int firstValue ;
        int secondValue ;
        int result;
        int result1;
        System.out.println("enter first value");
        firstValue = VAR.nextInt();
        System.out.println("enter second value");
        secondValue = VAR.nextInt();
        result = secondValue + firstValue;
        System.out.println("enter first value");
        firstValue = VAR.nextInt();
        System.out.println("enter second value");
        secondValue = VAR.nextInt();
        result1 = secondValue + firstValue;
        System.out.println(result + " " + result1);
    }
    
}
