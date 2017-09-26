
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattishw2;
import java.util.Scanner;
/**
 *
 * @author Warren
 */
public class KattisHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Scan = new Scanner (System.in);
        System.out.print("X: ");
        int x = Scan.nextInt();
        System.out.print("Y: ");
        int y = Scan.nextInt();
        System.out.print("N: ");
        int n = Scan.nextInt();
        
        for (int i = 1; i <= n; i++)
        {
            if (checkDiv(i, x) && !checkDiv(i, y))
                System.out.println("Fizz");
            else if (checkDiv(i, y) && !checkDiv(i, x))
                System.out.println("Buzz");
            else if (checkDiv(i, x) && checkDiv(i, y))
                System.out.println("FizzBuzz");
            else
                System.out.println(i);
        }
        
    }
    static boolean checkDiv (int visor, int dend)
    {
        if ((visor % dend) == 0){
            return true;
        }
        else
            return false;
    }
}
