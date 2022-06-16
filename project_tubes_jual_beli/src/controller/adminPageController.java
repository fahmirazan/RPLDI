/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.DAOProduct;
import javax.swing.JOptionPane;
import model.productModel;
import view.AdminPage;

/**
 *
 * @author A412FL
 */
public class adminPageController {
    
    private AdminPage adminPage;
    private DAOProduct dao_product;

    public adminPageController(AdminPage adminPage) {
        this.adminPage = adminPage;
        this.dao_product = new DAOProduct();
    }
    
    public void prosesTambahProduct(){
        String nama_barang = this.adminPage.getNamaBarangInputField().getText();
        int harga = Integer.parseInt(this.adminPage.getHargaInputField().getText());
        String variasi = this.adminPage.getVariasiInputField().getText();
        int stok = Integer.parseInt(this.adminPage.getStokInputField().getText());
        String Deskripsi = this.adminPage.getDeskripsiInputField().getText();
        
        productModel barang = new productModel(nama_barang, harga, variasi, stok, Deskripsi);
        
        dao_product.addProduct(barang);
        JOptionPane.showMessageDialog(null, "Barang Behasil Ditambahkan");
    }
}
