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
}
