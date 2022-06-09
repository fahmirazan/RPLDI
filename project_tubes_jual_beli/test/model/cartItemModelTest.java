/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A412FL
 */
public class cartItemModelTest {
    
    public cartItemModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class cartItemModel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        cartItemModel instance = new cartItemModel();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class cartItemModel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        cartItemModel instance = new cartItemModel();
        instance.setId(id);
    }

    /**
     * Test of getJumlah method, of class cartItemModel.
     */
    @Test
    public void testGetJumlah() {
        System.out.println("getJumlah");
        cartItemModel instance = new cartItemModel();
        int expResult = 0;
        int result = instance.getJumlah();
        assertEquals(expResult, result);
    }

    /**
     * Test of setJumlah method, of class cartItemModel.
     */
    @Test
    public void testSetJumlah() {
        System.out.println("setJumlah");
        int jumlah = 0;
        cartItemModel instance = new cartItemModel();
        instance.setJumlah(jumlah);
    }

    /**
     * Test of getProduct method, of class cartItemModel.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        cartItemModel instance = new cartItemModel();
        productModel expResult = null;
        productModel result = instance.getProduct();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProduct method, of class cartItemModel.
     */
    @Test
    public void testSetProduct() {
        System.out.println("setProduct");
        productModel product = null;
        cartItemModel instance = new cartItemModel();
        instance.setProduct(product);
    }
    
}
