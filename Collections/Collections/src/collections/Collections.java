 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Warren
 */
public class Collections{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Type an Integer(1-20): ");
            list.add(scan.nextInt());
        }
        System.out.println("Contains: ");
        int guess = scan.nextInt();
        
        if (list.contains(guess))
            System.out.println("You guesed Right!");
        else
            System.out.println("Nope, list does not contain" + guess);
        int []list2 = new int[10];
        System.out.println(list);
        
        System.out.print("Find element at Index: ");
        guess = scan.nextInt();
        System.out.println("Index " + guess + " is " + list.get(guess-1));
        
        System.out.print("Size of Array: " + list.size());
        list.remove(5);
    }
}
