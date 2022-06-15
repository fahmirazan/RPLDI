/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.customerModel;
import view.MainPage;
import view.SignIn;

/**
 *
 * @author A412FL
 */
public class customerPageController {
    private MainPage customerPageFrame;
    private customerModel customer;
    private SignIn profilePage;
    
    
    public customerPageController(MainPage customerPageFrame, customerModel customer) {
        this.customerPageFrame = customerPageFrame;
        this.customer = customer;
        this.profilePage = new SignIn();
    }




}
