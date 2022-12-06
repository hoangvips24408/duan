/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.NhanVienDAO;
import Entity.NhanVien;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import utils.Auth;
import utils.MsgBox;
import utils.XImage;

/**
 *
 * @author Quan
 */
public class NhanVienJInternalFrame extends javax.swing.JInternalFrame {

    NhanVienDAO dao = new NhanVienDAO();
    JFileChooser filechooser = new JFileChooser();
    int row = 0;
    String pass = "123";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * Creates new form NhanVienJInternalFrame
     */
    public NhanVienJInternalFrame() {
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblTDN = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtHoTen = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblTDN1 = new javax.swing.JLabel();
        btnMoi = new javax.swing.JButton();
        txtNgaySinh = new javax.swing.JTextField();
        lblTDN2 = new javax.swing.JLabel();
        lblTDN3 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        lblTDN4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        lblTDN5 = new javax.swing.JLabel();
        lblTDN6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLyNhanVien = new javax.swing.JTable();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        lblHinhAnh = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        lblTDN7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTDN8 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        rdoQuanLy = new javax.swing.JRadioButton();
        rdoNhanVien = new javax.swing.JRadioButton();

        lblTDN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN.setText("Mã Nhân Viên");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        jButton1.setText("Xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jButton3.setText("Thêm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/repair.png"))); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblTDN1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN1.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN1.setText("Họ Tên");

        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Clear.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        lblTDN2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN2.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN2.setText("Ngày Sinh");

        lblTDN3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN3.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN3.setText("Số Điện Thoại");

        lblTDN4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN4.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN4.setText("Địa Chỉ");

        lblTDN5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN5.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN5.setText("Giới Tính");

        lblTDN6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN6.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN6.setText("THÔNG TIN:");

        tblQuanLyNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên NV", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Số Điện Thoại", "Chức Vụ", "Hình Ảnh", "Emai"
            }
        ));
        tblQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLyNhanVien);

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        lblHinhAnh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblHinhAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHinhAnhMousePressed(evt);
            }
        });

        lblTDN7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN7.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN7.setText("Email");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        lblTDN8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTDN8.setForeground(new java.awt.Color(0, 153, 0));
        lblTDN8.setText("Chức Vụ");

        buttonGroup2.add(rdoQuanLy);
        rdoQuanLy.setText("Quản lý");

        buttonGroup2.add(rdoNhanVien);
        rdoNhanVien.setText("Nhân viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTDN6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblTDN1)
                                    .addGap(68, 68, 68)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblTDN)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
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
                                            .addGap(4, 4, 4)
                                            .addComponent(lblTDN3)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblTDN5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rdoNam)
                                            .addGap(48, 48, 48)
                                            .addComponent(rdoNu)
                                            .addGap(157, 157, 157)))
                                    .addGap(2, 2, 2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTDN8)
                            .addComponent(lblTDN7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtemail)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3)
                                        .addComponent(btnMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoQuanLy)
                                .addGap(27, 27, 27)
                                .addComponent(rdoNhanVien)))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(342, 342, 342))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(lblTDN6)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdoQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rdoNhanVien))
                            .addComponent(lblTDN8))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTDN7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMoi)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN1)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN2)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTDN3)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTDN4))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoNu)
                            .addComponent(lblTDN5))))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        intsert();
        clearfrom();
        taoMaQR();
        guiEmail();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void lblHinhAnhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhMousePressed
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {

            chonanh();
        }
    }//GEN-LAST:event_lblHinhAnhMousePressed

    private void tblQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyNhanVienMouseClicked
        // TODO add your handling code here:
        this.row = tblQuanLyNhanVien.rowAtPoint(evt.getPoint());
        edit();
    }//GEN-LAST:event_tblQuanLyNhanVienMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        // TODO add your handling code here:
        clearfrom();
    }//GEN-LAST:event_btnMoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHinhAnh;
    private javax.swing.JLabel lblTDN;
    private javax.swing.JLabel lblTDN1;
    private javax.swing.JLabel lblTDN2;
    private javax.swing.JLabel lblTDN3;
    private javax.swing.JLabel lblTDN4;
    private javax.swing.JLabel lblTDN5;
    private javax.swing.JLabel lblTDN6;
    private javax.swing.JLabel lblTDN7;
    private javax.swing.JLabel lblTDN8;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JRadioButton rdoQuanLy;
    private javax.swing.JTable tblQuanLyNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtemail;
    // End of variables declaration//GEN-END:variables

    void chonanh() {
        if (filechooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();
            XImage.save(file);
            int with = lblHinhAnh.getWidth();
            int heigh = lblHinhAnh.getHeight();

            ImageIcon icon = new ImageIcon(XImage.read(file.getName()).getImage().getScaledInstance(with, heigh, 0));
            lblHinhAnh.setIcon(icon);
            lblHinhAnh.setToolTipText(file.getName());
        }
    }

    void filltable() {
        DefaultTableModel model = (DefaultTableModel) tblQuanLyNhanVien.getModel();
        model.setRowCount(0);
        List<NhanVien> nv = dao.selectAll();
        for (NhanVien nhanVien : nv) {
            String[] ngay = nhanVien.getNgaySinh().split("-");
            Object[] row = {nhanVien.getMaNV(), nhanVien.getTenNV(), ngay[2]+"-"+ngay[1]+"-"+ngay[0], nhanVien.isGioiTinh() ? "Nam" : "Nữ", nhanVien.getDiaChi(), nhanVien.getSDT(), nhanVien.isChucVu() ? "Quản lý" : "Nhân viên", nhanVien.getHinh(), nhanVien.getEmail()};
            model.addRow(row);
        }
    }

    void setfrom(NhanVien nv) {
        txtDiaChi.setText(nv.getDiaChi());
        txtHoTen.setText(nv.getTenNV());
        txtMaNhanVien.setText(nv.getMaNV());
        try {
            String[] ngay = nv.getNgaySinh().split("-");
        txtNgaySinh.setText(ngay[2]+"-"+ngay[1]+"-"+ngay[0]);
        } catch (Exception e) {
            txtNgaySinh.setText("");
        }
        
        txtSoDienThoai.setText(nv.getSDT());
        txtemail.setText(nv.getEmail());
        rdoNam.setSelected(nv.isGioiTinh());
        rdoNu.setSelected(!nv.isGioiTinh());
        rdoQuanLy.setSelected(nv.isChucVu());
        rdoNhanVien.setSelected(!nv.isChucVu());
        if (nv.getHinh() != null) {
            int with = lblHinhAnh.getWidth();
            int heigh = lblHinhAnh.getHeight();

            ImageIcon icon = new ImageIcon(XImage.read(nv.getHinh()).getImage().getScaledInstance(with, heigh, 0));
            lblHinhAnh.setIcon(icon);
            lblHinhAnh.setToolTipText(nv.getHinh());
        }else{
            lblHinhAnh.setIcon(null);
        }
    }

    void edit() {
        String maNV = (String) tblQuanLyNhanVien.getValueAt(this.row, 0);
        NhanVien nv = dao.selectById(maNV);
        if (nv != null) {
            setfrom(nv);

        }
    }

    NhanVien getFrom() {
        NhanVien nv = new NhanVien();
        nv.setChucVu(rdoQuanLy.isSelected());
        nv.setDiaChi(txtDiaChi.getText());
        nv.setEmail(txtemail.getText());
        nv.setGioiTinh(rdoNam.isSelected());
        nv.setHinh(lblHinhAnh.getToolTipText());
        nv.setMaNV(txtMaNhanVien.getText());
        nv.setMatKhau(pass);
        String[] ngay = txtNgaySinh.getText().split("-");
        nv.setNgaySinh(ngay[2]+"-"+ngay[1]+"-"+ngay[0]);
        nv.setSDT(txtSoDienThoai.getText());
        nv.setTenNV(txtHoTen.getText());
        return nv;
    }

    void clearfrom() {
        this.setfrom(new NhanVien());
    }

    void intsert() {
        NhanVien nv = getFrom();
        try {
            dao.insert(nv);
            filltable();
            MsgBox.alert(this, "Thêm thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm thất bại!");
        }

    }
    String duongdan;

    void taoMaQR() {
        try {

            ByteArrayOutputStream out = QRCode.from(txtMaNhanVien.getText())
                    .to(ImageType.PNG).stream();

            String f_name = txtMaNhanVien.getText();
            String Path_name = "D:\\";
            FileOutputStream fout = new FileOutputStream(new File(Path_name + (f_name + ".PNG")));
            fout.write(out.toByteArray());
            fout.flush();
            duongdan = Path_name + f_name + ".PNG";
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void guiEmail() {
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", 587);
        String senderEmail = "vihnhps24408@fpt.edu.vn";
        String toEmail = txtemail.getText();
        String subject = "Xin chào";
        String body = "username của bạn là " + txtMaNhanVien.getText() + " và password của bạn là " + pass;
        String pass1 = "23062019Vi";
        Session s = Session.getInstance(p, new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(senderEmail, pass1);
            }
        });

        try {
            Message msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(senderEmail));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            msg.setSubject(subject);
            msg.setText(body);
            MimeBodyPart mbp = new MimeBodyPart();
            mbp.setContent(body, "text/html; charset=utf-8");
            MimeBodyPart filepart = new MimeBodyPart();
            File file = new File(duongdan);
            FileDataSource fds = new FileDataSource(file);
            filepart.setDataHandler(new DataHandler(fds));
            filepart.setFileName(file.getName());
            MimeMultipart multipart = new MimeMultipart();
            multipart.addBodyPart(mbp);
            multipart.addBodyPart(filepart);
            msg.setContent(multipart);
            Transport.send(msg);
        } catch (MessagingException ex) {
            Logger.getLogger(NhanVienJInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void update() {
        NhanVien nv = getFrom();
        try {
            dao.update(nv);
            filltable();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
        }
    }

    void delete() {
        if (MsgBox.confirm(this, "Bạn có chắc xóa nhân viên này")) {
            String maNV = txtMaNhanVien.getText();
            dao.delete(maNV);
            this.filltable();
            clearfrom();
        }
    }
}
