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
public interface IInterpretor {
    public boolean interpretPlus(String text);
    public boolean interpretMinus(String text);
    public boolean interpretMultiply(String text);
    public boolean interpretDivision(String text);
    public double getResult(double num1, double num2);
}
