/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Warren
 */
public class CollectionsTest {
    
    public CollectionsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Collections.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
//        Collections.main(args);
    }
    @Test
    public void testFind() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        System.out.println("Contains");
        int guess = 10;
        list.add(10);
        boolean expResult = true;
        boolean result = list.contains(guess);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGet() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        System.out.println("get");
        list.add(1);
        int expResult = 1;
        int result = list.get(0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAdd() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        System.out.println("add");
        list.add(1);
        int expResult = 1;
        int result = list.get(0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        System.out.println("remove");
        list.add(1);
        list.add(2);
        list.remove(0);
        int expResult = 2;
        int result = list.get(0);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSize() {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        System.out.println("size");
        list.add(1);
        list.add(2);
        int expResult = 2;
        int result = list.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of find method, of class Collections.
     */
}
