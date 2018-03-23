/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterpretorpattern;

import java.util.ArrayList;

/**
 *
 * @author arash
 */
public class TerminalActions implements IInterpretor{
       static ArrayList<String> listOfPlus= new ArrayList<String>();
    static ArrayList<String> listOfMinus= new ArrayList<String>();
    static ArrayList<String> listOfMultiply= new ArrayList<String>();
    static ArrayList<String> listOfDivision= new ArrayList<String>();
    
    public TerminalActions() {
        listOfPlus.add("+");
        listOfPlus.add("plus");
        listOfPlus.add("Plus");
        listOfPlus.add("PLUS");

        listOfMinus.add("-");
        listOfMinus.add("minus");
        listOfMinus.add("Minus");
        listOfMinus.add("MINUS");
        
        listOfMultiply.add("x");
        listOfMultiply.add("*");
        listOfMultiply.add("multiply");
        listOfMultiply.add("Multiply");
        listOfMultiply.add("MULTIPLY");
        listOfMultiply.add("Moltiply");
        listOfMultiply.add("moltiply");

        listOfDivision.add("/");
        listOfDivision.add("divide");
        listOfDivision.add("divid");
        listOfDivision.add("Divide");
        listOfDivision.add("DIVIDE");
        listOfDivision.add("DIVID");
    }

    @Override
    public boolean interpretPlus(String text) {
        for (String s: listOfPlus){
            if (text.contains(s)) return true;
        }
        return false;
    }

    @Override
    public boolean interpretMinus(String text) {
        for (String s: listOfMinus){
            if (text.contains(s)) return true;
        }
        return false;
    }

    @Override
    public boolean interpretMultiply(String text) {
        for (String s: listOfMultiply){
            if (text.contains(s)) return true;
        }
        return false;
    }

    @Override
    public boolean interpretDivision(String text) {
        for (String s: listOfDivision){
            if (text.contains(s)) return true;
        }
        return false;
    }

    @Override
    public double getResult(double num1, double num2) {
        return 0.0;
    }
    
    public boolean getNumbers(String text) {
        String[] list= text.split(" ");
        if (list.length==3){
            MyInterpretorPattern.number1= Double.parseDouble(list[0]);
            MyInterpretorPattern.number2= Double.parseDouble(list[2]);
            return true;
        }
        else{
            System.out.println("A calculation must have three words in it... try again with three words.");
            return false;
        }
    }
    
 
}
