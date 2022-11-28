/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.KhachHangDAO;
import DAO.KhuyenMaiDAO;
import Entity.KhachHang;
import Entity.KhuyenMai;
import com.sun.mail.imap.ACL;
import java.awt.Button;
import java.awt.Color;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import utils.Auth;
import utils.MsgBox;
import utils.XImage;

/**
 *
 * @author Quan
 */
public class TrangChuJFrame extends javax.swing.JFrame {

    Color DefaultColor, ClickedColor;
    Border border = BorderFactory.createLineBorder(ClickedColor);

    public TrangChuJFrame() {
        initComponents();
        setTitle("Trang Chủ");
        setLocationRelativeTo(null);
        DefaultColor = new Color(240, 151, 57);
        ClickedColor = new Color(238, 173, 14);
        checksinhnhat();
        setIconImage(XImage.getAppIcon());
        khuyenMai();
        this.setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackGround = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JButton();
        btnChiTietHoaDon = new javax.swing.JButton();
        btnDanhMuc = new javax.swing.JButton();
        btnMonAn = new javax.swing.JButton();
        btnDoanhThu = new javax.swing.JButton();
        btnKhuyenMai = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnTaiKhoan1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(204, 204, 204));
        pnlMain.setPreferredSize(new java.awt.Dimension(1028, 585));

