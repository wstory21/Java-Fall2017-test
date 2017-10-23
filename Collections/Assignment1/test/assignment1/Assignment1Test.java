/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

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
public class Assignment1Test {
    
    public Assignment1Test() {
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
     * Test of main method, of class Assignment1Testing.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Assignment1.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSum method, of class Assignment1Testing.
     */
    @Test
    public void testGetSum() {
        System.out.println("getSum");
        double a = 2.5;
        double b = 1.5;
        double expResult = 4;
        double result = Assignment1.getSum(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSub method, of class Assignment1Testing.
     */
    @Test
    public void testGetSub() {
        System.out.println("getSub");
        double a = 1.5;
        double b = 2.5;
        double expResult = -1.0;
        double result = Assignment1.getSub(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMult method, of class Assignment1Testing.
     */
    @Test
    public void testGetMult() {
        System.out.println("getMult");
        double a = 1.5;
        double b = 2.5;
        double expResult = 3.75;
        double result = Assignment1.getMult(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getDiv method, of class Assignment1Testing.
     */
    @Test
    public void testGetDiv() {
        System.out.println("getDiv");
        double a = 1.5;
        double b = 2.5;
        double expResult = 0.6;
        double result = Assignment1.getDiv(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
