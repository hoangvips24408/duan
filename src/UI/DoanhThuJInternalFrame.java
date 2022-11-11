/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.LoaiMonDAO;
import DAO.MonAnDAO;
import DAO.ThongKeDAO;
import Entity.LoaiMonAn;
import Entity.MonAn;
import Entity.NhanVien;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quan
 */
public class DoanhThuJInternalFrame extends javax.swing.JInternalFrame {
    LoaiMonDAO loaiDao = new LoaiMonDAO();
    MonAnDAO monanDao = new MonAnDAO();
    ThongKeDAO nhanvienDao = new ThongKeDAO();
    /**
     * Creates new form DoanhThuJInternalFrame
     */
    public DoanhThuJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        FillComboBoxMaLoaiMon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFoob1 = new javax.swing.JLabel();
        lblFoob2 = new javax.swing.JLabel();
        lblChonTenMonAn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoanhThuMonAn = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTongSoHD = new javax.swing.JTextField();
        txtTongTienHoaDon = new javax.swing.JTextField();
        cboLoaiMonAn = new javax.swing.JComboBox<>();
        cboTenMon = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblChonTenNhanVien = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDoanhThuMonAn1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtTongSoHD1 = new javax.swing.JTextField();
        txtTongTienHoaDon1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblNhanVien1 = new javax.swing.JLabel();
        lblNhanVien2 = new javax.swing.JLabel();
        cboThang = new javax.swing.JComboBox<>();
        cboTenNV = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblChonTenNhanVien1 = new javax.swing.JLabel();
        cboThangXem = new javax.swing.JComboBox<>();
        txtTongSoHD2 = new javax.swing.JTextField();
        txtTongTienHoaDon2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblThang = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblQuanLyThongKe = new javax.swing.JLabel();

        tabs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DOANH THU THEO MÓN ĂN");

        lblFoob1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Food.png"))); // NOI18N

        lblFoob2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Food.png"))); // NOI18N

        lblChonTenMonAn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChonTenMonAn.setText("Chọn Tên Món Ăn:");

