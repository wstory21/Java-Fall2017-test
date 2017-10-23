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
        
        add(list, scan);
        
        System.out.println("Guess what list contains: ");
        int guess = scan.nextInt();
        contains(list, guess, scan);
        
        find(list, scan);
        
        size(list);
        remove(list, 5);
    }
    public static void add(ArrayList<Integer> list, Scanner scan)
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Type an Integer(1-20): ");
            list.add(scan.nextInt());
        }
    }
    public static void contains(ArrayList<Integer> list, int guess, Scanner scan)
    {        
        if (list.contains(guess))
            System.out.println("You guesed Right!");
        else
            System.out.println("Nope, list does not contain" + guess);
    }
    public static void find(ArrayList list, Scanner scan)
    {
        int guess;
        int []list2 = new int[10];
        System.out.println(list);
        
        System.out.print("Find element at Index: ");
        guess = scan.nextInt();
        System.out.println("Index " + guess + " is " + list.get(guess-1));
    }
    public static void size(ArrayList<Integer> list)
    {
        System.out.println("Size of list is " + list.size());
    }
    public static void remove(ArrayList<Integer> list, int index)
    {
        list.remove(5);
    }
}
