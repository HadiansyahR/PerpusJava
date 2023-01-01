/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package View;

import Controller.UserController;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserController ucon = new UserController();
        Boolean login, register;
        Scanner scan = new Scanner(System.in);
        
        String username, password;
        
        System.out.print("Uname: ");
        username = scan.next();
        
        System.out.print("Password: ");
        password = scan.next();
        
        login = ucon.Login(username, password);
        System.out.println(login);
        
//        register = ucon.Register(username, password);
//        System.out.println(register);
    }
    
}
