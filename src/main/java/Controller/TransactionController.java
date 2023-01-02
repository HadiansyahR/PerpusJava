/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ConnectionManager.ConnectionManager;
import Model.Transaction;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class TransactionController {
    String query;
    
    public List<Transaction> showTransactionAdmin(){        
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.LogOn();
        
        List<Transaction> listTrans = new ArrayList<Transaction>();
        
        query = "SELECT * FROM transaction";
                
        try{
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                Transaction trans = new Transaction();
                trans.setTransaction_id(rs.getInt("transaction_id"));
                trans.setUser_id(rs.getString("user_id"));
                trans.setBook_id(rs.getString("book_id"));
                trans.setBorrow_date(rs.getString("borrow_date"));
                trans.setReturn_date(rs.getString("return_date"));
                trans.setReturn_status(rs.getInt("return_status"));
                listTrans.add(trans);
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        
        return listTrans;
    }
    
    public boolean ManageTransaction(int transaction_id, String return_date, int return_status){
        Boolean updateStatus = false;
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.LogOn();
        
        int rowAffected = 0;
        query = "UPDATE transaction SET return_date = '"+ return_date +"', return_status = "+ 
                return_status +" WHERE transaction_id = "+transaction_id;
        
        try{
            Statement stm = con.createStatement();
            rowAffected = stm.executeUpdate(query);
            
            if(rowAffected > 0){
                updateStatus = true;
            }else{
                updateStatus = false;      
            }   
        }catch(SQLException e){
            e.getMessage();
        }        
        return updateStatus;
    }
    
    public List<Transaction> searchTrans(String key){
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.LogOn();
        List<Transaction> listTrans = new ArrayList<Transaction>();
        String query = "Select * from transaction where " +
                "book_id LIKE '%" + key + "'";
        
        try{
           Statement stm = con.createStatement();
           ResultSet rs = stm.executeQuery(query);
           while(rs.next()){
               Transaction trans = new Transaction();
               trans.setTransaction_id(rs.getInt("transaction_id"));
               trans.setUser_id(rs.getString("user_id"));
               trans.setBook_id(rs.getString("book_id"));
               trans.setBorrow_date(rs.getString("borrow_date"));
               trans.setReturn_date(rs.getString("return_date"));
               trans.setReturn_status(rs.getInt("return_status"));
               listTrans.add(trans);
           }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        
        return listTrans;
    }
    
}
