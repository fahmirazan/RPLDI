/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.DAOAdmin;
import Database.DAOCustomer;
import javax.swing.JOptionPane;
import model.adminModel;
import model.customerModel;
import view.MainPage;
import view.loginPage;

/**
 *
 * @author A412FL
 */
public class loginController {

    private loginPage LoginPageFrame;
    private MainPage customerPageFrame;
    private DAOAdmin daoadmin;
    private DAOCustomer daocustomer;

    public loginController(loginPage LoginPageFrame) {
        this.LoginPageFrame = LoginPageFrame;
        daoadmin = new DAOAdmin();
        daocustomer = new DAOCustomer();
    }

    public void proses_login() {
        String role = (String) LoginPageFrame.getRoleComboBox().getSelectedItem();
        String username = LoginPageFrame.getUsernameLoginField().getText();
        String password = LoginPageFrame.getPassword();

        if ("admin".equals(role)) {
            adminModel admin = daoadmin.getAdmin(username, password);
            if (validateAdmin(admin, username, password)) {
                JOptionPane.showMessageDialog(null, "admin berhasil login");
            } else {
                JOptionPane.showMessageDialog(null, "username atau password salah");
            }
        } else if ("customer".equals(role)) {
            customerModel customer = daocustomer.getCustomer(username, password);
            if (customer.getUsername().equals(username) && customer.getPassword().equals(password)) {
                // JOptionPane.showMessageDialog(null, "customer berhasil login");
                LoginPageFrame.dispose();
                customerPageFrame = new MainPage();
                customerPageFrame.setLocationRelativeTo(null);
                customerPageFrame.setVisible(true);
                customerPageFrame.setResizable(false);
            } else {
                JOptionPane.showMessageDialog(null, "username atau password salah");
            }
        }
    }

    public boolean validateAdmin(adminModel admin, String username, String password) {
        // return admin.getUsername() != null && admin.getUsername().equals(username) && admin.getPassword().equals(password);
        return admin.getUsername() != null;
    }

    public boolean validateCustomer(customerModel customer, String username, String password) {
        return customer.getUsername() != null;
    }
}
