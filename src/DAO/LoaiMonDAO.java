/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.LoaiMonAn;
import Entity.NhanVien;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import utils.JdbcHelper;

/**
 *
 * @author lenovo
 */
public class LoaiMonDAO {
    String insert_sql="INSERT INTO LoaiMon (MaLoai,TenLoai) VALUES (?,?)";
    String update_sql="UPDATE LoaiMon SET TenLoai =? where MaLoai=?";
    String delete_sql="DELETE FROM LoaiMon where MaLoai=?";
    String SELECT_BY_ID="SELECT * FROM LoaiMon where MaLoai=?";
    String SELECT_MALOAI = "select MaLoai\n"
            + "from LoaiMon";
    String SELECT_ALL_SQL = "select * from LoaiMon";
    
    public void insert(LoaiMonAn entity) {
        JdbcHelper.update(insert_sql, entity.getMaLoai(),entity.getTenLoai());
    }

  
    public void update(LoaiMonAn entity) {
        JdbcHelper.update(update_sql,entity.getTenLoai(),entity.getMaLoai());
    }

    
    public void delete(Integer id) {
        JdbcHelper.update(delete_sql,id);
    }
    
    protected List<LoaiMonAn> selectBYSQL(String sql, Object... args) {
        List<LoaiMonAn> list = new ArrayList<LoaiMonAn>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                LoaiMonAn loaiMon = new LoaiMonAn();
                loaiMon.setTenLoai(rs.getString("TenLoai"));
                loaiMon.setMaLoai(rs.getInt("MaLoai"));
                list.add(loaiMon);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<LoaiMonAn> selectALL() {
        return this.selectBYSQL(SELECT_ALL_SQL);
    }
    
    public LoaiMonAn selectById(Integer key) {
         List<LoaiMonAn> list = selectBYSQL(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    
    
    public static void main(String[] args) {
        LoaiMonDAO dao = new LoaiMonDAO();
        List<LoaiMonAn> list = dao.selectALL();
        for (LoaiMonAn m : list) {
            System.out.println(m);
        }
    }
    
    public List<LoaiMonAn> selectByTenLoai(String tenLoai) {
        String sql = "select *\n"
                + "from MonAn\n"
                + "where TenLoai = ?";
        return this.selectBYSQL(sql, tenLoai);
    }
     private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
     public List<Object[]> getMon(String tenloai) {
        String sql = "{CALL sp_monan(?)}";
        String[] cols = {"Mã món", "Tên món", "Đơn vị tính", "Giá bán"};
        return getListOfArray(sql, cols, tenloai);
    }
}
