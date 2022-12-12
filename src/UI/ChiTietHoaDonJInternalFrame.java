/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.ChitietDAO;
import DAO.ThongKeDAO;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quan
 */
public class ChiTietHoaDonJInternalFrame extends javax.swing.JInternalFrame {

    ThongKeDAO daotk = new ThongKeDAO();
    ChitietDAO daoct = new ChitietDAO();

    /**
     * Creates new form ChiTietHoaDonJInternalFrame
     */
    public ChiTietHoaDonJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        fillcombobotennv();
        filltablehoadon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietHD = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLichSuHoaDon = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cboNhanVien = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        btnxemhd = new javax.swing.JButton();
        btnxemhd1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1028, 585));

        tblChiTietHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên hàng ", "Giá bán", "Số lượng", "Thành tiền"
            }
        ));
        jScrollPane1.setViewportView(tblChiTietHD);

        tblLichSuHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Nhân viên", "Ngày xuất  HD", "Tên khách hàng", "Tổng tiền"
            }
        ));
        tblLichSuHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLichSuHoaDonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblLichSuHoaDon);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel2.setText("Chi tiết hóa đơn");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel1.setText("Lịch sử hóa đơn");

        cboNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNhanVienActionPerformed(evt);
            }
        });

        jLabel10.setText("Thời gian");

        jLabel11.setText("Nhân viên");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        btnxemhd.setText("Xem hóa đơn");
        btnxemhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxemhdActionPerformed(evt);
            }
        });

        btnxemhd1.setText("Xem tất cả");
        btnxemhd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxemhd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel10)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboNhanVien, 0, 197, Short.MAX_VALUE)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(btnxemhd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(btnxemhd1)
                                        .addGap(8, 8, 8))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(236, 236, 236)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnxemhd)
                            .addComponent(btnxemhd1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNhanVienActionPerformed
        // TODO add your handling code here:
        filltableHoaDonNV();
        DefaultTableModel model = (DefaultTableModel) tblChiTietHD.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_cboNhanVienActionPerformed

    private void tblLichSuHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLichSuHoaDonMouseClicked
        // TODO add your handling code here:
        filltablechitiet();
    }//GEN-LAST:event_tblLichSuHoaDonMouseClicked

    private void btnxemhdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxemhdActionPerformed
        // TODO add your handling code here:
        filltheongay();
    }//GEN-LAST:event_btnxemhdActionPerformed

    private void btnxemhd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxemhd1ActionPerformed
        // TODO add your handling code here:
        fillcombobotennv();
        filltablehoadon();
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_btnxemhd1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnxemhd;
    private javax.swing.JButton btnxemhd1;
    private javax.swing.JComboBox<String> cboNhanVien;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblChiTietHD;
    private javax.swing.JTable tblLichSuHoaDon;
    // End of variables declaration//GEN-END:variables
    void fillcombobotennv() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNhanVien.getModel();
        model.removeAllElements();
        List<Object[]> list1 = daotk.selectTenNVByThang();
        for (Object[] objects : list1) {
            model.addElement(objects[0].toString());
        }

        filltablehoadon();
    }

    void filltablehoadon() {
        DefaultTableModel model = (DefaultTableModel) tblLichSuHoaDon.getModel();
        model.setRowCount(0);
        List<Object[]> list = daoct.selectallhoadon();
        for (Object[] objects : list) {
            model.addRow(objects);
        }
    }

    void filltableHoaDonNV() {

        DefaultTableModel model = (DefaultTableModel) tblLichSuHoaDon.getModel();
        model.setRowCount(0);
        String nv = String.valueOf(cboNhanVien.getSelectedItem());
        if (jDateChooser1.getDate() == null) {
            List<Object[]> list = daoct.selectallhoadontheotennv(nv);
            for (Object[] objects : list) {
                model.addRow(objects);
            }
        } else {
            SimpleDateFormat dataformat = new SimpleDateFormat("dd-MM-yyyy");
            String ngay1 = dataformat.format(jDateChooser1.getDate());
            String[] ngaychon = ngay1.split("-");
            int ngay2 = Integer.parseInt(ngaychon[0]);
            String a = String.valueOf(ngay2);
            if (a.length() == 1) {
                String ngaydachon = a + "-" + ngaychon[1] + "-" + ngaychon[2];
                List<Object[]> list1 = daoct.selecttablehd(nv, ngaydachon);
                for (Object[] objects : list1) {
                    model.addRow(objects);
                }
            } else {
                List<Object[]> list1 = daoct.selecttablehd(nv, ngay1);
                for (Object[] objects : list1) {
                    model.addRow(objects);
                }
            }

        }

    }

    void filltablechitiet() {
        int row = tblLichSuHoaDon.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblChiTietHD.getModel();
        model.setRowCount(0);
        int mand = (int) tblLichSuHoaDon.getValueAt(row, 0);
        List<Object[]> list = daoct.selectablechitiet(mand);
        for (Object[] objects : list) {
            model.addRow(objects);
        }
    }

    void filltheongay() {
        SimpleDateFormat dataformat = new SimpleDateFormat("dd-MM-yyyy");
        String ngay = dataformat.format(jDateChooser1.getDate());
        String[] ngaychon = ngay.split("-");
        int ngay2 = Integer.parseInt(ngaychon[0]);
        String a = String.valueOf(ngay2);
        if (a.length() == 1) {
            String ngaydachon = a + "-" + ngaychon[1] + "-" + ngaychon[2];
            DefaultComboBoxModel model1 = (DefaultComboBoxModel) cboNhanVien.getModel();
            model1.removeAllElements();
            List<Object[]> list1 = daoct.selecnvtheongay(ngaydachon);
            for (Object[] ojects : list1) {
                model1.addElement(ojects[0].toString());
            }
            DefaultTableModel model = (DefaultTableModel) tblLichSuHoaDon.getModel();
            model.setRowCount(0);
            List<Object[]> list = daoct.selectallhoadontheothang(ngaydachon);
            for (Object[] objects : list) {
                model.addRow(objects);
            }
        } else {
            DefaultComboBoxModel model1 = (DefaultComboBoxModel) cboNhanVien.getModel();
            model1.removeAllElements();
            List<Object[]> list1 = daoct.selecnvtheongay(ngay);
            for (Object[] ojects : list1) {
                model1.addElement(ojects[0].toString());
            }
            DefaultTableModel model = (DefaultTableModel) tblLichSuHoaDon.getModel();
            model.setRowCount(0);
            List<Object[]> list = daoct.selectallhoadontheothang(ngay);
            for (Object[] objects : list) {
                model.addRow(objects);
            }

        }

    }
}
