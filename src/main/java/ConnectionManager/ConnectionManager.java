package ConnectionManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dreamvalian
 */
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class ConnectionManager {
   private Connection con;
   private String Driver  = "com.mysql.cj.jdbc.Driver";
   private String url = "jdbc:mysql://localhost:3306/perpusjava";
   private String Username = "root";
   private String Password = "";
   
   public Connection LogOn(){
       try{
       Class.forName(Driver).newInstance();
       con = DriverManager.getConnection(url, Username, Password);
       }catch(Exception ex){
//               ex.printStackTrace();
            ex.getMessage();
       }
       return con;
    }
   
   
   public void LogOff(){
       try{
           con.close();
       }catch(Exception ex){
//           ex.printStackTrace();
            ex.getMessage();
       }
   }
}

