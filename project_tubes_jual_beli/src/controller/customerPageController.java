/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import Database.DAOProduct;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.customerModel;
import model.productModel;
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
    private DAOProduct daoProduct;
    
    

    public customerPageController(MainPage customerPageFrame, customerModel customer) {
        this.customerPageFrame = customerPageFrame;
        this.customer = customer;
        this.daoProduct = new DAOProduct();
        
        //this.profilePage = new SignIn(customer.getUsername());
    }
    
    public void tampilProfile(){
        this.profilePage = new SignIn(customer.getUsername());
        profilePage.setLocationRelativeTo(null);
        profilePage.setVisible(true);
        profilePage.setResizable(false);
    }

    public void prosesTampilProduct() {
        
        List<productModel> listProduct = daoProduct.getProduct();
        
        Object rowData[] = new Object[5];
        
        DefaultTableModel model =  (DefaultTableModel) customerPageFrame.getHomeTable().getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        customerPageFrame.getHomeTable().getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        customerPageFrame.getHomeTable().getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        customerPageFrame.getHomeTable().getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        customerPageFrame.getHomeTable().getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        //customerPageFrame.getHomeTable().getColumnModel().getColumn(4).setCellRenderer( centerRenderer );

       
        //model.setRowCount(0);
        
        for(int i=0; i<listProduct.size(); i++){
            rowData[0] = listProduct.get(i).getNama_barang();
            rowData[1] = listProduct.get(i).getHarga();
            rowData[2] = listProduct.get(i).getVariasi();
            rowData[3] = listProduct.get(i).getStok();
            //String temp = list.get(i).getMimage();
            ImageIcon ii = new ImageIcon(getClass().getResource("/icons/Citycell.jpg"));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
         
            rowData[4] = ii;
            model.addRow(rowData);
            customerPageFrame.getHomeTable().setRowHeight(150);
            customerPageFrame.getHomeTable().getColumnModel().getColumn(4).setPreferredWidth(150);
        }
    }
}
