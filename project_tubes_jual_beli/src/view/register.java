/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Database.DBConnect;
import java.sql.PreparedStatement;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fahmi
 */
public class register extends javax.swing.JFrame {

    /**
     * Creates new form register
     */
    public register() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CustomerTab = new javax.swing.JButton();
        SellerTab = new javax.swing.JButton();
        ParentPanel = new javax.swing.JPanel();
        CustomerRegisterPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RegisterCustomerUsernameField = new javax.swing.JTextField();
        RegisterCustomerNamaField = new javax.swing.JTextField();
        RegisterCustomerPasswordField = new javax.swing.JPasswordField();
        RegisterCustomerTeleponField = new javax.swing.JTextField();
        RegisterCustomerAlamatField = new javax.swing.JTextField();
        RegisterCustomerButton = new javax.swing.JButton();
        jButton2backlogin = new javax.swing.JButton();
        SellerRegisterPanel = new javax.swing.JPanel();
        jTextField1nama1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField2telepon1 = new javax.swing.JTextField();
        jTextField3alamat1 = new javax.swing.JTextField();
        jButton1register1 = new javax.swing.JButton();
        jButton2backlogin1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPasswordFieldPassword1 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldUsername2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(457, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        CustomerTab.setBackground(new java.awt.Color(51, 102, 255));
        CustomerTab.setForeground(new java.awt.Color(255, 255, 255));
        CustomerTab.setText("Customer");
        CustomerTab.setBorderPainted(false);
        CustomerTab.setContentAreaFilled(false);
        CustomerTab.setMaximumSize(new java.awt.Dimension(71, 29));
        CustomerTab.setMinimumSize(new java.awt.Dimension(71, 29));
        CustomerTab.setPreferredSize(new java.awt.Dimension(71, 29));
        CustomerTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerTabActionPerformed(evt);
            }
        });

        SellerTab.setBackground(new java.awt.Color(51, 102, 255));
        SellerTab.setForeground(new java.awt.Color(255, 255, 255));
        SellerTab.setText("Seller");
        SellerTab.setBorderPainted(false);
        SellerTab.setContentAreaFilled(false);
        SellerTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(CustomerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(SellerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerTab, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        ParentPanel.setLayout(new java.awt.CardLayout());

        CustomerRegisterPanel.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Nama");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("No telepon");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Alamat");

        RegisterCustomerUsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerUsernameFieldActionPerformed(evt);
            }
        });

        RegisterCustomerNamaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerNamaFieldActionPerformed(evt);
            }
        });

        RegisterCustomerPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerPasswordFieldActionPerformed(evt);
            }
        });

        RegisterCustomerTeleponField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerTeleponFieldActionPerformed(evt);
            }
        });

        RegisterCustomerAlamatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerAlamatFieldActionPerformed(evt);
            }
        });

        RegisterCustomerButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RegisterCustomerButton.setText("Register");
        RegisterCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterCustomerButtonregisterActionPerformed(evt);
            }
        });

        jButton2backlogin.setText("Back to Login");
        jButton2backlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2backloginbackloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomerRegisterPanelLayout = new javax.swing.GroupLayout(CustomerRegisterPanel);
        CustomerRegisterPanel.setLayout(CustomerRegisterPanelLayout);
        CustomerRegisterPanelLayout.setHorizontalGroup(
            CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerRegisterPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2backlogin)
                    .addGroup(CustomerRegisterPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RegisterCustomerTeleponField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(RegisterCustomerPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterCustomerNamaField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterCustomerButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterCustomerUsernameField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RegisterCustomerAlamatField))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        CustomerRegisterPanelLayout.setVerticalGroup(
            CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerRegisterPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterCustomerUsernameField)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterCustomerNamaField)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterCustomerPasswordField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterCustomerTeleponField)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CustomerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RegisterCustomerAlamatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CustomerRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGap(34, 34, 34)
                .addComponent(RegisterCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton2backlogin)
                .addContainerGap())
        );

        ParentPanel.add(CustomerRegisterPanel, "card2");

        SellerRegisterPanel.setBackground(new java.awt.Color(204, 255, 204));

        jTextField1nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1nama1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("No telepon");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Rekening");

        jTextField2telepon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2telepon1ActionPerformed(evt);
            }
        });

        jTextField3alamat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3alamat1ActionPerformed(evt);
            }
        });

        jButton1register1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1register1.setText("Register");
        jButton1register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1register1registerActionPerformed(evt);
            }
        });

        jButton2backlogin1.setText("Back to Login");
        jButton2backlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2backlogin1backloginActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Username");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Password");

        jPasswordFieldPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassword1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Nama");

        jTextFieldUsername2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsername2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SellerRegisterPanelLayout = new javax.swing.GroupLayout(SellerRegisterPanel);
        SellerRegisterPanel.setLayout(SellerRegisterPanelLayout);
        SellerRegisterPanelLayout.setHorizontalGroup(
            SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellerRegisterPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2backlogin1)
                    .addGroup(SellerRegisterPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(38, 38, 38)
                        .addGroup(SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2telepon1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldPassword1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1nama1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1register1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsername2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3alamat1))))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        SellerRegisterPanelLayout.setVerticalGroup(
            SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellerRegisterPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldUsername2)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1nama1)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordFieldPassword1)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2telepon1)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SellerRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3alamat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SellerRegisterPanelLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addGap(34, 34, 34)
                .addComponent(jButton1register1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 100, Short.MAX_VALUE)
                .addComponent(jButton2backlogin1)
                .addContainerGap())
        );

        ParentPanel.add(SellerRegisterPanel, "card3");

        getContentPane().add(ParentPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterCustomerButtonregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerButtonregisterActionPerformed
        String uname = RegisterCustomerUsernameField.getText();
        String name = RegisterCustomerNamaField.getText();
        String pass = String.valueOf(RegisterCustomerPasswordField.getPassword());
        String telp = RegisterCustomerTeleponField.getText();
        String adres = RegisterCustomerAlamatField.getText();

        PreparedStatement ps;
        String query = "INSERT INTO `sqlcostumer`(`username`, `nama`, `password`, `no_telp`, `alamat`) VALUES (?,?,?,?,?)";
        try {
            ps = (PreparedStatement) DBConnect.getConnection().prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2, name);
            ps.setString(3, pass);
            ps.setString(4, telp);
            ps.setString(5, adres);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "New user add");
            }

