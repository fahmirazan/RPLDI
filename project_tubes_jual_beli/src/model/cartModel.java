/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author A412FL
 */
public class cartModel {

    private int id;
    private int total_harga;
    private String pembayaran;
    private String status_checkout;
    private List<cartItemModel> listCartItem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }
    
    public int hitungTotalHarga(){
        int total = 0;
        for(cartItemModel item : listCartItem){
            total += item.getJumlah()*item.getProduct().getHarga();
        }
        return total;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getStatus_checkout() {
        return status_checkout;
    }

    public void setStatus_checkout(String status_checkout) {
        this.status_checkout = status_checkout;
    }

    public List<cartItemModel> getListCartItem() {
        return listCartItem;
    }

    public void setListCartItem(List<cartItemModel> listCartItem) {
        this.listCartItem = listCartItem;
    }

    public void addCartItem(cartItemModel item) {
        this.listCartItem.add(item);
    }
    
    public int getItemCount(){
        return listCartItem.size();
    }
    /*
    private final ArrayList alCartItem = new ArrayList();
    private List<CartItem>alCartItems;
    
    public int getLineItemCount() {
        return alCartItem.size();
    }
    
    public void deleteCartItem() {
        
    }
    public void updateCartItem() {
        
    }
    public void addCartItem(String productCode, String productName, String productPrice, String quantity) {
        int dblTotalHarga = 0;
        int dblHarga = 0;
        int iQty = 0;  
        CartItem cart = new CartItem();
        try {
            dblHarga = Integer.parseInt(productPrice);
            iQty = Integer.parseInt(quantity);
            if (iQty > 0) {
                dblTotalHarga = (iQty*dblHarga);
                cart.setproductName(productName);
                cart.setHarga(dblHarga);
                cart.setQuantity(iQty);
                cart.setTotalHarga(dblTotalHarga);
                alCartItems.add(cart);
            }
        }  catch (NumberFormatException nfe) {
                System.out.println("Error while parsing from String to primitive types: "+nfe.getMessage());
            }
    }
    
    public void addCartItem(CartItem cart) {
         alCartItems.add(cart);
    }
     */

}
