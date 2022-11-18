/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JOptionPane;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.border.Border;
import utils.Auth;
import utils.MsgBox;

public class Login extends javax.swing.JFrame {


    public Login() {
        initComponents();
        Init();
        setSize(900, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Login");
        txtUserName.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        PanelTen = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelPass = new javax.swing.JPanel();
        txtPassWord = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lblHide = new javax.swing.JLabel();
        lblView = new javax.swing.JLabel();
        btnQR = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        Hamburger = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTen.setBackground(new java.awt.Color(95, 137, 90));

        txtUserName.setBackground(new java.awt.Color(182, 212, 196));
        txtUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/person.gif"))); // NOI18N
        jLabel1.setText("User name :");

        javax.swing.GroupLayout PanelTenLayout = new javax.swing.GroupLayout(PanelTen);
        PanelTen.setLayout(PanelTenLayout);
        PanelTenLayout.setHorizontalGroup(
            PanelTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        PanelTenLayout.setVerticalGroup(
            PanelTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 440, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 40)); // NOI18N
        jLabel2.setText("Login here");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        PanelPass.setBackground(new java.awt.Color(95, 137, 90));
        PanelPass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPassWord.setBackground(new java.awt.Color(182, 212, 196));
        txtPassWord.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassWord.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPassWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassWordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Khoa.gif"))); // NOI18N
        jLabel3.setText("Password :");

        lblHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hide.png"))); // NOI18N
        lblHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHideMousePressed(evt);
            }
        });

        lblView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/view.png"))); // NOI18N
        lblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblViewMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelPassLayout = new javax.swing.GroupLayout(PanelPass);
        PanelPass.setLayout(PanelPassLayout);
        PanelPassLayout.setHorizontalGroup(
            PanelPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHide)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPassLayout.setVerticalGroup(
            PanelPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelPassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelPassLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblView, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(PanelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 440, -1));

        btnQR.setBackground(new java.awt.Color(50, 81, 45));
        btnQR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnQR.setForeground(new java.awt.Color(255, 255, 255));
        btnQR.setText("MÃ QR");
        btnQR.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });
        getContentPane().add(btnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 140, 50));

        btnCancel.setBackground(new java.awt.Color(50, 81, 45));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 140, 50));

        btnLogin.setBackground(new java.awt.Color(50, 81, 45));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 140, 50));

        Hamburger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hamBURGER.jpg"))); // NOI18N
        getContentPane().add(Hamburger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 4, 4));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("Eatery");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 768, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       if (valuDate() == true){
            login();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblHideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHideMousePressed
        lblHide.setVisible(false);
        lblView.setVisible(true);
        txtPassWord.setEchoChar((char) 0);
    }//GEN-LAST:event_lblHideMousePressed

    private void lblViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewMousePressed
        lblHide.setVisible(true);
        lblView.setVisible(false);
        txtPassWord.setEchoChar('*');
    }//GEN-LAST:event_lblViewMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
        qrcode qr = new qrcode();
        qr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQRActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
        String key = evt.getActionCommand();
        if(key.endsWith("")){
            txtPassWord.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtPassWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassWordActionPerformed
        // TODO add your handling code here:
        String key = evt.getActionCommand();
        if(key.endsWith("")){
            login();
        }
    }//GEN-LAST:event_txtPassWordActionPerformed

    public boolean valuDate() {
        if (txtPassWord.getPassword().equals("") || txtUserName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "vui long nhap day du thong tin!");
            return false;
        } else {
            return true;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hamburger;
    private javax.swing.JPanel PanelPass;
    private javax.swing.JPanel PanelTen;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQR;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHide;
    private javax.swing.JLabel lblView;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
    NhanVienDAO dao = new NhanVienDAO();
    //reset from
    public void reset() {
        txtUserName.setText("");
        txtPassWord.setText("");
    }

    public boolean check() {
        if ((txtUserName.getText().isEmpty()) || (txtPassWord.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "User Name or Pass Word swrong");
            reset();
            txtUserName.grabFocus();
            return false;
        }
        return true;
    }

    //login
    void login() {
        String username = txtUserName.getText();
        String password = new String(txtPassWord.getPassword());
        NhanVien nhanvien = dao.selectById(username);
        if (nhanvien == null) {
            MsgBox.alert(this, "Username hoặc password sai !");
        } else if (!password.equals(nhanvien.getMatKhau())) {
            MsgBox.alert(this, "Username hoặc password sai !");
        } else {
            Auth.user = nhanvien;
            MsgBox.alert(this, "Đăng nhập thành công ");
            TrangChuJFrame tc =new TrangChuJFrame();
            tc.setVisible(true);
            this.dispose();
        }
        
    }
    
    public void Init() {
        new Chao(this, true).setVisible(true);
 
    }

}
