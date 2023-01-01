/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ConnectionManager.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import Model.User;

/**
 *
 * @author Acer
 */
public class UserController {
    Scanner sc = new Scanner(System.in);
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    String query = "";
  
    public boolean Login(String username, String password){
        Boolean loginStatus = false;
        query = "SELECT * FROM user WHERE username ='"+username+"'"+" AND password = '"+password+"'";
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()){
                loginStatus = username.equals(rs.getString("username")) && password.equals(rs.getString("password"));
            }
            
            return loginStatus;
        }catch (SQLException e){
            e.getMessage();
            return loginStatus;
        }
    }
    
    public boolean Register(String username, String password){
        Boolean registerStatus = false;
        query = "SELECT COUNT(*) FROM user";
        int dataCount = 0;
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                dataCount = rs.getInt("COUNT(*)");
            }
            System.out.println(dataCount);
            
            return registerStatus;
        }catch (SQLException e){
            e.getMessage();
            return registerStatus;
        }
    }
}
