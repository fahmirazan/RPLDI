/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fahmi
 */
public class cartModelTest {
    /**
     * Test of hitungTotalHarga method, of class cartModel.
     */
    @Test
    public void testHitungTotalHarga() {
        System.out.println("hitungTotalHarga");
        cartModel instance = new cartModel();
        productModel product = new productModel();
        product.setHarga(50000);
        product.setStok(9);  
        cartItemModel item = new cartItemModel();
        item.setProduct(product);
        item.setJumlah(4);
        List<cartItemModel> listCartItem;
        listCartItem = new ArrayList<cartItemModel>();
        listCartItem.add(item);
        instance.setListCartItem(listCartItem);
        int expResult = 0;
        int result = instance.hitungTotalHarga();
        assertEquals(expResult, result);
    }
}
