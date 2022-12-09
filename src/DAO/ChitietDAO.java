package DAO;

import Entity.ChiTietHoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;

/**
 *
 * @author Admin
 */
public class ChitietDAO {
    String insert_sql = "insert into ChiTietHoaDon (MaHD, MaMA, SoLuong, ThanhTien) values (?, ?, ?, ?)";
    //String update_sql = "UPDATE HoaDon SET NgayXuat =?, TongTien =?, MaNV =?, MaKH =? where MaHD = ?";
    //String delete_sql = "DELETE FROM HoaDon where MaHD=?";
    //String select_all = "SELECT * FROM HoaDon";
   // String select_byID = "SELECT * FROM HoaDon where MaHD=?";
    protected List<ChiTietHoaDon> selectBySql(String sql, Object... args) {
        List<ChiTietHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                ChiTietHoaDon entity = new ChiTietHoaDon();
                entity.setMaHD(rs.getShort("MaHD"));
                entity.setMaMA(rs.getString("MaMA"));
                entity.setSoLuong(rs.getInt("SoLuong"));
                entity.setThanhTien(rs.getFloat("ThanhTien"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }
    
    public void insert(ChiTietHoaDon entity) {
        JdbcHelper.update(insert_sql, entity.getMaHD(), entity.getMaMA(), entity.getSoLuong(), entity.getThanhTien());
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
     public List<Object[]> selectTenNV(int thang) {
        String sql = "{CALL sp_nvtheothang(?)}";
        String[] cols = {"TenNV"};
        return getListOfArray(sql, cols,thang);
    }
     public List<Object[]> selecttablehd(String tennv,int thang) {
        String sql = "{CALL sp_hoadontheonv(?,?)}";
        String[] cols = {"MaHD","TenNV","NgayXuat","HoTen","ThanhToan"};
        return getListOfArray(sql, cols,tennv,thang);
    }
      public List<Object[]> selectallhoadon() {
        String sql = "{CALL sp_allhoadon}";
        String[] cols = {"MaHD","TenNV","NgayXuat","HoTen","ThanhToan"};
        return getListOfArray(sql, cols);
    }
     public List<Object[]> selectallhoadontheothang(int thang) {
        String sql = "{CALL sp_hoadontheothang(?)}";
        String[] cols = {"MaHD","TenNV","NgayXuat","HoTen","ThanhToan"};
        return getListOfArray(sql, cols,thang);
    } 
       public List<Object[]> selectallhoadontheotennv(String tennv) {
        String sql = "{CALL sp_hoadontheonv1(?)}";
        String[] cols = {"MaHD","TenNV","NgayXuat","HoTen","ThanhToan"};
        return getListOfArray(sql, cols,tennv);
    } 
       public List<Object[]> selectablechitiet(int mahd) {
        String sql = "{CALL sp_chitiet(?)}";
        String[] cols = {"TenMon","GiaTien","SoLuong","ThanhTIen"};
        return getListOfArray(sql, cols,mahd);
    } 
     public static void main(String[] args) {
        ChitietDAO a = new ChitietDAO();
        List<Object[]> b = a.selectablechitiet(1);
         for (Object[] objects : b) {
             System.out.println(objects);
         }
    }
   
}
