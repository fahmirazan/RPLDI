/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.DAOProduct;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
    
    public void prosesTampilProduct(){
        DefaultTableModel tableModel = (DefaultTableModel) adminPage.getProductTable().getModel();
        tableModel.setRowCount(0);
        
        List<productModel> listProduct = dao_product.getProduct();
        
        Object data[] = new Object[5];
        
        for(productModel product: listProduct){
            data[0] = product.getId();
            data[1] = product.getNama_barang();
            data[2] = product.getHarga();
            data[3] = product.getVariasi();
            data[4] = product.getStok();
            
            tableModel.addRow(data);
        }
    }
    
    public void prosesHapusProduct(){
        int id = Integer.parseInt(adminPage.getDeleteFieldbyID().getText());
        dao_product.deleteProduct(id);
        JOptionPane.showMessageDialog(null, "Barang berhasil dihapus");
        prosesTampilProduct();
    }
    
   public void prosesUpdateStockProduct(){
       int id = Integer.parseInt(adminPage.getStokUpdateIDField().getText());
       int jumlahStokUpdate = Integer.parseInt(adminPage.getStockUpdateQtyField().getText());
       dao_product.updateStockProduct(id, jumlahStokUpdate);
       JOptionPane.showMessageDialog(null, "Stok Barang berhasil ditambah");
       prosesTampilProduct();
   }
}
