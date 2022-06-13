/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author caragea
 */
public class JDBCHandeller {
    public static String USER = "Alex";
    public static String PASSWORD = "root";
    public static String URL = "jdbc:mysql://localhost:3306/undergroundSistem";
    
    public static Connection getConnection()
    {
        try{
            DriverManager.registerDriver(new Driver(){});
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }
}
