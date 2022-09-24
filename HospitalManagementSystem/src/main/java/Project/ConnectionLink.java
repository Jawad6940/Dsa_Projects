/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author mine
 */
import java.sql.*;

public class ConnectionLink {
    
     
   public static Connection getCon(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","jawadtp@123");
        return con;
    }
    catch(Exception e){
        return null;
    }
   }
}
