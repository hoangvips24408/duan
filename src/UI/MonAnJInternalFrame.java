/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.LoaiMonDAO;
import DAO.MonAnDAO;
import Entity.LoaiMonAn;
import Entity.MonAn;
import java.io.File;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;
import utils.XImage;

/**
 *
 * @author Quan
 */
public class MonAnJInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form MonAnJInternalFrame
     */
    JFileChooser fileChooser = new JFileChooser();
    MonAnDAO maDAO = new MonAnDAO();
    LoaiMonDAO loaiDAO = new LoaiMonDAO();
    int row = -1;

    public MonAnJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        HienThiLenBang();
        FillComboBoxMaLoaiMon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMonAn = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        txtTenMon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboMaLoaiMon = new javax.swing.JComboBox<>();
        txtDVT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGiaTien = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        btnMoAnh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbeHinh = new javax.swing.JLabel();
        lblThem = new javax.swing.JLabel();
        lblXoa = new javax.swing.JLabel();
        lblSua = new javax.swing.JLabel();
        lblMoi = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 3, 3));
        jLabel1.setText("THỰC ĐƠN");

        tblMonAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã món", "Tên món ", "Loại món", "Đơn vị tính", "Giá tiền", "Số lượng", "Hình ảnh"
            }
        ));
        tblMonAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonAnMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMonAn);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã món ăn : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên món ăn : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tên loại món :");

        cboMaLoaiMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboMaLoaiMonMouseClicked(evt);
            }
        });
        cboMaLoaiMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaLoaiMonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Đơn vị tính :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Giá tiền");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Số lượng");

        btnMoAnh.setText("Mở ảnh");
        btnMoAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoAnhActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Search.png"))); // NOI18N
        jButton1.setText("Tìm Kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbeHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/change.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbeHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMoi)
                            .addComponent(lblSua)))
                    .addComponent(lblXoa)
                    .addComponent(lblThem))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbeHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoi)
                    .addComponent(lblThem))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSua)
                    .addComponent(lblXoa))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMaLoaiMon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenMon)
                            .addComponent(txtMaMon)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                        .addComponent(btnMoAnh))
                                    .addComponent(txtGiaTien)
                                    .addComponent(txtDVT)))
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(199, 199, 199))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboMaLoaiMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtGiaTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMoAnh))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(315, 315, 315))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TimKiem();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMoAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoAnhActionPerformed
        // TODO add your handling code here:
        GetHinhAnh();
    }//GEN-LAST:event_btnMoAnhActionPerformed

    private void tblMonAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonAnMouseClicked
        // TODO add your handling code here:
        row = tblMonAn.getSelectedRow();
        this.edit();
    }//GEN-LAST:event_tblMonAnMouseClicked

    private void cboMaLoaiMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaLoaiMonActionPerformed
        // txtTenLoai.setText(GetTenLoai());        // TODO add your handling code here:
    }//GEN-LAST:event_cboMaLoaiMonActionPerformed

    private void cboMaLoaiMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboMaLoaiMonMouseClicked
        // TODO add your handling code here:
        // txtTenLoai.setText(GetTenLoai());
    }//GEN-LAST:event_cboMaLoaiMonMouseClicked

    private void lblThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            ThemMoiMonAn();
        }
    }//GEN-LAST:event_lblThemMouseClicked

    private void lblThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMouseEntered
        lblThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them_hover.png")));
    }//GEN-LAST:event_lblThemMouseEntered

    private void lblThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMouseExited
        lblThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/them_defaul.png")));
    }//GEN-LAST:event_lblThemMouseExited

    private void lblMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoiMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            LamMoiForm();
        }
    }//GEN-LAST:event_lblMoiMouseClicked

    private void lblMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoiMouseEntered
        lblMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moi_hover.png")));
    }//GEN-LAST:event_lblMoiMouseEntered

    private void lblMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoiMouseExited
        lblMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moi_defaul.png")));
    }//GEN-LAST:event_lblMoiMouseExited

    private void lblSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            CapNhat();
        }
    }//GEN-LAST:event_lblSuaMouseClicked

    private void lblSuaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaMouseEntered
        lblSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sua_hover.png")));
    }//GEN-LAST:event_lblSuaMouseEntered

    private void lblSuaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaMouseExited
        lblSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sua_defaul.png")));
    }//GEN-LAST:event_lblSuaMouseExited

    private void lblXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            XoaMonAn();
        }
    }//GEN-LAST:event_lblXoaMouseClicked

    private void lblXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseEntered
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa_hover.png")));
    }//GEN-LAST:event_lblXoaMouseEntered

    private void lblXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseExited
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa_defaul.png")));
    }//GEN-LAST:event_lblXoaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoAnh;
    private javax.swing.JComboBox<String> cboMaLoaiMon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbeHinh;
    private javax.swing.JLabel lblMoi;
    private javax.swing.JLabel lblSua;
    private javax.swing.JLabel lblThem;
    private javax.swing.JLabel lblXoa;
    private javax.swing.JTable tblMonAn;
    private javax.swing.JTextField txtDVT;
    private javax.swing.JTextField txtGiaTien;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMon;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    public void LamMoiForm() {
        txtMaMon.setText("");
        txtTenMon.setText("");
        txtDVT.setText("");
        txtGiaTien.setText("");
        txtSoLuong.setText("");
        txtTimKiem.setText("");
        cboMaLoaiMon.setSelectedIndex(0);
    }

    public void ThemMoiMonAn() {
        MonAn monAn = GetForm();
        try {
            maDAO.insert(monAn);
            this.HienThiLenBang();
            this.LamMoiForm();
            MsgBox.alert(this, "Thêm mới thành công !");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại !");
            throw new RuntimeException(e);
        }
    }

    void HienThiLenBang() {
        DefaultTableModel model = (DefaultTableModel) tblMonAn.getModel();
        model.setRowCount(0);
        try {
            String key = txtTimKiem.getText();
            List<MonAn> list = maDAO.selectByKeyword(key);
            for (MonAn monAn : list) {
                Object[] row = {monAn.getMaMA(), monAn.getTenMon(), monAn.getLoaiMon(),
                    monAn.getDonViTinh(), monAn.getGiaTien(), monAn.getSoLuong(), monAn.getHinh()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    public MonAn GetForm() {
        MonAn monAn = new MonAn();
        monAn.setMaMA(txtMaMon.getText());
        monAn.setTenMon(txtTenMon.getText());
        monAn.setLoaiMon(cboMaLoaiMon.getSelectedIndex() + 1);
        monAn.setDonViTinh(txtDVT.getText());
        monAn.setGiaTien(Double.parseDouble(txtGiaTien.getText()));
        monAn.setSoLuong(Integer.parseInt(txtSoLuong.getText()));
        monAn.setHinh(lbeHinh.getToolTipText());
        return monAn;
    }

    public String GetTenLoai() {
        if (cboMaLoaiMon.getSelectedIndex() == 0) {
            return "Nước giải khát";
        }
        if (cboMaLoaiMon.getSelectedIndex() == 1) {
            return "Món chính";
        }
        if (cboMaLoaiMon.getSelectedIndex() == 2) {
            return "Món ngọt";
        } else {//(cboMaLoaiMon.getSelectedItem().equals("4")) {
            return "Món nhẹ";
        }
    }

    void GetHinhAnh() {
        int width = lbeHinh.getWidth();
        int height = lbeHinh.getHeight();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION);
        File file = fileChooser.getSelectedFile();
        XImage.save(file);
        ImageIcon icon = new ImageIcon(XImage.read(file.getName()).getImage().getScaledInstance(width, height, 0));
        lbeHinh.setIcon(icon);
        lbeHinh.setToolTipText(file.getName());
    }

    public void CapNhat() {
       MonAn monAn = GetForm();
        try {
            maDAO.update(monAn);
            this.HienThiLenBang();
            MsgBox.alert(this, "Cập nhật thành công !");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại !");
            throw new RuntimeException(e);
        }
    }

    public void XoaMonAn() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa món ăn");
        } else {
            String message = "Bạn có chắc muốn xóa ? ";
            String title = "Xóa món ăn ";
            int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                try {
                    String maMA = txtMaMon.getText();
                    maDAO.delete(maMA);
                    MsgBox.alert(this, "Xóa thành công !");
                    LamMoiForm();
                    HienThiLenBang();
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại !");
                    throw new RuntimeException(e);
                }
            }
        }

    }

    void FillComboBoxMaLoaiMon() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaLoaiMon.getModel();
        model.removeAllElements();
        List<LoaiMonAn> list = loaiDAO.selectALL();
        for (LoaiMonAn loaiMonAn : list) {
            model.addElement(loaiMonAn);
        }
    }

    void setForm(MonAn monAn) {
        txtMaMon.setText(monAn.getMaMA());
        txtTenMon.setText(monAn.getTenMon());
        cboMaLoaiMon.setSelectedIndex(monAn.getLoaiMon() - 1);
//        txtTenLoai.setText(GetTenLoai());
        txtDVT.setText(monAn.getDonViTinh());
        txtGiaTien.setText(String.valueOf(monAn.getGiaTien()));
        txtSoLuong.setText(String.valueOf(monAn.getSoLuong()));
        int with = lbeHinh.getWidth();
        int height = lbeHinh.getHeight();
        if (monAn.getHinh() != null) {
            ImageIcon icon = new ImageIcon(XImage.read(monAn.getHinh()).getImage().getScaledInstance(with, height, 0));
            lbeHinh.setIcon(icon);
            lbeHinh.setToolTipText(monAn.getHinh());
        }

    }

    void edit() {
        String maMA = (String) tblMonAn.getValueAt(this.row, 0);
        MonAn monAn = maDAO.selectByID(maMA);
        this.setForm(monAn);
    }

    void TimKiem() {
        this.HienThiLenBang();
        this.LamMoiForm();
        this.row = -1;
    }

}
