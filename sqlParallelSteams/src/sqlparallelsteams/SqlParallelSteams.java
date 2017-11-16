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
        Integer []array = {2,5,3,6,1,4,8};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("Stream Output:");
        list
                .stream()
                .forEach(e -> System.out.print(e + " "));
        System.out.println("");
        
        System.out.println("Parallel Stream Output:");
        list
                .parallelStream()
                .forEach(e -> System.out.print(e + " "));
        System.out.println("");
        
        System.out.println("Parallel Stream Re-run Output:");
        list
                .parallelStream()
                .forEach(e -> System.out.print(e + " "));
        System.out.println("");
        
        System.out.println("forEacOrdered Parallel Stream Output:");
        list
                .parallelStream()
                .forEachOrdered(e -> System.out.print(e + " "));
        System.out.println("");      
    }
}