        lblHinh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(240, 151, 57));

        btnTrangChu.setBackground(new java.awt.Color(240, 151, 57));
        btnTrangChu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        btnTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btnTrangChu.setText("TRANG CHỦ");
        btnTrangChu.setBorder(null);
        btnTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        btnChiTietHoaDon.setBackground(new java.awt.Color(240, 151, 57));
        btnChiTietHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChiTietHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnChiTietHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ChiTietBill.png"))); // NOI18N
        btnChiTietHoaDon.setText("CHI TIẾT HÓA ĐƠN");
        btnChiTietHoaDon.setBorder(null);
        btnChiTietHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChiTietHoaDonMouseEntered(evt);
            }
        });
        btnChiTietHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTietHoaDonActionPerformed(evt);
            }
        });

        btnDanhMuc.setBackground(new java.awt.Color(240, 151, 57));
        btnDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDanhMuc.setForeground(new java.awt.Color(255, 255, 255));
        btnDanhMuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DanhMuc.png"))); // NOI18N
        btnDanhMuc.setText("DANH MỤC");
        btnDanhMuc.setBorder(null);
        btnDanhMuc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDanhMuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDanhMucActionPerformed(evt);
            }
        });

        btnMonAn.setBackground(new java.awt.Color(240, 151, 57));
        btnMonAn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMonAn.setForeground(new java.awt.Color(255, 255, 255));
        btnMonAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monAn.png"))); // NOI18N
        btnMonAn.setText("MÓN ĂN");
        btnMonAn.setBorder(null);
        btnMonAn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMonAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonAnActionPerformed(evt);
            }
        });

        btnDoanhThu.setBackground(new java.awt.Color(240, 151, 57));
        btnDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        btnDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DoanhThu.png"))); // NOI18N
        btnDoanhThu.setText("DOANH THU");
        btnDoanhThu.setBorder(null);
        btnDoanhThu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });

        btnKhuyenMai.setBackground(new java.awt.Color(240, 151, 57));
        btnKhuyenMai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        btnKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KhuyenMai.png"))); // NOI18N
        btnKhuyenMai.setText("KHUYẾN MÃI");
        btnKhuyenMai.setBorder(null);
        btnKhuyenMai.setHideActionText(true);
        btnKhuyenMai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenMaiActionPerformed(evt);
            }
        });

        btnHoaDon.setBackground(new java.awt.Color(240, 151, 57));
        btnHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill.png"))); // NOI18N
        btnHoaDon.setText("HÓA ĐƠN");
        btnHoaDon.setBorder(null);
        btnHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(240, 151, 57));
        btnNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/staff.png"))); // NOI18N
        btnNhanVien.setText("NHÂN VIÊN");
        btnNhanVien.setBorder(null);
        btnNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseEntered(evt);
            }
        });
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(240, 151, 57));
        btnKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Customer2.png"))); // NOI18N
        btnKhachHang.setText("KHÁCH HÀNG");
        btnKhachHang.setBorder(null);
        btnKhachHang.setHideActionText(true);
        btnKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseEntered(evt);
            }
        });
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnDoiMatKhau.setBackground(new java.awt.Color(240, 151, 57));
        btnDoiMatKhau.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoiMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Acount.png"))); // NOI18N
        btnDoiMatKhau.setText("ĐỔI MẬT KHẨU");
        btnDoiMatKhau.setBorder(null);
        btnDoiMatKhau.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });

        btnTaiKhoan1.setBackground(new java.awt.Color(240, 151, 57));
        btnTaiKhoan1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTaiKhoan1.setForeground(new java.awt.Color(255, 255, 255));
        btnTaiKhoan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Xoa.png"))); // NOI18N
        btnTaiKhoan1.setText("DANG XUAT");
        btnTaiKhoan1.setBorder(null);
        btnTaiKhoan1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTaiKhoan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChiTietHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDanhMuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonAn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoanhThu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhuyenMai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaiKhoan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChiTietHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMonAn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoiMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaiKhoan1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/food.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlBackGroundLayout = new javax.swing.GroupLayout(pnlBackGround);
        pnlBackGround.setLayout(pnlBackGroundLayout);
        pnlBackGroundLayout.setHorizontalGroup(
            pnlBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackGroundLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
                    .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBackGroundLayout.setVerticalGroup(
            pnlBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackGroundLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        TrangChuJInternalFrame trangChu = new TrangChuJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(trangChu).setVisible(true);
        thongTinKhuyenMai();
        test("Trang Chủ");
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        DoiLaiMatKhauJInternalFrame taiKhoan = new DoiLaiMatKhauJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(taiKhoan).setVisible(true);

        test("Đổi mật khẩu");

    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        HoaDonJInternalFrame hoaDon = new HoaDonJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(hoaDon).setVisible(true);

        test("Hóa Đơn");
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnChiTietHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTietHoaDonActionPerformed
        ChiTietHoaDonJInternalFrame chiTiet = new ChiTietHoaDonJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(chiTiet).setVisible(true);

        test("Chi Tiết Hóa Đơn");
    }//GEN-LAST:event_btnChiTietHoaDonActionPerformed

    private void btnDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDanhMucActionPerformed
        DanhMucJInternalFrame danhMuc = new DanhMucJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(danhMuc).setVisible(true);

        test("Danh Mục");
    }//GEN-LAST:event_btnDanhMucActionPerformed

    private void btnMonAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonAnActionPerformed
        MonAnJInternalFrame monAn = new MonAnJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(monAn).setVisible(true);

        test("Món Ăn");
    }//GEN-LAST:event_btnMonAnActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
       

        test("Doanh Thu");
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xem doanh thu");
        } else {
             DoanhThuJInternalFrame doanhThu = new DoanhThuJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(doanhThu).setVisible(true);
        }
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyển vào nhân viên");
        } else {
            NhanVienJInternalFrame nhanVien = new NhanVienJInternalFrame();
            pnlMain.removeAll();
            pnlMain.add(nhanVien).setVisible(true);
            test("Nhân Viên");
        }
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenMaiActionPerformed
        KhuyenMaiJInternalFrame khuyenMai = new KhuyenMaiJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(khuyenMai).setVisible(true);

        test("Khuyến Mãi");
    }//GEN-LAST:event_btnKhuyenMaiActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        QuanLyKhachHangJInternalFrame khachHang = new QuanLyKhachHangJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(khachHang).setVisible(true);

        test("Khách Hàng");
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnChiTietHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChiTietHoaDonMouseEntered
//        btnChiTietHoaDon.setBorder(border);
//        btnKhachHang.setBorder(null);
//        btnNhanVien.setBorder(null);
    }//GEN-LAST:event_btnChiTietHoaDonMouseEntered

    private void btnKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseEntered
//        btnChiTietHoaDon.setBorder(null);
//        btnKhachHang.setBorder(border);
//        btnNhanVien.setBorder(null);
    }//GEN-LAST:event_btnKhachHangMouseEntered

    private void btnNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseEntered
