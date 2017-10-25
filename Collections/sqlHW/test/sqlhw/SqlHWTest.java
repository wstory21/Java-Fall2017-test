/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlhw;

import java.sql.Connection;
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
public class SqlHWTest {
    
    public SqlHWTest() {
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
     * Test of main method, of class SqlHW.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
    }
    
    /**
     * Test of reset method, of class SqlHW.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        SqlHW instance = new SqlHW();
        instance.reset();
    }

    /**
     * Test of insert method, of class SqlHW.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        int id = 0;
        String item = "";
        String category = "";
        int price = 0;
        SqlHW instance = new SqlHW();
        instance.insert(id, item, category, price);
    }

    /**
     * Test of read method, of class SqlHW.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        int id = 0;
        String item = "";
        String category = "";
        int price = 0;
        SqlHW instance = new SqlHW();
        instance.insert(id, item, category, price);
        instance.read();
    }

    /**
     * Test of sold method, of class SqlHW.
     */
    @Test
    public void testSold() {
        System.out.println("sold");
        int id = 0;
        String item = "";
        String category = "";
        int price = 0;
        SqlHW instance = new SqlHW();
        instance.insert(id, item, category, price);
        instance.sold(id);
    }

    /**
     * Test of run method, of class SqlHW.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        SqlHW instance = new SqlHW();
        instance.run();
    }
    
}
