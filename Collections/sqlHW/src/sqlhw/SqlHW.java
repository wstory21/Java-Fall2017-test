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
import java.sql.ResultSetMetaData;
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
    public static void main(String[] args) {
        new SqlHW().run();
    }
    
    private Connection connection;
    public static final int SQL_STATEMENT_TIMEOUT_SECONDS = 10;
    
    public Connection getConnection()
    {
        if (connection == null)  {
            try
            {
                connection = DriverManager.getConnection("jdbc:derby://localhost:1527/contact2","nbuser", "nbuser");
                System.out.println("Connected!");
            }
            catch(SQLException ex)
            {
                Logger.getLogger(SqlHW.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
    
    private Statement statement = null;

    void reset() {
        try {
            connection = getConnection();
            statement = connection.createStatement();
            String com = "DELETE FROM INVENTORY";
            statement.executeUpdate(com);
        }
        catch (SQLException ex)
        {
            System.out.println("Reset didn't work");
            Logger.getLogger(SqlHW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    PreparedStatement preparedStatement = null;
    void insert(int id, String item, String category, int price)
    {
        try {
            connection = getConnection();
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement("INSERT INTO INVENTORY VALUES(?,?,?,?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, item);
            preparedStatement.setString(3, category);
            preparedStatement.setInt(4, price);
            
            boolean check = preparedStatement.execute();
            if (check == false)
            {
                System.out.println("Inserted record");
            }
            else
                System.out.println("Not Inserted");
        }
        catch (SQLException ex) {        }
    }
    
    void read()
    {
        try {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM INVENTORY";
        
        ResultSet result = statement.executeQuery(query);
        ResultSetMetaData meta = result.getMetaData();
        int colmsNum = meta.getColumnCount();
        
        while (result.next())
        {
            System.out.println("ID: " + result.getInt(1) + "     Item Name: " + result.getString(2) + "     Item Category: " + result.getString(3) + "     Item Price: $" + result.getInt(4));
        }
        } catch (SQLException ex) {
            System.out.println("Read didn't work");
        }
    }
    
    void sold(int id)
    {
        try
        {
            preparedStatement = connection.prepareStatement("DELETE FROM INVENTORY WHERE id =?");
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            System.out.println("Sold!");
        }
        catch (SQLException ex)
        {
            System.out.println("Item didn't sell");
            System.out.println("Sold didn't work");
        }
    }
    
    void run() {
        reset();
        System.out.println("");
        insert(1111, "apple", "fruit", 1);
        insert(2111, "sushi", "seafood", 6);
        insert(3111, "mac-n-cheese", "pasta", 2);
        insert(4111, "begals", "bread", 3);
        System.out.println("");
        System.out.println("Inventory");
        read();
        System.out.println("");
        
        int sold = 1111;
        System.out.println("Selling Item: " + sold);
        sold(sold);
        System.out.println("");
        System.out.println("Updated Inventory");
        read();
        
        try {
            connection.close();
        }
        catch (SQLException ex)
        {
            System.out.println("Close didn't work");
        }
    }
}
