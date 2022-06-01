/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.adminModel;

/**
 *
 * @author A412FL
 */
public class DAOAdmin {

    private List<adminModel> listAdmin;

    public List<adminModel> getAllAdmin() {
        listAdmin = new ArrayList<>();
        try {
            ResultSet result;
            try (Statement statement = DBConnect.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM sqladmin");
                while (result.next()) {
                    adminModel admin = new adminModel();
                    admin.setUsername(result.getString(1));
                    admin.setPassword(result.getString(2));

                    listAdmin.add(admin);
                }
            }
            result.close();
            return listAdmin;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public adminModel getAdmin(String username, String password){
        adminModel admin = new adminModel();
        try {
            ResultSet result;
            try (Statement statement = DBConnect.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM sqladmin WHERE username = '"+username+"' and password = '"+ password+"'");
                while (result.next()) {
                    admin.setUsername(result.getString(1));
                    admin.setPassword(result.getString(2));
                }
            }
            result.close();
            return admin;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