//        btnChiTietHoaDon.setBorder(null);
//        btnKhachHang.setBorder(null);
//        btnNhanVien.setBorder(border);
    }//GEN-LAST:event_btnNhanVienMouseEntered

    private void btnTaiKhoan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoan1ActionPerformed
        if(MsgBox.confirm(this, "Bạn có muốn đăng xuất tài khoản?") == true) {
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btnTaiKhoan1ActionPerformed

    public void test(String x) {
        String getText = x;

        if (x.equalsIgnoreCase("Trang Chủ")) {
            btnTrangChu.setBackground(ClickedColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Tài Khoản")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(ClickedColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Hóa Đơn")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(ClickedColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Chi Tiết Hóa Đơn")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(ClickedColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Danh Mục")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(ClickedColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Món Ăn")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(ClickedColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Doanh Thu")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(ClickedColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Nhân Viên")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(ClickedColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Khuyến Mãi")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(ClickedColor);
            btnKhachHang.setBackground(DefaultColor);
        } else if (x.equalsIgnoreCase("Khách Hàng")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(ClickedColor);
        }else if (x.equalsIgnoreCase("Đổi Mật Khẩu")) {
            btnTrangChu.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(DefaultColor);
            btnHoaDon.setBackground(DefaultColor);
            btnChiTietHoaDon.setBackground(DefaultColor);
            btnDanhMuc.setBackground(DefaultColor);
            btnMonAn.setBackground(DefaultColor);
            btnDoanhThu.setBackground(DefaultColor);
            btnNhanVien.setBackground(DefaultColor);
            btnKhuyenMai.setBackground(DefaultColor);
            btnKhachHang.setBackground(DefaultColor);
            btnDoiMatKhau.setBackground(ClickedColor);
        }

    }
    
    public void khuyenMai() {
        TrangChuJInternalFrame trangChu = new TrangChuJInternalFrame();
        pnlMain.removeAll();
        pnlMain.add(trangChu).setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChuJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChuJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTietHoaDon;
    private javax.swing.JButton btnDanhMuc;
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnKhuyenMai;
    private javax.swing.JButton btnMonAn;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnTaiKhoan1;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JPanel pnlBackGround;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
    KhachHangDAO dao = new KhachHangDAO();

    void checksinhnhat() {
        LocalDateTime current = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatted = current.format(formatter);
        String[] ngaymay = formatted.split("-");
        List<KhachHang> list = dao.selectAll();
        for (KhachHang khachHang : list) {
            String sinhnhat = khachHang.getNgaySinh();
            String[] ngaysinhnhat = sinhnhat.split("-");
            if (ngaymay[1].equals(ngaysinhnhat[1])) {
                double ngaythuc = Double.parseDouble(ngaymay[2]);
                double ngaysinh = Double.parseDouble(ngaysinhnhat[2]);
                if ((ngaysinh-ngaythuc)==1) {
                    guiEmail(khachHang.getEmail(),khachHang.getHoTen());
                }

            }
        }
    }
       void guiEmail(String email,String hoten) {
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", 587);
        String senderEmail = "";
        String toEmail = email;
        String subject = "Xin chào";
        String body = "TRI ÂN KHÁCH HÀNG NHÂN DỊP SINH NHẬT\n" +
" \n" +
"Thân gửi: \n" +hoten+
"-     Chúc quý khách sinh nhật vui vẻ bên người thân và bạn bè\n" +
" \n" +
"-      Khi quý khách đến cửa hàng của chúng tôi sẽ được giảm giá 20% toàn bộ hóa đơn thanh toán\n" +
" \n" +
"Lưu ý: Khi thanh toán hóa đơn vui lòng xuất trình Email này để được giảm giá  \n" +
" \n" +
"Mọi thắc mắc vui lòng phản hồi lại email: vihnhps24408@fpt.edu.vn";
        String pass1 = "";
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
            mbp.setContent(body,"text/html; charset=utf-8");
            MimeBodyPart filepart = new MimeBodyPart();
            File file = new File("staff\\sinhnhat1");
            FileDataSource fds =new FileDataSource(file);
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
    
    KhuyenMaiDAO KMDAO = new KhuyenMaiDAO();
    public void thongTinKhuyenMai() {
        List<KhuyenMai> list = KMDAO.selectAll();
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
        String ngayMay = format.format(new Date());
        String[] ngayHienTai = ngayMay.split("-");
        int width = lblHinh.getWidth();
        int height = lblHinh.getHeight();
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
                    ImageIcon icon = new ImageIcon(XImage.read(km.getHinh()).getImage().getScaledInstance(width, height, 0));
                    lblHinh.setIcon(icon);
                    break;
                } else {
                    lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/KM0.png")));
                }
            }
        }
    }
    
    
     
       
}
