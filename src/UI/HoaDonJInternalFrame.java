/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.ChitietDAO;
import DAO.HoaDonDAO;
import DAO.KhachHangDAO;
import DAO.KhuyenMaiDAO;
import DAO.LoaiMonDAO;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;
import Entity.KhachHang;
import Entity.KhuyenMai;
import Entity.LoaiMonAn;
import Entity.MonAn;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import utils.Auth;
import utils.MsgBox;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Quan
 */
public class HoaDonJInternalFrame extends javax.swing.JInternalFrame {

    String dburl = "jdbc:sqlserver://localhost:1433;databaseName=FastFood";
    static String user = "sa";
    static String pass = "2306";
    LoaiMonDAO daoloai = new LoaiMonDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    HoaDon hoadon = new HoaDon();
    HoaDonDAO dao = new HoaDonDAO();
    ChiTietHoaDon ct = new ChiTietHoaDon();
    ChitietDAO ctdao = new ChitietDAO();
    KhachHangDAO daokh = new KhachHangDAO();
    KhuyenMaiDAO KMDAO = new KhuyenMaiDAO();

    public HoaDonJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        fillcombobox();
        txtGiamGia.setEnabled(false);
        giaKhuyenMai();
        HienThiLenBang();
    }
    int maHD;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTiet = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTatCa = new javax.swing.JTable();
        cboMaLoai = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        txtTongTien = new javax.swing.JTextField();
        txtGiamGia = new javax.swing.JTextField();
        txtThanhToan = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        cboGiamGia = new javax.swing.JComboBox<>();
        lblInHoaDon = new javax.swing.JLabel();
        lblThanhToan = new javax.swing.JLabel();
        lblXoa = new javax.swing.JLabel();

        tblChiTiet.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 51)));
        tblChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã món", "Tên món", "Giá tiền", "Số lượng", "Thành tiền"
            }
        ));
        tblChiTiet.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tblChiTietAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tblChiTiet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblChiTietKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTiet);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        tblTatCa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã món", "Tên món", "Đơn vị tính", "Giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTatCa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblTatCaMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tblTatCa);

        cboMaLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMaLoaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboMaLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(cboMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Thực đơn món            ", jPanel2);

        btnTimKiem.setText("Tìm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "SĐT", "Email"
            }
        ));
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblKhachHangMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnTimKiem)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Khách hàng", jPanel1);

        txtGiamGia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel15.setText("Thành Tiền:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel16.setText("Giảm giá :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel17.setText("Tổng tiền : ");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 17)); // NOI18N
        jLabel18.setText("Mã KH:");

        cboGiamGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGiamGiaActionPerformed(evt);
            }
        });

        lblInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inhoadon_defaul.png"))); // NOI18N
        lblInHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInHoaDonMouseExited(evt);
            }
        });

        lblThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thanhtoan_defaul.png"))); // NOI18N
        lblThanhToan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblThanhToanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblThanhToanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblThanhToanMouseExited(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtThanhToan))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cboGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel17))
                                            .addGap(42, 42, 42)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtTongTien)
                                                .addComponent(txtGiamGia)
                                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblInHoaDon)
                                .addGap(28, 28, 28)
                                .addComponent(lblThanhToan)
                                .addGap(42, 42, 42)
                                .addComponent(lblXoa)))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(4, 4, 4)
                        .addComponent(cboGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInHoaDon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblThanhToan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblXoa, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboMaLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMaLoaiActionPerformed
        // TODO add your handling code here:
        filltable();
    }//GEN-LAST:event_cboMaLoaiActionPerformed

    private void tblTatCaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTatCaMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            filltablehoadon();
            txtTongTien.setText("" + TongTienHoaDon());
            txtThanhToan.setText("" + thanhtien());
        }
    }//GEN-LAST:event_tblTatCaMousePressed

    private void tblChiTietAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tblChiTietAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_tblChiTietAncestorAdded

    private void tblChiTietKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblChiTietKeyReleased
        // TODO add your handling code here:
        sua();
    }//GEN-LAST:event_tblChiTietKeyReleased

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        HienThiLenBang();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblKhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            getMaKhachHang();
        }
    }//GEN-LAST:event_tblKhachHangMousePressed

    private void cboGiamGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGiamGiaActionPerformed
        // TODO add your handling code here:
        setgiamgia();
    }//GEN-LAST:event_cboGiamGiaActionPerformed

    private void lblInHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInHoaDonMouseClicked
        if (evt.getClickCount() == 1 || evt.getClickCount() == 2) {
            try {
                Hashtable map = new Hashtable();
                JasperReport rpt = JasperCompileManager.compileReport("src\\UI\\HoaDon.jrxml");
                map.put("mahd", maHD);
                Connection conn = DriverManager.getConnection(dburl, user, pass);
                JasperPrint p = JasperFillManager.fillReport(rpt, map, conn);
                JasperViewer.viewReport(p, false);
            } catch (JRException ex) {
                Logger.getLogger(HoaDonJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(HoaDonJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblInHoaDonMouseClicked

    private void lblInHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInHoaDonMouseEntered
        lblInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inhoadon_hover.png")));
    }//GEN-LAST:event_lblInHoaDonMouseEntered

    private void lblInHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInHoaDonMouseExited
        lblInHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inhoadon_defaul.png")));
    }//GEN-LAST:event_lblInHoaDonMouseExited

    private void lblThanhToanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThanhToanMouseClicked
        if (evt.getClickCount() == 1 || evt.getClickCount() == 2) {
            ThemHoaDon();
            GetFormChiTiet();
            TruSoLuong();
            clearhd();
        }
    }//GEN-LAST:event_lblThanhToanMouseClicked

    private void lblThanhToanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThanhToanMouseEntered
        lblThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thanhtoan_hover.png")));
    }//GEN-LAST:event_lblThanhToanMouseEntered

    private void lblThanhToanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThanhToanMouseExited
        lblThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/thanhtoan_defaul.png")));
    }//GEN-LAST:event_lblThanhToanMouseExited

    private void lblXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseClicked
        if(evt.getClickCount() == 1 || evt.getClickCount() == 2) {
            xoamon();
        }
    }//GEN-LAST:event_lblXoaMouseClicked

    private void lblXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseEntered
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa_hover.png")));
    }//GEN-LAST:event_lblXoaMouseEntered

    private void lblXoaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXoaMouseExited
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xoa_defaul.png")));
    }//GEN-LAST:event_lblXoaMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cboGiamGia;
    private javax.swing.JComboBox<String> cboMaLoai;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblInHoaDon;
    private javax.swing.JLabel lblThanhToan;
    private javax.swing.JLabel lblXoa;
    private javax.swing.JTable tblChiTiet;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTable tblTatCa;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtThanhToan;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
