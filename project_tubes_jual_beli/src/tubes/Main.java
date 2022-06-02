/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import controller.loginController;
import java.sql.SQLException;
import javax.swing.JFrame;
import view.MainPage;
import view.loginPage;

/**
 *
 * @author ASUS
 */

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
        //loginController controller = new loginController();
        JFrame newMain = new MainPage();
        newMain.setTitle("E-Shoping");
        newMain.setVisible(true);
        newMain.setResizable(false);
        
    }
    
}
