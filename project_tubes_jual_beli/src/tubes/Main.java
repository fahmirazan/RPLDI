/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import controller.loginController;
import java.sql.SQLException;
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
        loginPage view = new loginPage();
        view.setLocationRelativeTo(null);
        view.setVisible(true);
        view.setResizable(false);
        
    }
    
}
