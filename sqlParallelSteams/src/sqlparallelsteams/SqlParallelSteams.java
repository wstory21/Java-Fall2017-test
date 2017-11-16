/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlparallelsteams;
import java.util.*;
/**
 *
 * @author Warren
 */
public class SqlParallelSteams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int []list = {2,5,3,6,1,4,8};
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(3);
        
        list.parallelStream()
                .sorted()
                .skip(2);
        
        
        
        
        
        
        
        
        
        
        
    }
    /*
    void assentSort(int []list)
    {
        int tmp;
        for (int i = 0; i < list.length; i++)
        {
            for (int j = i+1; j < list.length; j++)
            {
                if (list[i] < list[j])
                {
                    tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }
    void add(int []list)
    {
        int sum = 0;
        for (int i = 0; i < list.length; i++)
        {
            sum += list[i];
        }
        System.out.println("Sum of list: " + sum);
    }
    void sub(int []list)
    {
        int sub = 0;
        for (int i = 0; i < list.length; i++)
        {
            sub -= list[i];
        }
        System.out.println("Difference of list: " + sub);
    }
    void mult(int []list)
    {
        int mult = 0;
        for (int i = 0; i < list.length; i++)
        {
            mult *= list[i];
        }
        System.out.println("Mult of list: " + mult);
    }
    void div(int []list)
    {
        int div = 0;
        for (int i = 0; i < list.length; i++)
        {
            div /= list[i];
        }
        System.out.println("Division of list: " + div);
    }
*/
}
