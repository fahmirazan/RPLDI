/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.DAOAdmin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.adminModel;
import view.loginPage;

/**
 *
 * @author A412FL
 */
public class loginController {

    private loginPage LoginPageFrame;
    private DAOAdmin daoadmin;

    public loginController(loginPage LoginPageFrame) {
        this.LoginPageFrame = LoginPageFrame;
        daoadmin = new DAOAdmin();
    }

    

    public void proses_login() {
        String role = (String) LoginPageFrame.getRoleComboBox().getSelectedItem();
        String username = LoginPageFrame.getUsernameLoginField().getText();
        String password = LoginPageFrame.getPassword();
        
        if ("admin".equals(role)){
            adminModel admin = daoadmin.getAdmin(username, password);
            if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
                JOptionPane.showMessageDialog(null, "berhasil login");
            } else {
                JOptionPane.showMessageDialog(null, "username atau password salah");
            }
        } else if ("customer".equals(role)){
                
        }
    }

}
