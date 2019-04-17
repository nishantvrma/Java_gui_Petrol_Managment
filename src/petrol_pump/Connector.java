/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrol_pump;
import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author nishant5674
 */
public class Connector {
    private static final String username="root";
    private static final String password="nishant123";
    private static final String c= "jdbc:mysql://127.0.0.1:3306/petrolpump";
    public static void main(String args[])
    {
        getconnection();
    }
    public static  Connection getconnection()
    {
        Connection conn;
        try{
        conn= (Connection)DriverManager.getConnection(c,username,password);    
        System.out.println("Connected");
        return conn;
        }
        catch(SQLException e){
            System.err.println(e);
        }
        
        return null;

    
    }
}
    

