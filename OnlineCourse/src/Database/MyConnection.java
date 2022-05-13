/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author olafa
 */
public class MyConnection {
    public static Connection connection() {
        Connection con = null;
        String address="jdbc:mysql://localhost/courses";
        String user="root";
        String password="";
        
        try {
            con=DriverManager.getConnection(address, user, password);
            System.out.println("success");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return con;
        
    }
    public static void main(String[] args) {
        connection();
        
    }
}
