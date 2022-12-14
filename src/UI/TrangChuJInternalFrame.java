/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.KhuyenMaiDAO;
import Entity.KhuyenMai;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import utils.XImage;

/**
 *
 * @author Quan
 */
public class TrangChuJInternalFrame extends javax.swing.JInternalFrame {

    KhuyenMaiDAO KMDAO = new KhuyenMaiDAO();

    public TrangChuJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        khuyenMai();
    }
    
    public void khuyenMai() {
        List<KhuyenMai> list = KMDAO.selectAll();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        String ngayMay = format.format(new Date());
        String[] ngayHienTai = ngayMay.split("-");
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
                    lblHinh.setText("");
                    lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + km.getHinh())));
                    break;
                } else {
                    lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KM0.png")));
                }
            }
        }
    }
    
    public void getGia() {
        int x = 1;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHinh = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHinh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblHinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblHinh;
    // End of variables declaration//GEN-END:variables
}
//    public void khuyenMai() {
//        List<KhuyenMai> list = KMDAO.selectAll();
//        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
//        String ngayMay = format.format(new Date());
//        String[] ngayHienTai = ngayMay.split("-");
//        for (KhuyenMai km : list) {
//            String KT = km.getNgayKT();
//            String[] viTriKT = KT.split("-");
//            String BD = km.getNgayBD();
//            String[] viTriBD = BD.split("-");
//
//            LocalDate now = LocalDate.of(Integer.valueOf(ngayHienTai[0]), Integer.valueOf(ngayHienTai[1]), Integer.valueOf(ngayHienTai[2]));
//            LocalDate startDate = LocalDate.of(Integer.valueOf(viTriBD[0]), Integer.valueOf(viTriBD[1]), Integer.valueOf(viTriBD[2]));
//            LocalDate endDate = LocalDate.of(Integer.valueOf(viTriKT[0]), Integer.valueOf(viTriKT[1]), Integer.valueOf(viTriKT[2]));
//
//            if (now.isEqual(startDate) || now.isAfter(startDate) && now.isEqual(endDate) || now.isBefore(endDate)) {
//                lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + km.getHinh())));
//            } else {
//                lblHinh.setText("Kh??ng c?? s??? ki???n n??o ??ang ???????c di???n ra");
//            }
//        }
//    }
