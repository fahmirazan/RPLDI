/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class SQLUmum extends DBConnect {

    Connection connection;
    Statement statement;
    String SQL;
    String url;
    String username;
    String password;
    Socket client;
    int Port;
    String Host;

    public ResultSet eksekusiQuery(String sql) {
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLUmum.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultSet;

    }

    public String eksekusiUpdate(String sql) {
        String result = "";
        try {
            connection = getConnection();
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SQLUmum.class.getName()).log(Level.SEVERE, null, ex);
            result = ex.toString();
        }

        return result;

    }

//Fungsi untuk eksekusi query select semua kolom
    public ResultSet querySelectAll(String namaTabel) {

        SQL = "SELECT * FROM " + namaTabel;
        return this.eksekusiQuery(SQL);

    }

//Overload fungsi untuk eksekusi query select semua kolom dengan where
    public ResultSet querySelectAll(String namaTabel, String kondisi) {

        SQL = "SELECT * FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiQuery(SQL);

    }

//Fungsi untuk eksekusi query select dengan kolom spesifik
    public ResultSet querySelect(String[] namaKolom, String namaTabel) {

        int i;
        SQL = "SELECT ";

        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }

        SQL += " FROM " + namaTabel;
        // System.out.println(SQL);
        return this.eksekusiQuery(SQL);

    }

//Overload fungsi untuk eksekusi query select dengan kolom spesifik dengan where
    public ResultSet querySelect(String[] namaKolom, String namaTabel, String kondisi) {

        int i;
        SQL = "SELECT ";

        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }

        SQL += " FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiQuery(SQL);

    }

//Fungsi eksekusi query insert
    public String queryInsert(String namaTabel, String[] isiTabel) {

        int i;
        SQL = "INSERT INTO " + namaTabel + " VALUES(";

        for (i = 0; i <= isiTabel.length - 1; i++) {
            SQL += "'" + isiTabel[i] + "'";
            if (i < isiTabel.length - 1) {
                SQL += ",";
            }
        }

        SQL += ")";
        return this.eksekusiUpdate(SQL);

    }
//Fungsi eksekusi query insert

    public String queryInsert(String namaTabel, String[] namaKolom, String[] isiTabel) {

        int i;
        SQL = "INSERT INTO " + namaTabel + "(";
        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i];
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }
        SQL += ") VALUES(";
        for (i = 0; i <= isiTabel.length - 1; i++) {
            SQL += "'" + isiTabel[i] + "'";
            if (i < isiTabel.length - 1) {
                SQL += ",";
            }
        }

        SQL += ")";
        return this.eksekusiUpdate(SQL);

    }
//Fungsi eksekusi query update

    public String queryUpdate(String namaTabel, String[] namaKolom, String[] isiTabel, String kondisi) {

        int i;
        SQL = "UPDATE " + namaTabel + " SET ";

        for (i = 0; i <= namaKolom.length - 1; i++) {
            SQL += namaKolom[i] + "='" + isiTabel[i] + "'";
            if (i < namaKolom.length - 1) {
                SQL += ",";
            }
        }

        SQL += " WHERE " + kondisi;
        return this.eksekusiUpdate(SQL);

    }

//Fungsi eksekusi query delete
    public String queryDelete(String namaTabel) {

        SQL = "DELETE FROM " + namaTabel;
        return this.eksekusiUpdate(SQL);

    }

//Overload fungsi eksekusi query delete dengan where
    public String queryDelete(String namaTabel, String kondisi) {

        SQL = "DELETE FROM " + namaTabel + " WHERE " + kondisi;
        return this.eksekusiUpdate(SQL);

    }
}
