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
public class adminModel {
    private String username;
    private String password;
    private String foto;

    public adminModel(String username, String password, String foto) {
        this.username = username;
        this.password = password;
    }

    public adminModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFoto() {
        return foto;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    
}