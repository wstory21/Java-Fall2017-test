/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Warren
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 1.5;
        double b = 2.5;
        
        double sum;
        double sub;
        double mult;
        double div;
        
        sum = getSum(a, b);
        sub = getSub(a, b);
        mult = getMult(a, b);
        div = getDiv(a, b);
        
        
        System.out.println("Sum of " + a + " and " + b + " = " + sum);
        System.out.println("Sutraction of " + a + " and " + b + " = " + sub);
        System.out.println("Multilication of " + a + " and " + b + " = " + mult);
        System.out.println("Division of " + a + " and " + b + " = " + div);
    }
    static double getSum(double a, double b)
    {
        double sum = a + b;
        return sum;
    }
    static double getSub(double a, double b)
    {
        double sub = a - b;
        return sub;
    }
    static double getMult(double a, double b)
    {
        double mult = a * b;
        return mult;
    }
    static double getDiv(double a, double b)
    {
        double div = a / b;
        return div;
    }
}
