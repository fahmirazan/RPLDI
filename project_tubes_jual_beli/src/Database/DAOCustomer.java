/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.customerModel;

/**
 *
 * @author A412FL
 */
public class DAOCustomer {
    private List<customerModel> listCustomer;

    public List<customerModel> getAllCustomer() {
        listCustomer = new ArrayList<>();
        try {
            ResultSet result;
            try (Statement statement = DBConnect.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM sqlcustomer");
                while (result.next()) {
                    customerModel customer = new customerModel();
                    customer.setUsername(result.getString(1));
                    customer.setPassword(result.getString(2));

                    listCustomer.add(customer);
                }
            }
            result.close();
            return listCustomer;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public customerModel getCustomer(String username, String password){
        customerModel customer = new customerModel();
        try {
            ResultSet result;
            try (Statement statement = DBConnect.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM sqlcustomer WHERE username = '"+username+"' and password = '"+ password+"'");
                while (result.next()) {
                    customer.setUsername(result.getString(1));
                    customer.setNama(result.getString(2));
                    customer.setPassword(result.getString(3));
                    customer.setNo_telepon(result.getString(4));
                    customer.setAlamat(result.getString(5));
                }
            }
            result.close();
            return customer;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void Register(customerModel customer) {
        try {
            Connection connection = DBConnect.getConnection();
            String sql = "INSERT INTO `sqlcustomer`(`username`, `nama`, `password`, `no_telp`, `alamat`) VALUES (?,?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, customer.getUsername());
                statement.setString(2, customer.getNama());
                statement.setString(3, customer.getPassword());
                statement.setString(4, customer.getNo_telepon());
                statement.setString(5, customer.getAlamat());

                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
