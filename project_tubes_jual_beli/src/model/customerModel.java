/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class customerModel {
    private String username;
    private String nama;
    private String password;
    private String no_telepon;
    private String alamat;
    private List<cartModel> listCart; 

    public customerModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public customerModel(String username, String nama, String password, String no_telepon, String alamat) {
        this.username = username;
        this.nama = nama;
        this.password = password;
        this.no_telepon = no_telepon;
        this.alamat = alamat;
    }

    public customerModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<cartModel> getListCart() {
        return listCart;
    }

    public void setListCart(List<cartModel> listCart) {
        this.listCart = listCart;
    }
    
}