        tblDoanhThuMonAn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Tên Món", "Số Lượng", "Tổng Tiền", "Ngày Bán"
            }
        ));
        jScrollPane1.setViewportView(tblDoanhThuMonAn);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tổng số hóa đơn:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tổng tiền hóa đơn:");

        cboLoaiMonAn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboLoaiMonAnMouseClicked(evt);
            }
        });
        cboLoaiMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiMonAnActionPerformed(evt);
            }
        });

        cboTenMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboTenMonMouseClicked(evt);
            }
        });
        cboTenMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtTongSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTongTienHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addComponent(lblChonTenMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboTenMon, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboLoaiMonAn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblFoob2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFoob1)
                        .addGap(268, 268, 268))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblFoob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFoob2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblChonTenMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboLoaiMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(cboTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTongSoHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTongTienHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        tabs.addTab("MÓN ĂN ", jPanel2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("DOANH THU THEO NHÂN VIÊN");

        lblChonTenNhanVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChonTenNhanVien.setText("Chọn Tên Nhân Viên:");

        tblDoanhThuMonAn1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Tên Món", "Số Lượng", "Tổng Tiền", "Ngày Bán"
            }
        ));
        jScrollPane3.setViewportView(tblDoanhThuMonAn1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tổng số hóa đơn:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tổng tiền hóa đơn:");

        lblNhanVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Staff-icon.png"))); // NOI18N

        lblNhanVien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Staff-icon.png"))); // NOI18N

        cboThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboThangMouseClicked(evt);
            }
        });
        cboThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangActionPerformed(evt);
            }
        });

        cboTenNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboTenNVMouseClicked(evt);
            }
        });
        cboTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTenNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtTongSoHD1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblChonTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTongTienHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboThang, 0, 175, Short.MAX_VALUE)
                            .addComponent(cboTenNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblNhanVien1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNhanVien2))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNhanVien2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblChonTenNhanVien)
                        .addGap(29, 29, 29)
                        .addComponent(cboThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(cboTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTongSoHD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTongTienHoaDon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        tabs.addTab("NHÂN VIÊN", jPanel3);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("DOANH THU THEO THỜI GIAN");

        lblChonTenNhanVien1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblChonTenNhanVien1.setText("Chọn Thời Gian Cần Xem");

        cboThangXem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThangXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThangXemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tổng tiền hóa đơn:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tổng số hóa đơn:");

        tblThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Tổng Tiền", "Ngày Bán"
            }
        ));
        jScrollPane2.setViewportView(tblThang);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/time-icon.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/time-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChonTenNhanVien1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtTongSoHD2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTongTienHoaDon2))
                    .addComponent(cboThangXem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addComponent(jLabel11))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblChonTenNhanVien1)
                        .addGap(20, 20, 20)
                        .addComponent(cboThangXem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTongSoHD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTongTienHoaDon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(719, 719, 719))
        );

        tabs.addTab("THỜI GIAN", jPanel4);

        lblQuanLyThongKe.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblQuanLyThongKe.setForeground(new java.awt.Color(0, 153, 51));
        lblQuanLyThongKe.setText("QUẢN LÝ THỐNG KÊ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1070, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuanLyThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(296, 296, 296)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblQuanLyThongKe)
                    .addGap(18, 18, 18)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboLoaiMonAnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboLoaiMonAnMouseClicked
        // TODO add your handling code here:
        fillComboBoxKhoaHoc();
    }//GEN-LAST:event_cboLoaiMonAnMouseClicked

    private void cboLoaiMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiMonAnActionPerformed
        // TODO add your handling code here:
        fillComboBoxKhoaHoc();
    }//GEN-LAST:event_cboLoaiMonAnActionPerformed

    private void cboTenMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboTenMonMouseClicked
        // TODO add your handling code here:
        fillTableBangDiem();
        txtTongTienHoaDon.setText("" + TongTienHoaDon());
        txtTongSoHD.setText("" + TongSoHoaDon());
    }//GEN-LAST:event_cboTenMonMouseClicked

    private void cboTenMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenMonActionPerformed
        // TODO add your handling code here:
        fillTableBangDiem();
        txtTongTienHoaDon.setText("" + TongTienHoaDon());
        txtTongSoHD.setText("" + TongSoHoaDon());
    }//GEN-LAST:event_cboTenMonActionPerformed

    private void cboThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboThangMouseClicked
        // TODO add your handling code here:
        fillComboBoxTenNV();
    }//GEN-LAST:event_cboThangMouseClicked

    private void cboThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangActionPerformed
        // TODO add your handling code here:
        fillComboBoxTenNV();
    }//GEN-LAST:event_cboThangActionPerformed

    private void cboTenNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboTenNVMouseClicked
        // TODO add your handling code here:
        fillTableTheoNhanVien();
        txtTongSoHD1.setText("" + TongSoHoaDon1());
        txtTongTienHoaDon1.setText("" + TongTienHoaDon1());
    }//GEN-LAST:event_cboTenNVMouseClicked

    private void cboTenNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTenNVActionPerformed
        // TODO add your handling code here:
        fillTableTheoNhanVien();
        txtTongSoHD1.setText("" + TongSoHoaDon1());
        txtTongTienHoaDon1.setText("" + TongTienHoaDon1());
    }//GEN-LAST:event_cboTenNVActionPerformed

    private void cboThangXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThangXemActionPerformed
        // TODO add your handling code here:
        fillTableTheoThang();
        txtTongSoHD2.setText("" + TongSoHoaDon2());
        txtTongTienHoaDon2.setText("" + TongTienHoaDon2());
    }//GEN-LAST:event_cboThangXemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboLoaiMonAn;
    private javax.swing.JComboBox<String> cboTenMon;
    private javax.swing.JComboBox<String> cboTenNV;
    private javax.swing.JComboBox<String> cboThang;
    private javax.swing.JComboBox<String> cboThangXem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblChonTenMonAn;
    private javax.swing.JLabel lblChonTenNhanVien;
    private javax.swing.JLabel lblChonTenNhanVien1;
    private javax.swing.JLabel lblFoob1;
    private javax.swing.JLabel lblFoob2;
    private javax.swing.JLabel lblNhanVien1;
    private javax.swing.JLabel lblNhanVien2;
    private javax.swing.JLabel lblQuanLyThongKe;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblDoanhThuMonAn;
    private javax.swing.JTable tblDoanhThuMonAn1;
    private javax.swing.JTable tblThang;
    private javax.swing.JTextField txtTongSoHD;
    private javax.swing.JTextField txtTongSoHD1;
    private javax.swing.JTextField txtTongSoHD2;
    private javax.swing.JTextField txtTongTienHoaDon;
    private javax.swing.JTextField txtTongTienHoaDon1;
    private javax.swing.JTextField txtTongTienHoaDon2;
    // End of variables declaration//GEN-END:variables
 void FillComboBoxMaLoaiMon() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiMonAn.getModel();
        model.removeAllElements();
        List<LoaiMonAn> list = loaiDao.selectALL();
        for (LoaiMonAn LoaiMonAn : list) {
            model.addElement(LoaiMonAn);
        }
    }

    void fillComboBoxKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTenMon.getModel();
        model.removeAllElements();
        LoaiMonAn monAn = (LoaiMonAn) cboLoaiMonAn.getSelectedItem();
        if (monAn != null) {
            List<MonAn> list = monanDao.selectByTenLoai(monAn.getMaLoai());
            for (MonAn kh : list) {
                model.addElement(kh);
            }
        }
    }

    public void fillTableBangDiem() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThuMonAn.getModel();
        model.setRowCount(0);
        MonAn kh = (MonAn) cboTenMon.getSelectedItem();
        List<Object[]> list = monanDao.getTenMon(kh.getTenMon());
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    public int TongSoHoaDon() {
        int sum = tblDoanhThuMonAn.getRowCount();
        return sum;
    }

    public double TongTienHoaDon() {
        int n = tblDoanhThuMonAn.getRowCount();
        double tong = 0;
        for (int i = 0; i < n; i++) {
            double tien = Double.parseDouble(tblDoanhThuMonAn.getValueAt(i, 3).toString());
            tong = tong + tien;
        }
        return tong;
    }

    void fillComboBoxTenNV() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboTenNV.getModel();
        model.removeAllElements();
        int thang = cboThang.getSelectedIndex() + 1;
        List<NhanVien> list = nhanvienDao.selectTenNVByThang(thang);
        for (NhanVien nv : list) {
            model.addElement(nv);
        }
    }
    
    public void fillTableTheoNhanVien() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThuMonAn1.getModel();
        model.setRowCount(0);
        int thang = cboThang.getSelectedIndex() + 1;
        NhanVien nv = (NhanVien) cboTenNV.getSelectedItem();
        List<Object[]> list = nhanvienDao.getTableTheoTen(nv.getTenNV(), thang);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }
    
     public int TongSoHoaDon1() {
        int sum = tblDoanhThuMonAn1.getRowCount();
        return sum;
    }

    public double TongTienHoaDon1() {
        int n = tblDoanhThuMonAn1.getRowCount();
        double tong = 0;
        for (int i = 0; i < n; i++) {
            double tien = Double.parseDouble(tblDoanhThuMonAn1.getValueAt(i, 3).toString());
            tong = tong + tien;
        }
        return tong;
    }
    
    public void fillTableTheoThang() {
        DefaultTableModel model = (DefaultTableModel) tblThang.getModel();
        model.setRowCount(0);
        int thang = cboThangXem.getSelectedIndex() + 1;
        List<Object[]> list = nhanvienDao.getTableTheoThoiGian(thang);
        for (Object[] row : list) {
            model.addRow(row);
        }
    }
    
     public int TongSoHoaDon2() {
        int sum = tblThang.getRowCount();
        return sum;
    }

    public double TongTienHoaDon2() {
        int n = tblThang.getRowCount();
        double tong = 0;
        for (int i = 0; i < n; i++) {
            double tien = Double.parseDouble(tblThang.getValueAt(i, 1).toString());
            tong = tong + tien;
        }
        return tong;
    }
}
