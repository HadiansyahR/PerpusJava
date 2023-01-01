/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Acer
 */
public class Transaction {
    
    private int transaction_id;
    private String user_id;
    private String book_id;
    private String borrow_date;
    private String return_date;
    private int return_status;

    public Transaction(int transaction_id, String user_id, String book_id, String borrow_date, String return_date, int return_status) {
        this.transaction_id = transaction_id;
        this.user_id = user_id;
        this.book_id = book_id;
        this.borrow_date = borrow_date;
        this.return_date = return_date;
        this.return_status = return_status;
    }

    public Transaction() {
    }
    
    /**
     * @return the transaction_id
     */
    public int getTransaction_id() {
        return transaction_id;
    }

    /**
     * @param transaction_id the transaction_id to set
     */
    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    /**
     * @return the user_id
     */
    public String getUser_id() {
        return user_id;
    }

    /**
     * @param user_id the user_id to set
     */
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    /**
     * @return the book_id
     */
    public String getBook_id() {
        return book_id;
    }

    /**
     * @param book_id the book_id to set
     */
    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    /**
     * @return the borrow_date
     */
    public String getBorrow_date() {
        return borrow_date;
    }

    /**
     * @param borrow_date the borrow_date to set
     */
    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    /**
     * @return the return_date
     */
    public String getReturn_date() {
        return return_date;
    }

    /**
     * @param return_date the return_date to set
     */
    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    /**
     * @return the return_status
     */
    public int getReturn_status() {
        return return_status;
    }

    /**
     * @param return_status the return_status to set
     */
    public void setReturn_status(int return_status) {
        this.return_status = return_status;
    }
    
}
