/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.ChitietDAO;
import DAO.ThongKeDAO;
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
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
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
        cboThoiGian = new javax.swing.JComboBox<>();
        cboNhanVien = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Nhân viên", "Ngày xuất  HD", "Tổng tiền"
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

        cboThoiGian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboThoiGian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboThoiGianActionPerformed(evt);
            }
        });

        cboNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNhanVienActionPerformed(evt);
            }
        });

        jLabel10.setText("Thời gian");

        jLabel11.setText("Nhân viên");

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
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                        .addComponent(cboNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(236, 236, 236)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

    private void cboThoiGianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboThoiGianActionPerformed
        // TODO add your handling code here:
        fillcombobotennv();
        DefaultTableModel model = (DefaultTableModel) tblChiTietHD.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_cboThoiGianActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNhanVien;
    private javax.swing.JComboBox<String> cboThoiGian;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblChiTietHD;
    private javax.swing.JTable tblLichSuHoaDon;
    // End of variables declaration//GEN-END:variables
    void fillcombobotennv(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNhanVien.getModel();
        model.removeAllElements();
        String thang = String.valueOf(cboThoiGian.getSelectedItem());
        if (thang.equals("ALL")) {
            List<Object[]> list1 = daotk.selectTenNVByThang();
            for (Object[] objects : list1) {
                model.addElement(objects[0].toString());
            }
        }else{
            
            List<Object[]> list = daoct.selectTenNV(Integer.parseInt(thang));
            for (Object[] objects : list) {
                model.addElement(objects[0].toString());
            }
        }
        filltablehoadon();
    }
    void filltablehoadon(){
        DefaultTableModel model = (DefaultTableModel) tblLichSuHoaDon.getModel();
        model.setRowCount(0);
        String thang = String.valueOf(cboThoiGian.getSelectedItem());
        if (thang.equals("ALL")) {
            List<Object[]> list = daoct.selectallhoadon();
            for (Object[] objects : list) {
                model.addRow(objects);
            }
        }else{
            List<Object[]> list1 = daoct.selectallhoadontheothang(Integer.parseInt(thang));
            for (Object[] objects : list1) {
                model.addRow(objects);
            }
        }
    }
    void filltableHoaDonNV(){
        DefaultTableModel model = (DefaultTableModel) tblLichSuHoaDon.getModel();
        model.setRowCount(0);
        String thang = String.valueOf(cboThoiGian.getSelectedItem());
        String nv = String.valueOf(cboNhanVien.getSelectedItem());
        if (thang.equals("ALL")) {
            List<Object[]> list = daoct.selectallhoadontheotennv(nv);
            for (Object[] objects : list) {
                model.addRow(objects);
            }
        } else{
            List<Object[]> list1= daoct.selecttablehd(nv, Integer.parseInt(thang));
            for (Object[] objects : list1) {
                model.addRow(objects);
            }
        }
    }
    void filltablechitiet(){
        int row = tblLichSuHoaDon.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblChiTietHD.getModel();
        model.setRowCount(0);
        int mand = (int) tblLichSuHoaDon.getValueAt(row, 0);
        List<Object[]> list = daoct.selectablechitiet(mand);
        for (Object[] objects : list) {
            model.addRow(objects);
        }
    }
}
