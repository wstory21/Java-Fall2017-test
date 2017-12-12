/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

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
public class ChatRoomTest {
    
    public ChatRoomTest() {
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
     * Test of handleUsers method, of class ChatRoom.
     */
    @Test
    public void testHandleUsers() throws Exception {
        System.out.println("handleUsers");
        ChatRoom instance = new ChatRoom();
        instance.handleUsers();
    }

    /**
     * Test of addUsers method, of class ChatRoom.
     */

    /**
     * Test of main method, of class ChatRoom.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        ChatRoom.main(args);
    }

    /**
     * Test of start method, of class ChatRoom.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        ChatRoom instance = new ChatRoom();
        instance.start();
    }
    
}
