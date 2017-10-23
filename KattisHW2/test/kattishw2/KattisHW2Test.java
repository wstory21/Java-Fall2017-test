/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kattishw2;

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
public class KattisHW2Test {
    
    public KattisHW2Test() {
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
     * Test of main method, of class KattisHW2.
     */

    /**
     * Test of checkDiv method, of class KattisHW2.
     */
    @Test
    public void testCheckDivTrue() {
        System.out.println("checkDiv");
        int visor = 2;
        int dend = 2;
        boolean expResult = true;
        boolean result = KattisHW2.checkDiv(visor, dend);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCheckDivFalse() {
        System.out.println("checkDiv");
        int visor = 3;
        int dend = 2;
        boolean expResult = false;
        boolean result = KattisHW2.checkDiv(visor, dend);
        assertEquals(expResult, result);
    }
    
}