void fillcombobox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboMaLoai.getModel();
        model.removeAllElements();
        List<LoaiMonAn> list = daoloai.selectALL();
        for (LoaiMonAn loaiMonAn : list) {
            model.addElement(loaiMonAn);
        }
        filltable();
    }

    void filltable() {
        DefaultTableModel model = (DefaultTableModel) tblTatCa.getModel();
        model.setRowCount(0);
        LoaiMonAn loai = (LoaiMonAn) cboMaLoai.getSelectedItem();
        List<Object[]> mon = daoloai.getMon(loai.getTenLoai());
        for (Object[] objects : mon) {
            model.addRow(objects);
        }
    }

    void filltablehoadon() {
        int dem = 0;
        int row = tblTatCa.getSelectedRow();
        int n = tblChiTiet.getRowCount();
        String ma1 = (String) tblTatCa.getValueAt(row, 0);
        DefaultTableModel model = (DefaultTableModel) tblChiTiet.getModel();
        Object[] chonmon = new Object[]{tblTatCa.getValueAt(row, 0), tblTatCa.getValueAt(row, 1), tblTatCa.getValueAt(row, 3), 1, tblTatCa.getValueAt(row, 3)};
        if (tblChiTiet.getRowCount() == 0) {
            model.addRow(chonmon);
        } else {
            for (int i = 0; i < n; i++) {
                if (ma1.equals(tblChiTiet.getValueAt(i, 0))) {
                    int soluong = Integer.parseInt(tblChiTiet.getValueAt(i, 3).toString());
                    float giatien = Float.parseFloat(tblChiTiet.getValueAt(i, 2).toString());
                    model.setValueAt(soluong + 1, i, 3);
                    model.setValueAt(((soluong+1)*giatien), i, 4);
                    dem = 1;
                    break;
                }
            }
            if (dem == 0) {
                model.addRow(chonmon);
            }
        }

    }

    void xoamon() {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet.getModel();
        int row = tblChiTiet.getSelectedRow();
        model.removeRow(row);
        txtTongTien.setText("" + TongTienHoaDon());
        txtThanhToan.setText("" + thanhtien());

    }

    void sua() {
        DefaultTableModel model = (DefaultTableModel) tblChiTiet.getModel();
        int row = tblChiTiet.getSelectedRow();
        float soluong = Float.parseFloat(tblChiTiet.getValueAt(row, 3).toString());
        float tien = Float.parseFloat(tblChiTiet.getValueAt(row, 2).toString());
        float tongtien = soluong * tien;
        model.setValueAt(tongtien, row, 4);
        txtTongTien.setText("" + TongTienHoaDon());
        txtThanhToan.setText("" + thanhtien());
    }

    public void giaKhuyenMai() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboGiamGia.getModel();
        model.removeAllElements();
        List<KhuyenMai> list = KMDAO.selectAll();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        String ngayMay = format.format(new Date());
        String[] ngayHienTai = ngayMay.split("-");
        String giakhuyenMai = "";
        int b = 1;
        for (KhuyenMai km : list) {
            String KT = km.getNgayKT();
            String[] viTriKT = KT.split("-");
            String BD = km.getNgayBD();
            String[] viTriBD = BD.split("-");

            LocalDate now = LocalDate.of(Integer.valueOf(ngayHienTai[0]), Integer.valueOf(ngayHienTai[1]), Integer.valueOf(ngayHienTai[2]));
            LocalDate startDate = LocalDate.of(Integer.valueOf(viTriBD[0]), Integer.valueOf(viTriBD[1]), Integer.valueOf(viTriBD[2]));
            LocalDate endDate = LocalDate.of(Integer.valueOf(viTriKT[0]), Integer.valueOf(viTriKT[1]), Integer.valueOf(viTriKT[2]));

            if (now.getMonth().equals(startDate.getMonth())) {
                if (now.getDayOfMonth() >= startDate.getDayOfMonth() && now.getDayOfMonth() <= endDate.getDayOfMonth()) {
                    model.addElement(km);
                    b = 2;
                }

            }
        }
        if (b == 1) {
            txtGiamGia.setText("0");
        }
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatted = current.format(formatter);
        String[] ngaymay = formatted.split("-");
        List<KhachHang> list1 = daokh.selectAll();
        for (KhachHang khachHang : list1) {
            String sinhnhat = khachHang.getNgaySinh();
            String[] ngaysinhnhat = sinhnhat.split("-");
            if (ngaymay[1].equals(ngaysinhnhat[1])) {
                double ngaythuc = Double.parseDouble(ngaymay[2]);
                double ngaysinh = Double.parseDouble(ngaysinhnhat[2]);
                if ((ngaysinh - ngaythuc) == 1) {
                    model.addElement(khachHang);
                }

            }
        }
    }

    void setgiamgia() {
        try {
            KhuyenMai km = KMDAO.selectByID(cboGiamGia.getSelectedItem().toString());
            txtGiamGia.setText(km.getGiaKhuyenMai());
        } catch (Exception e) {
            txtGiamGia.setText("30");
        }

    }

    void HienThiLenBang() {
        DefaultTableModel model = (DefaultTableModel) tblKhachHang.getModel();
        model.setRowCount(0);
        try {
            String key = txtTimKiem.getText();
            List<KhachHang> list = khdao.selectByKeyword(key);
            for (KhachHang monAn : list) {
                Object[] row = {monAn.getMaKH(), monAn.getHoTen(), monAn.getSDT(),
                    monAn.getEmail()};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    void getMaKhachHang() {
        int row = tblKhachHang.getSelectedRow();
        String maKh = tblKhachHang.getValueAt(row, 0).toString();
        txtMaKH.setText(maKh);
    }

    public double TongTienHoaDon() {
        int n = tblChiTiet.getRowCount();
        double tong = 0;
        for (int i = 0; i < n; i++) {
            double tien = Double.parseDouble(tblChiTiet.getValueAt(i, 4).toString());
            tong = tong + tien;
        }
        return tong;
    }

    public double thanhtien() {
        double tongtien = Double.parseDouble(txtTongTien.getText());
        int giamgia = Integer.parseInt(txtGiamGia.getText());
        double thanhtien = tongtien - (giamgia * tongtien / 100);
        return thanhtien;
    }

    public HoaDon GetFormHoaDon() {
        HoaDon hoadon = new HoaDon();
        hoadon.setNgayXuat(String.valueOf(java.time.LocalDate.now()));
        hoadon.setTongTien(Float.parseFloat(txtTongTien.getText()));
        hoadon.setMaNV(Auth.user.getMaNV());
        hoadon.setMaKH(txtMaKH.getText());
        hoadon.setGiamGia(Integer.valueOf(txtGiamGia.getText()));
        hoadon.setThanhToan(Float.parseFloat(txtThanhToan.getText()));
        return hoadon;
    }

    public void ThemHoaDon() {
        HoaDon hoadon = GetFormHoaDon();
        try {
            dao.insert(hoadon);
            MsgBox.alert(this, "Thanh toán thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thất bại !");
            throw new RuntimeException(e);
        }
    }

    public void GetFormChiTiet() {
        List<HoaDon> list = dao.selectBySql1();
        for (HoaDon hoaDon : list) {
            maHD = hoaDon.getMaHD();
        }
        ChiTietHoaDon ct = new ChiTietHoaDon();
        int n = tblChiTiet.getRowCount();
        for (int i = 0; i < n; i++) {
            ct.setMaHD(maHD);
            ct.setMaMA(tblChiTiet.getValueAt(i, 0).toString());
            ct.setSoLuong(Integer.parseInt(tblChiTiet.getValueAt(i, 3).toString()));
            ct.setThanhTien(Float.parseFloat(tblChiTiet.getValueAt(i, 4).toString()));
            ctdao.insert(ct);
        }
    }

    public void TruSoLuong() {
        MonAn ma = new MonAn();
        int n = tblChiTiet.getRowCount();
        for (int i = 0; i < n; i++) {
            String maMA = tblChiTiet.getValueAt(i, 0).toString();
            int soluong = Integer.parseInt(tblChiTiet.getValueAt(i, 3).toString());
//            ma.setMaMA(tblChiTiet.getValueAt(i, 0).toString());
//            ma.setSoLuong(Integer.parseInt(tblChiTiet.getValueAt(i, 3).toString()));
            dao.tinhSoLuong(soluong, maMA);
        }
    }
    void clearhd(){
        DefaultTableModel model = (DefaultTableModel) tblChiTiet.getModel();
        model.setRowCount(0);
        txtMaKH.setText("");
        txtThanhToan.setText("");
        txtTongTien.setText("");
    }
}
