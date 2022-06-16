/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.productModel;

/**
 *
 * @author fahmi
 */
public class DAOProduct {
    public void addProduct(productModel product){
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
}
