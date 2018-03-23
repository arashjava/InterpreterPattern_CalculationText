/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myinterpretorpattern;

/**
 *
 * @author arash
 */
public class Divide implements IInterpretor{

    @Override
    public boolean interpretPlus(String text) {
        return false;
    }

    @Override
    public boolean interpretMinus(String text) {
        return false;
    }

    @Override
    public boolean interpretMultiply(String text) {
        return false;
    }

    @Override
    public boolean interpretDivision(String text) {
        return true;
    }

    @Override
    public double getResult(double num1, double num2) {
        return(num1/num2);
    }





}
