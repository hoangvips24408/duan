package DAO;

import Entity.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;


/**
 *
 * @author Admin
 */
public class NhanVienDAO extends FastFood<NhanVien, String>{
    String insert_sql="INSERT INTO NhanVien (MaNV, TenNV, NgaySinh, GioiTinh, DiaChi, SDT, ChucVu, Hinh, Email) VALUES (?,?,?,?,?,?,?,?,?)";
    String update_sql="UPDATE NhanVien TenNV =?, NgaySinh =?, GioiTinh =?, DiaChi =?, SDT =?, ChucVu =?, Hinh =?, Email =? where MaNV = ?";
    String delete_sql="DELETE FROM NhanVien where MaNV=?";
    String select_all="SELECT * FROM NhanVien";
    String select_byID="SELECT * FROM NhanVien where MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        JdbcHelper.update(insert_sql, entity.getMaNV(),entity.getTenNV(),entity.getNgaySinh(),entity.isGioiTinh(),entity.getDiaChi(),entity.isChucVu(),entity.getHinh(),entity.getMatKhau());
    }

    @Override
    public void update(NhanVien entity) {
        JdbcHelper.update(update_sql,entity.getTenNV(),entity.getNgaySinh(),entity.isGioiTinh(),entity.getDiaChi(),entity.isChucVu(),entity.getHinh(),entity.getMatKhau(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        JdbcHelper.update(id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return selectBySql(select_all);
    }

    @Override
    public NhanVien selectById(String key) {
         List<NhanVien> list = selectBySql(select_byID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setChucVu(rs.getBoolean("ChucVu"));
                entity.setDiaChi(rs.getString("DiaChi"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setNgaySinh(rs.getString("NgaySinh"));
                entity.setSDT(rs.getString("SDT"));
                entity.setTenNV(rs.getString("TenNV"));
                entity.setEmail(rs.getString("Email"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    
    
}
