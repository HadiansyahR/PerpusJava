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
import View.BookListView;
import View.LoginView;
import View.ManageBookView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class UserController {
    
    String query = "";
  
    public boolean Login(String username, String password){
        ManageBookView manageBookView = new ManageBookView();
        
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.LogOn();
        
        Boolean loginStatus = false;
        query = "SELECT * FROM user WHERE username ='"+username+"'"+" AND password = '"+password+"'";
        //add baris dibawah
        User userLogin = new User();
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            while(rs.next()){
                if((username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) 
                        && (rs.getString("user_id").equals("U000"))){
                    
                    loginStatus = true;
                    manageBookView.setVisible(true);
                    
                }else if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))){
                    loginStatus = true;
                    
                    userLogin.setUser_id(rs.getString("user_id"));
                    userLogin.setUsername(rs.getString("username"));
                    userLogin.setPassword(rs.getString("password"));
                    //add baris dibawah
                    BookListView bookListView = new BookListView(userLogin);
                    bookListView.setVisible(true);
                    
                }
                else{
                    loginStatus = false;
                }
            }
                        
        }catch (SQLException e){
            e.getMessage();
        }
        conMan.LogOff();
        return loginStatus;
    }
    
    public boolean Register(String username, String password){
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.LogOn();
        LoginView loginView = new LoginView();
        
        Boolean registerStatus = false;
        
        query = "SELECT * FROM user";
        List<User> listUser = new ArrayList<User>();
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            
            
            while(rs.next()){
                User objUser = new User(rs.getString("user_id"), rs.getString("username"), rs.getString("password"));
                listUser.add(objUser);
            }
        }catch (SQLException e){
            e.getMessage();
        }
        
        query = "SELECT COUNT(*) FROM user";
        int dataCount = 0;
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                dataCount = rs.getInt("COUNT(*)");
            }
            
        }catch (SQLException e){
            e.getMessage();
        }
                
        String user_id;
        int rowAffected = 0;
//            System.out.println(dataCount);
        if(dataCount < 10){
            user_id = "U00"+(dataCount);
        }else if(dataCount < 100){
            user_id = "U0"+(dataCount);
        }else{
            user_id = "U"+(dataCount);
        }
        
        
        for (User user : listUser){
            if(user.getUsername().equals(username)){
                registerStatus = false;
                break;
            }
            else{
                query = "INSERT INTO user VALUES('"+user_id+"', '"+username+"', '"+password+"')";
                try{
                    Statement stm = con.createStatement();
                    rowAffected = stm.executeUpdate(query);

                    if(rowAffected > 0){
                        registerStatus = true;
                        loginView.setVisible(true);
                        
                    }else{
                        registerStatus = false;
                    }   
                }catch (SQLException e){
                    e.getMessage();
        //            return registerStatus;
                }
            }
        }
        conMan.LogOff();
        return registerStatus;
    }
}
