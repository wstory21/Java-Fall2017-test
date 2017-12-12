/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Warren
 */
public class ChatClient {
    boolean check = true;
    public Socket s;
    public String name;
    Thread t1 = new Thread(){
        public void run(){
            String txt;
            try {
                BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
                while(check == true){
                    txt = input.readLine();
                    System.out.println(txt);
                }
            } catch (IOException ex) {
                Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };
    Thread t2 = new Thread() {
        public void run() {
            String txt = "";
            try {
                PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                out.println('[' + name + "] has connected");
                while (txt != null && check == true)
                {
                    txt = JOptionPane.showInputDialog('[' + name + ']' + " What would you like to say:");
                    if (txt != null)
                    {
                        out.println('['+name+"] " + txt);
                    }
                    else
                    {
                        check = false;
                        out.println('[' + name + "] has dissconnected" );
                        out.println(txt);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    };
    public static void main(String[] args) throws IOException {
        ChatClient c1 = new ChatClient();
        c1.start();
    }
    
    public void start() throws IOException{
        String serverAddress = JOptionPane.showInputDialog("Enter IP Address of a machine that is\n" + "running the date service on port 9090:");
        s = new Socket(serverAddress, 9090);
        name = JOptionPane.showInputDialog("Enter Your name:");
        t1.start();
        t2.start();
    }
}
