package DAO;

import Entity.NhanVien;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class ThongKeDAO {

    String insert_sql = "INSERT INTO NhanVien (MaNV, TenNV, NgaySinh, GioiTinh, DiaChi, SDT, ChucVu, Hinh, MatKhau) VALUES (?,?,?,?,?,?,?,?,?)";
    String update_sql = "UPDATE NhanVien TenNV =?, NgaySinh =?, GioiTinh =?, DiaChi =?, SDT =?, ChucVu =?, Hinh =?, MatKhau =? where MaNV = ?";
    String delete_sql = "DELETE FROM NhanVien where MaNV=?";
    String select_all = "SELECT * FROM NhanVien";
    String select_byID = "SELECT * FROM NhanVien where MaNV=?";

    public void insert(NhanVien entity) {
        JdbcHelper.update(insert_sql, entity.getMaNV(), entity.getTenNV(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDiaChi(), entity.isChucVu(), entity.getHinh(), entity.getMatKhau());
    }

    public void update(NhanVien entity) {
        JdbcHelper.update(update_sql, entity.getTenNV(), entity.getNgaySinh(), entity.isGioiTinh(), entity.getDiaChi(), entity.isChucVu(), entity.getHinh(), entity.getMatKhau(), entity.getMaNV());
    }

    public void delete(String id) {
        JdbcHelper.update(id);
    }

    public List<NhanVien> selectAll() {
        return selectBySql(select_all);
    }

    public NhanVien selectById(String key) {
        List<NhanVien> list = selectBySql(select_byID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
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
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

//    public List<NhanVien> selectTenNVByThang() {
//        String sql = "select distinct nv.TenNV\n"
//                + "from HoaDon hd, NhanVien nv\n"
//                + "where hd.MaNV = nv.MaNV";
//        return this.selectBySql(sql);
//    }
//    
    public List<Object[]> selectTenNVByThang() {
        String sql = "{CALL gettennhanvien()}";
        String[] cols = {"TenNV"};
        return getListOfArray(sql, cols);
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

    public List<Object[]> getTableTheoTen(String tenNhanVien) {
        String sql = "{CALL doanhthutheothangmoi2(?)}";
        String[] cols = {"MaHD", "TongTien", "GiamGia", "ThanhToan", "NgayXuat"};
        return getListOfArray(sql, cols, tenNhanVien);
    }

    public List<Object[]> getTableTheoThoiGian(int thang) {
        String sql = "{CALL doanhthutheothoigian(?)}";
        String[] cols = {"MaHD", "Tổng tiền", "NgayXuat"};
        return getListOfArray(sql, cols, thang);
    }

    public static void main(String[] args) {
        ThongKeDAO d = new ThongKeDAO();
        List<Object[]> a = d.getTableTheoTen("Obama");
        for (Object[] objects : a) {
            System.out.println(objects.toString());

        }
    }

}
