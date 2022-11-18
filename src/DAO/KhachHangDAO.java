package DAO;

import DAO.FastFood;
import Entity.KhachHang;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class KhachHangDAO extends FastFood<KhachHang, String> {

    String insert_sql = "INSERT INTO KhachHang (MaKH, HoTen, GioiTinh, Email, SDT, DiaChi, NgaySinh)VALUES (?,?,?,?,?,?,?)";
    String update_sql = "UPDATE KhachHang SET HoTen =?, GioiTinh =?, Email =?, SDT =?, DiaChi =?, NgaySinh =? where MaKH = ?";
    String delete_sql = "DELETE FROM KhachHang where MaKH=?";
    String select_all = "SELECT * FROM KhachHang";
    String select_byID = "SELECT * FROM KhachHang where MaKH=?";
     String select_byKey = "SELECT * FROM KhachHang where HoTen like ?";

    @Override
    public void insert(KhachHang entity) {
        JdbcHelper.update(insert_sql, entity.getMaKH(),entity.getHoTen(),entity.isGioiTinh(),entity.getEmail(),entity.getSDT(),entity.getDiaChi(),entity.getNgaySinh());
    }

    @Override
    public void update(KhachHang entity) {
        JdbcHelper.update(update_sql, entity.getHoTen(),entity.isGioiTinh(),entity.getEmail(),entity.getSDT(),entity.getDiaChi(),entity.getNgaySinh(), entity.getMaKH());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(delete_sql,id);
    }

    @Override
    public List<KhachHang> selectAll() {
        return selectBySql(select_all);
    }

    @Override
    public KhachHang selectById(String key) {
         List<KhachHang> list = selectBySql(select_byID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                KhachHang entity = new KhachHang();
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setEmail(rs.getString("Email"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setNgaySinh(rs.getString("NgaySinh"));
                entity.setSDT(rs.getString("SDT"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    
     public List<KhachHang> selectByKeyword(String key) {
        return selectBySql(select_byKey, "%" + key + "%");
    }

}
