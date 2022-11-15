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
    String insert_sql = "INSERT INTO HoaDon (MaHD, NgayXuat, TongTien, MaNV, MaKH) VALUES (?,?,?,?,?)";
    String update_sql = "UPDATE HoaDon SET NgayXuat =?, TongTien =?, MaNV =?, MaKH =? where MaHD = ?";
    String delete_sql = "DELETE FROM HoaDon where MaHD=?";
    String select_all = "SELECT * FROM HoaDon";
    String select_byID = "SELECT * FROM HoaDon where MaHD=?";
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
}
