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
import model.productModel;

/**
 *
 * @author fahmi
 */
public class DAOProduct {

    public List<productModel> getProduct() {
        List<productModel> listProduct = new ArrayList();
        ResultSet result;
        try {
            try (Statement statement = DBConnect.getConnection().createStatement()) {
                result = statement.executeQuery("SELECT * FROM sqlproduct");
                while (result.next()) {
                    productModel product = new productModel();
                    product.setId(result.getInt(1));
                    product.setNama_barang(result.getString(2));
                    product.setHarga(result.getInt(3));
                    product.setVariasi(result.getString(4));
                    product.setStok(result.getInt(5));
                    product.setDeskripsi(result.getString(6));
                    listProduct.add(product);
                }
            }
            result.close();
            return listProduct;
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void addProduct(productModel product) {
        try {
            Connection connection = DBConnect.getConnection();
            String sql = "INSERT INTO sqlproduct (nama_barang, harga, variasi, stok, deskripsi) VALUES (?,?,?,?,?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, product.getNama_barang());
                statement.setInt(2, product.getHarga());
                statement.setString(3, product.getVariasi());
                statement.setInt(4, product.getStok());
                statement.setString(5, product.getDeskripsi());

                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteProduct(int id) {
        try {
            Connection connection = DBConnect.getConnection();
            String sql = "DELETE FROM sqlproduct WHERE id = "+id;
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateStockProduct(int id, int stockUpdate){
        try {
            Connection connection = DBConnect.getConnection();
            String sql = "UPDATE sqlproduct SET stok = "+stockUpdate+" WHERE id = "+id;
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
