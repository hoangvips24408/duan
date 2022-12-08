/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.KhachHangDAO;
import Entity.KhachHang;
import java.util.Date;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;

/**
 *
 * @author Quan
 */
public class QuanLyKhachHangJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form QuanLyKhachHangJInternalFrame
     */
    public QuanLyKhachHangJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        filltable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTDN6 = new javax.swing.JLabel();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        lblTDN5 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblTDN4 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lblTDN3 = new javax.swing.JLabel();
        lblTDN2 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        lblTDN1 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        lblTDN7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTDN8 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        lblThem = new javax.swing.JLabel();
        lblXoa = new javax.swing.JLabel();
        lblSua = new javax.swing.JLabel();
        lblMoi = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1028, 585));

        lblTDN6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN6.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN6.setText("THÔNG TIN:");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        lblTDN5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN5.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN5.setText("Giới Tính");

        lblTDN4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN4.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN4.setText("Địa Chỉ");

        lblTDN3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN3.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN3.setText("Số Điện Thoại");

        lblTDN2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN2.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN2.setText("Ngày Sinh");

        lblTDN1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN1.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN1.setText("Họ Tên");

        lblTDN7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN7.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN7.setText("Email");

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma KH", "Ho ten", "Email", "Ngay sinh", "SDT", "Dia chi", "Gioi tinh"
            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblKhachHangMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("QUẢN LÝ KHÁCH HÀNG");

        lblTDN8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN8.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN8.setText("Mã KH");

        txtMaKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKHActionPerformed(evt);
            }
        });

        lblThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them_defaul.png"))); // NOI18N
        lblThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThemMouseExited(evt);
            }
        });

        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa_defaul.png"))); // NOI18N
        lblXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXoaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblXoaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblXoaMouseExited(evt);
            }
        });

        lblSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sua_defaul.png"))); // NOI18N
        lblSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSuaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSuaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSuaMouseExited(evt);
            }
        });

        lblMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moi_defaul.png"))); // NOI18N
        lblMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMoiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMoiMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTDN6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTDN4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTDN2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTDN3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTDN5)
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(152, 152, 152)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblMoi)
                                                .addComponent(lblSua)))
                                        .addComponent(lblXoa)
                                        .addComponent(lblThem)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(rdoNam)
                                            .addGap(18, 18, 18)
                                            .addComponent(rdoNu)))
                                    .addGap(38, 38, 38)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTDN8)
                                    .addComponent(lblTDN1))
                                .addGap(357, 357, 357))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTDN7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTDN6)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN8)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN1)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN2)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN3)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTDN4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblTDN5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdoNu))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMoi)
                            .addComponent(lblThem))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSua)
                            .addComponent(lblXoa)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKHActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        // TODO add your handling code here:     

    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void tblKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.row = tblKhachHang.rowAtPoint(evt.getPoint());
            this.edit();
            txtMaKH.setEnabled(false);
        }
    }//GEN-LAST:event_tblKhachHangMousePressed

    private void lblThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            insert();
        }
    }//GEN-LAST:event_lblThemMouseClicked

    private void lblThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMouseEntered
        lblThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them_hover.png")));
    }//GEN-LAST:event_lblThemMouseEntered

    private void lblThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMouseExited
        lblThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them_defaul.png")));
    }//GEN-LAST:event_lblThemMouseExited

    private void lblXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            delete();
        }
    }//GEN-LAST:event_lblXoaMouseClicked

    private void lblXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseEntered
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa_hover.png")));
    }//GEN-LAST:event_lblXoaMouseEntered

    private void lblXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseExited
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa_defaul.png")));
    }//GEN-LAST:event_lblXoaMouseExited

    private void lblSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            update();
        }
    }//GEN-LAST:event_lblSuaMouseClicked

    private void lblSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaMouseEntered
        lblSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sua_hover.png")));
    }//GEN-LAST:event_lblSuaMouseEntered

    private void lblSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaMouseExited
        lblSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sua_defaul.png")));
    }//GEN-LAST:event_lblSuaMouseExited

    private void lblMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoiMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            clearForm();
        }
    }//GEN-LAST:event_lblMoiMouseClicked

    private void lblMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoiMouseEntered
        lblMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moi_hover.png")));
    }//GEN-LAST:event_lblMoiMouseEntered

    private void lblMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoiMouseExited
        lblMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moi_defaul.png")));
    }//GEN-LAST:event_lblMoiMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMoi;
    private javax.swing.JLabel lblSua;
    private javax.swing.JLabel lblTDN1;
    private javax.swing.JLabel lblTDN2;
    private javax.swing.JLabel lblTDN3;
    private javax.swing.JLabel lblTDN4;
    private javax.swing.JLabel lblTDN5;
    private javax.swing.JLabel lblTDN6;
    private javax.swing.JLabel lblTDN7;
    private javax.swing.JLabel lblTDN8;
    private javax.swing.JLabel lblThem;
    private javax.swing.JLabel lblXoa;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

    KhachHangDAO dao = new KhachHangDAO();
    int row = 0;

    void filltable() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);

        List<KhachHang> khach = dao.selectAll();
        for (KhachHang kh : khach) {
            String[] ngay = kh.getNgaySinh().split("-");
            Object[] row = {kh.getMaKH(), kh.getHoTen(), kh.getEmail(), ngay[2] + "-" + ngay[1] + "-" + ngay[0], kh.getSDT(), kh.getDiaChi(), kh.isGioiTinh() ? "Nam" : "Nữ"};
            model.addRow(row);
        }
    }

    void insert() {
        KhachHang kh = getForm();
        if (checkForm()) {
            try {
                dao.insert(kh);
                this.filltable();
                this.clearForm();
                MsgBox.alert(this, "Thêm thành công!");
            } catch (Exception e) {
                if (kh.getMaKH().equalsIgnoreCase(txtMaKH.getText())) {
                    MsgBox.alert(this, "Mã nhân viên đã tồn tại");
                } else {
                    MsgBox.alert(this, "Thêm thất bại!");
                }
            }
        } else {
            MsgBox.alert(this, "Vui lòng điển đầy đủ thông tin!");
        }
    }

    void update() {
        KhachHang model = getForm();
        if (checkForm()) {
            try {
                dao.update(model);
                this.filltable();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xoá khách hàng");
        } else {
            if (checkForm()) {
                String MaKH = txtMaKH.getText();
                try {
                    dao.delete(MaKH);
                    this.filltable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    void clearForm() {
        KhachHang nh = new KhachHang();
        this.setForm(nh);
        buttonGroup1.clearSelection();
        txtMaKH.setEnabled(true);
    }

    void edit() {
        try {
            String MaKH = (String) tblKhachHang.getValueAt(this.row, 0);
            KhachHang kh = dao.selectById(MaKH);
            if (kh != null) {
                setForm(kh);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void setForm(KhachHang kh) {
        txtMaKH.setText(kh.getMaKH());
        txtHoTen.setText(kh.getHoTen());
        txtEmail.setText(kh.getEmail());
        try {
            String[] ngay = kh.getNgaySinh().split("-");
            txtNgaySinh.setText(ngay[2] + "-" + ngay[1] + "-" + ngay[0]);
        } catch (Exception e) {
            txtNgaySinh.setText("");
        }
        txtSDT.setText(kh.getSDT());
        txtDiaChi.setText(kh.getDiaChi());
        rdoNam.setSelected(kh.isGioiTinh());
        rdoNu.setSelected(!kh.isGioiTinh());
    }

    KhachHang getForm() {
        KhachHang kh = new KhachHang();

        kh.setMaKH(txtMaKH.getText());
        kh.setHoTen(txtHoTen.getText());

        kh.setEmail(txtEmail.getText());
        String[] ngay = txtNgaySinh.getText().split("-");
        kh.setNgaySinh(ngay[2]+"-"+ngay[1]+"-"+ngay[0]);

        kh.setSDT(txtSDT.getText());
        kh.setDiaChi(txtDiaChi.getText());

        if (rdoNam.isSelected() == true) {
            kh.setGioiTinh(true);
        } else {
            kh.setGioiTinh(false);
        }
        return kh;
    }

    boolean checkForm() {
        if (txtMaKH.getText().isBlank() || txtHoTen.getText().isBlank() || txtEmail.getText().isBlank()
                || txtNgaySinh.getText().isBlank() || txtSDT.getText().isBlank() || txtDiaChi.getText().isBlank() || (!rdoNam.isSelected() && !rdoNu.isSelected())) {
            MsgBox.alert(this, "Vui lòng nhập đủ thông tin");
            return false;
        }
        return true;
    }
}
