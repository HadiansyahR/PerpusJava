/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import ConnectionManager.ConnectionManager;
import Model.Book;
import Model.Transaction;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author atha
 */
public class BookController {
    ConnectionManager conMan = new ConnectionManager();
    Connection con = conMan.LogOn();
    
    public boolean insertBook(String book_id, String book_name, String book_genre, int quantity){
        String query = "INSERT INTO book values "
                + "('" + book_id + "', " 
                + "'" + book_name + "', "
                + "'" + book_genre + "', "
                + quantity +")";
        try{
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch (Exception ex){
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public List<Book> showBook(){
        List<Book> listBook = new ArrayList<Book>();
        String  query = "Select * from book";
        
        try{
            Statement stm = con.createStatement();
            ResultSet rs;
            rs = stm.executeQuery(query);
            while(rs.next()){
                Book book = new Book();
                book.setBook_id(rs.getString("book_id"));
                book.setBook_name(rs.getString("book_name"));
                book.setBook_genre(rs.getString("book_genre"));
                book.setQuantity(rs.getInt("quantity"));
                listBook.add(book);
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return listBook;
    }
    
    public boolean updateBook(String book_id, String book_name, String book_genre, int quantity){
        String query = "Update book SET book_name = '"
                + book_name + "', book_genre = '" + book_genre + "', " 
                + "quantity = " + quantity +
                " WHERE book_id = '" + book_id + "'";
        
        try {
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        } catch(Exception ex){
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public boolean deleteBook(String book_id){
        String query = "delete from book where book_id = '" + book_id + "'";
        try{
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            return true;
        }catch (Exception ex){
            System.out.println(ex.toString());
            return false;
        }
    }
    
    public List<Book> searchBook(String key){
        List<Book> listBook = new ArrayList<Book>();
        String query = "Select * from book where " +
                "book_id LIKE '%" + key + "'";
        
         try{
            Statement stm = con.createStatement();
            ResultSet rs;
            rs = stm.executeQuery(query);
            while(rs.next()){
                Book book = new Book();
                book.setBook_id(rs.getString("book_id"));
                book.setBook_name(rs.getString("book_name"));
                book.setBook_genre(rs.getString("book_genre"));
                book.setQuantity(rs.getInt("quantity"));
                listBook.add(book);
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        return listBook;
    }
    
    public boolean borrowBook(String user_id, String book_id, List<Book> listBook){
        Boolean borrowStatus = false;
        String bkId = null;
        int bookQty = 0;
        Transaction objTrans = new Transaction();
        
        for (Book book : listBook)
        {
            if(book_id.equals(book.getBook_id())){
                bkId = book.getBook_id();
                bookQty = book.getQuantity();
                break;
            }
        }
        
        objTrans.setUser_id(book_id);
        if((bookQty - 1) >= 0){
            String query = "INSERT INTO transaction VALUES ('')";
        }
        else{
            borrowStatus = false;
        }
        
//        if(bkId != null){
//            if((bookQty - 1) < 0){
//                String query = "INSERT INTO transaction VALUES";
//                
//            }
//            else{
//                borrowStatus = false;
//            }
//        }
//        else{
//            borrowStatus = false;
//        }
        return borrowStatus;
    }
}
