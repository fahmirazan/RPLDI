/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fahmi
 */
public class cartItemModel {
    private int id;
    private int jumlah;
    private productModel product;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public productModel getProduct() {
        return product;
    }

    public void setProduct(productModel product) {
        this.product = product;
    }   
    
/*
    private String productCode;
    private String productName;
    private int dblHarga;
    private int iQty;
    private int subTotalHarga;
    
    public String getproductCode() {
        return productCode;
    }
    public void setproductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getproductName() {
        return productName;
    }
    public void setproductName(String productName) {
        this.productName = productName;
    }
    public double getHarga() {
        return dblHarga;
    }
    public void setHarga(int dblHarga) {
        this.dblHarga = dblHarga;
    }
    public int getQty() {
        return iQty;
    }
    public void setQuantity(int qty) {
        iQty = qty;
    }
    public double getTotalHarga() {
        return subTotalHarga;
    }
    public void setTotalHarga(int dblTotalHarga) {
        this.subTotalHarga =  dblTotalHarga;
    }
*/
}
