/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlhw;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Warren
 */
public class SqlHW {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        try
//        {
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/contact2","nbuser", "nbuser");
            System.out.println("Connected!");
//        } 
//        catch (SQLException ex) {
//                        System.out.println("Nope");
//        }
    }
    
}
