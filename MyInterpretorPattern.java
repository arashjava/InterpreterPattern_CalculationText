/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterpretorpattern;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arash
 */
public class MyInterpretorPattern {

    /**
     * @param args the command line arguments
     */

    static double number1, number2; 
    public static void main(String[] args) {
        TerminalActions action= new TerminalActions();
        Plus plus= new Plus();
        Minus minus= new Minus();
        Multiply multiply= new Multiply();
        Divide divide= new Divide();
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Please request a math calc including a math action:");
        String text= sc.nextLine();
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        if (action.getNumbers(text)){
            if (action.interpretPlus(text)) 
            {
                System.out.println(text + " = " +df.format(plus.getResult(number1, number2)));
            }else
            if (action.interpretMinus(text)) 
            {
                System.out.println(text + " = " +df.format(minus.getResult(number1, number2)));
            }else
            if (action.interpretMultiply(text)) 
            {
                System.out.println(text + " = " +df.format(multiply.getResult(number1, number2)));
            }else
            if (action.interpretDivision(text)) 
            {
                if (number2 ==0) System.out.println("Error! divide by zero is not defines...");
                else  
                    System.out.println(text + " = " +df.format(divide.getResult(number1, number2)));
            }else
                            System.out.println("Error! The action is not defined in system...");
        }

        
        
        
        
        // TODO code application logic here
    }
    
     

}
