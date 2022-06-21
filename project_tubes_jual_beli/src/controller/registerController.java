/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.DAOAdmin;
import Database.DAOCustomer;
import javax.swing.JOptionPane;
import model.customerModel;
import view.registerPage;

/**
 *
 * @author A412FL
 */
public class registerController {
    private registerPage frm;
    private DAOCustomer daoCustomer;

    public registerController(registerPage frm) {
        this.frm = frm;
        this.daoCustomer = new DAOCustomer();
    }
    
    public void prosesRegister(){
        String uname = frm.getRegisterCustomerUsernameField().getText();
        String name = frm.getRegisterCustomerNamaField().getText();
        String pass = String.valueOf(frm.getRegisterCustomerPasswordField().getPassword());
        String telp = frm.getRegisterCustomerTeleponField().getText();
        String adres = frm.getRegisterCustomerAlamatField().getText();
        
        customerModel customer = new customerModel(uname, name, pass, telp, adres);
        daoCustomer.Register(customer);
        JOptionPane.showMessageDialog(null, "New user add");
    }
}
