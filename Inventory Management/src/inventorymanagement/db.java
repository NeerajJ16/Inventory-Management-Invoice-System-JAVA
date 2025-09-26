package inventorymanagement;

import java.sql.Connection;
import java.sql.DriverManager;

public class db {
   public static Connection mycon()
   {
        Connection con;
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventmanage","root","");
            return con; 
        } 
        catch (Exception e) 
        { 
         System.out.println(e); 
        }
        return null;
    }   
 }
