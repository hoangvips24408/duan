/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package UI;

import DAO.LoaiMonDAO;
import Entity.LoaiMonAn;
import Entity.NhanVien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import utils.MsgBox;

/**
 *
 * @author Quan
 */
public class DanhMucJInternalFrame extends javax.swing.JInternalFrame {

    LoaiMonDAO dao = new LoaiMonDAO();
    List<LoaiMonAn> list = new ArrayList<>();
    int row = 0;

    /**
     * Creates new form DanhMucJInternalFrame
     */
    public DanhMucJInternalFrame() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        filltoTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbang = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtmaloai = new javax.swing.JTextField();
        txttenloai = new javax.swing.JTextField();
        lblThem = new javax.swing.JLabel();
        lblXoa = new javax.swing.JLabel();
        lblSua = new javax.swing.JLabel();
        lblMoi = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(68, 7, 7));
        jLabel1.setText("DANH   MỤC   MÓN   ĂN");

        tblbang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã món ", "Tên món"
            }
        ));
        tblbang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbang);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Mã loại : ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tên loại :");

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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtmaloai, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txttenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMoi)
                                    .addComponent(lblSua)))
                            .addComponent(lblXoa)
                            .addComponent(lblThem))))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtmaloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txttenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMoi)
                            .addComponent(lblThem))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSua)
                            .addComponent(lblXoa))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblbangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbangMouseClicked

        this.row = tblbang.rowAtPoint(evt.getPoint());
        edit();

    }//GEN-LAST:event_tblbangMouseClicked

    private void lblThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblThemMouseClicked
        if (evt.getClickCount() == 2 || evt.getClickCount() == 1) {
            add();
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
            neww();
        }
    }//GEN-LAST:event_lblMoiMouseClicked

    private void lblMoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoiMouseEntered
        lblMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moi_hover.png")));
    }//GEN-LAST:event_lblMoiMouseEntered

    private void lblMoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMoiMouseExited
        lblMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moi_defaul.png")));
    }//GEN-LAST:event_lblMoiMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMoi;
    private javax.swing.JLabel lblSua;
    private javax.swing.JLabel lblThem;
    private javax.swing.JLabel lblXoa;
    private javax.swing.JTable tblbang;
    private javax.swing.JTextField txtmaloai;
    private javax.swing.JTextField txttenloai;
    // End of variables declaration//GEN-END:variables
    void filltoTable() {
        DefaultTableModel model = (DefaultTableModel) tblbang.getModel();
        model.setRowCount(0);
        List<LoaiMonAn> nv = dao.selectALL();
        for (LoaiMonAn lm : nv) {
            Object[] row = {lm.getMaLoai(), lm.getTenLoai()};
            model.addRow(row);
        }
    }

    void setForm(LoaiMonAn model) {
        txtmaloai.setText("" + model.getMaLoai());
        txttenloai.setText(model.getTenLoai());
    }

    void edit() {
        int maLoai = (int) tblbang.getValueAt(this.row, 0);
        LoaiMonAn lm = dao.selectById(maLoai);
        if (lm != null) {
            setForm(lm);
        }
    }
    
    LoaiMonAn getFrom() {
        LoaiMonAn model = new LoaiMonAn();
        model.setMaLoai(Integer.parseInt(txtmaloai.getText()));
        model.setTenLoai(txttenloai.getText());     
        return model;
    }
    
    void neww(){
         this.setForm(new LoaiMonAn());
        txtmaloai.setText("");
        txttenloai.setText("");
       
    }
    
    void add(){
        LoaiMonAn model = getFrom();
        dao.insert(model);
        filltoTable();
    }
    
    void update(){
        LoaiMonAn model =getFrom();
        dao.update(model);
        filltoTable();
    }
    
    void delete(){
        try {
             int maloai = (int) tblbang.getValueAt(this.row, 0);
        LoaiMonAn model = getFrom();
        dao.delete(maloai);
        filltoTable();
        } catch (Exception e) {
            MsgBox.alert(this, "Danh mục này có chứa món ăn !");
        }
       
    }
}
