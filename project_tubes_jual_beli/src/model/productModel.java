/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author A412FL
 */
public class productModel {
    private int id;
    private String nama_barang;
    private int harga;
    private String variasi;
    private int stok;
    private String deskripsi;

    public productModel(String nama_barang, int harga, String variasi, int stok, String deskripsi) {
        this.nama_barang = nama_barang;
        this.harga = harga;
        this.variasi = variasi;
        this.stok = stok;
        this.deskripsi = deskripsi;
    }

    public productModel() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getVariasi() {
        return variasi;
    }

    public void setVariasi(String variasi) {
        this.variasi = variasi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    
}