// TODO add your handling code here:
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_RegisterCustomerButtonregisterActionPerformed

    private void RegisterCustomerPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterCustomerPasswordFieldActionPerformed

    private void RegisterCustomerUsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerUsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterCustomerUsernameFieldActionPerformed

    private void RegisterCustomerNamaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerNamaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterCustomerNamaFieldActionPerformed

    private void RegisterCustomerTeleponFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerTeleponFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterCustomerTeleponFieldActionPerformed

    private void RegisterCustomerAlamatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterCustomerAlamatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegisterCustomerAlamatFieldActionPerformed

    private void jButton2backloginbackloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2backloginbackloginActionPerformed
        this.dispose();
        loginPage obj = null;
        try {
            obj = new loginPage();
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2backloginbackloginActionPerformed

    private void CustomerTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerTabActionPerformed
        // TODO add your handling code here:
        ParentPanel.removeAll();
        ParentPanel.add(CustomerRegisterPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_CustomerTabActionPerformed

    private void SellerTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerTabActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        ParentPanel.removeAll();
        ParentPanel.add(SellerRegisterPanel);
        ParentPanel.repaint();
        ParentPanel.revalidate();
    }//GEN-LAST:event_SellerTabActionPerformed

    private void jTextField1nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1nama1ActionPerformed

    private void jTextField2telepon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2telepon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2telepon1ActionPerformed

    private void jTextField3alamat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3alamat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3alamat1ActionPerformed

    private void jButton1register1registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1register1registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1register1registerActionPerformed

    private void jButton2backlogin1backloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2backlogin1backloginActionPerformed
        // TODO add your handling code here:
        this.dispose();
        loginPage obj = null;
        try {
            obj = new loginPage();
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2backlogin1backloginActionPerformed

    private void jPasswordFieldPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassword1ActionPerformed

    private void jTextFieldUsername2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsername2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsername2ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new register().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CustomerRegisterPanel;
    private javax.swing.JButton CustomerTab;
    private javax.swing.JPanel ParentPanel;
    private javax.swing.JTextField RegisterCustomerAlamatField;
    private javax.swing.JButton RegisterCustomerButton;
    private javax.swing.JTextField RegisterCustomerNamaField;
    private javax.swing.JPasswordField RegisterCustomerPasswordField;
    private javax.swing.JTextField RegisterCustomerTeleponField;
    private javax.swing.JTextField RegisterCustomerUsernameField;
    private javax.swing.JPanel SellerRegisterPanel;
    private javax.swing.JButton SellerTab;
    private javax.swing.JButton jButton1register1;
    private javax.swing.JButton jButton2backlogin;
    private javax.swing.JButton jButton2backlogin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPassword1;
    private javax.swing.JTextField jTextField1nama1;
    private javax.swing.JTextField jTextField2telepon1;
    private javax.swing.JTextField jTextField3alamat1;
    private javax.swing.JTextField jTextFieldUsername2;
    // End of variables declaration//GEN-END:variables
}
