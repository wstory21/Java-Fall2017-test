/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatroom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Warren
 */
public class ChatRoom {
    private Socket[] USERS = new Socket[100];
    public boolean sev = true;
    public int n_of_users = 0;
    
    Thread t1 = new Thread () {
        public void run(){
            try {
                addUsers();
            } catch (IOException ex) {
                Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    
    Thread t2 = new Thread(){
        public void run() {
            try {
                handleUsers();
            } catch (IOException ex) {
                Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    
    public void handleUsers() throws IOException
    {
        BufferedReader input;
        PrintWriter out;
        String txt;
        while(true)
        {
            for (int i = 0; i < n_of_users; i++)
            {
                input = new BufferedReader(new InputStreamReader(USERS[i].getInputStream()));
                if (input.ready())
                {
                    txt = input.readLine();
                    if (txt == null)
                    {
                        USERS[i].close();
                        for (int k = i; k < n_of_users-1; k++)
                        {
                            USERS[k] = USERS[k+1];
                        }
                    }
                    else
                    {
                        System.out.println(txt);
                        for (int j = 0; j < n_of_users; j++)
                        {
                            out = new PrintWriter(USERS[j].getOutputStream(), true);
                            out.println(txt);
                        }
                    }
                }
            }
            System.out.print("");
        }
    }
    public void addUsers() throws IOException
    {
        System.out.println("Current IP address : " + InetAddress.getLocalHost());
        ServerSocket listener = new ServerSocket(9090);
        while (sev)
        {
            USERS[n_of_users] = listener.accept();
            n_of_users++;
            System.out.println("User Added");
        }
    }
    
    public static void main(String[] args) throws IOException {
        try
        {
            ChatRoom g1 = new ChatRoom();
            g1.start();
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    public void start() throws Exception
    {
        t1.start();
        t2.start();
    }
    
}
