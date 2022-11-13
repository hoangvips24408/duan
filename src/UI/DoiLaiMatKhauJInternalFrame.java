/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.NhanVienDAO;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import UI.TrangChuJFrame;
import utils.Auth;
import utils.MsgBox;
/**
 *
 * @author Quan
 */
public class DoiLaiMatKhauJInternalFrame extends javax.swing.JInternalFrame {

    NhanVienDAO nvDAO = new NhanVienDAO();

    
    public DoiLaiMatKhauJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        txtTenDangNhap.setText(Auth.user.getMaNV());
        txtTenDangNhap.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMKC = new javax.swing.JLabel();
        lblTHT = new javax.swing.JLabel();
        txtTenHienThi = new javax.swing.JTextField();
        lblTDN = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        btnCapNhat = new javax.swing.JButton();
        lblCaiDatMatKhau = new javax.swing.JLabel();
        txtNhapLaiMK = new javax.swing.JPasswordField();
        lblNLMK = new javax.swing.JLabel();
        lblMKM = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        txtMatKhauCu = new javax.swing.JPasswordField();
        btnDangXuat = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1028, 585));

        lblMKC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMKC.setForeground(new java.awt.Color(0, 153, 0));
        lblMKC.setText("Mật Khẩu Cũ");

        lblTHT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTHT.setForeground(new java.awt.Color(0, 153, 0));
        lblTHT.setText("Tên Hiển Thị");

        lblTDN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN.setText("Tên Đăng Nhập");

        btnCapNhat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        lblCaiDatMatKhau.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblCaiDatMatKhau.setForeground(new java.awt.Color(0, 153, 51));
        lblCaiDatMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaiDatMatKhau.setText("CÀI ĐẶT MẬT KHẨU");
        lblCaiDatMatKhau.setToolTipText("");

        lblNLMK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNLMK.setForeground(new java.awt.Color(0, 153, 0));
        lblNLMK.setText("Nhập Lại MK");

        lblMKM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMKM.setForeground(new java.awt.Color(0, 153, 0));
        lblMKM.setText("Mật Khẩu Mới");

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCaiDatMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblMKC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTDN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNLMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTHT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCapNhat)
                        .addGap(66, 66, 66)
                        .addComponent(btnDangXuat)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTenDangNhap)
                        .addComponent(txtTenHienThi)
                        .addComponent(txtMatKhauCu)
                        .addComponent(txtMatKhauMoi)
                        .addComponent(txtNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(290, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblCaiDatMatKhau)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN)
                            .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(lblTHT))
                    .addComponent(txtTenHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMKC)
                    .addComponent(txtMatKhauCu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMKM)
                    .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNLMK)
                    .addComponent(txtNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(btnDangXuat))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        if(MsgBox.confirm(this, "Bạn có muốn đăng xuất tài khoản?") == true) {
            TrangChuJFrame.exit();
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        if(valueDate() == true) {
            doiMatKhau();
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JLabel lblCaiDatMatKhau;
    private javax.swing.JLabel lblMKC;
    private javax.swing.JLabel lblMKM;
    private javax.swing.JLabel lblNLMK;
    private javax.swing.JLabel lblTDN;
    private javax.swing.JLabel lblTHT;
    private javax.swing.JPasswordField txtMatKhauCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhapLaiMK;
    private javax.swing.JTextField txtTenDangNhap;
    private javax.swing.JTextField txtTenHienThi;
    // End of variables declaration//GEN-END:variables

    public boolean valueDate() {
        if (txtTenDangNhap.getText().isEmpty()) {
            MsgBox.alert(this, "Tên đăng nhập không được bỏ trống!");
            return false;
        } else if (new String(txtMatKhauCu.getPassword()).isEmpty()) {
            MsgBox.alert(this, "Mật khẩu không được bỏ trống!");
            return false;
        } else if (new String(txtMatKhauMoi.getPassword()).isEmpty()) {
            MsgBox.alert(this, "Mật khẩu mới không được bỏ trống!");
            return false;
        } else if (new String(txtNhapLaiMK.getPassword()).isEmpty()) {
            MsgBox.alert(this, "xác nhận mật khẩu không được bỏ trống!");
            return false;
        } else {
            return true;
        }
    }
    
    public void doiMatKhau() {
        String maNV = txtTenDangNhap.getText();
        String matKhau = new String(txtMatKhauCu.getPassword());
        String matKhauMoi = new String(txtMatKhauMoi.getPassword());
        String xacNhanMatKhau = new String(txtNhapLaiMK.getPassword());

        if (!maNV.equalsIgnoreCase(Auth.user.getMaNV())) {
            MsgBox.alert(this, "Sai tên đăng nhập!");
        } else if (!matKhau.equals(Auth.user.getMatKhau())) {
            MsgBox.alert(this, "Sai mật khẩu!");
        } else if (!xacNhanMatKhau.equals(matKhauMoi)) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng!");
        } else {
            Auth.user.setMatKhau(matKhauMoi);
            System.out.println(Auth.user.getMatKhau());
            nvDAO.update(Auth.user);
            MsgBox.alert(this, "Đổi mật khẩu thành công!");
        }
    }
}


