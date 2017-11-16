/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlparallelsteams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class SqlParallelSteamsTest {
    
    public SqlParallelSteamsTest() {
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
     * Test of main method, of class SqlParallelSteams.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SqlParallelSteams.main(args);
    }

    /**
     * Test of sOutput method, of class SqlParallelSteams.
     */
    @Test
    public void testSOutput() {
        System.out.println("sOutput");
        Integer []array = {2,5,3,6,1,4,8};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        SqlParallelSteams.sOutput(list);
    }

    /**
     * Test of pOutput method, of class SqlParallelSteams.
     */
    @Test
    public void testPOutput() {
        System.out.println("pOutput");
        Integer []array = {2,5,3,6,1,4,8};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        SqlParallelSteams.pOutput(list);
    }

    /**
     * Test of pForOutput method, of class SqlParallelSteams.
     */
    @Test
    public void testPForOutput() {
        System.out.println("pForOutput");
        Integer []array = {2,5,3,6,1,4,8};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        SqlParallelSteams.pForOutput(list);
    }
    
}
