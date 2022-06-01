/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class DBConnect {
    public static Connection con;
    
    public static Connection getConnection() throws SQLException{
        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rpldi", "root","");
                System.out.println("Driver ditemukan");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error koneksi");
            }
        }
        return con;
    }
}