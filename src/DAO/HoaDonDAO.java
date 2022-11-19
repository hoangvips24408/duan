package DAO;

import DAO.FastFood;
import Entity.HoaDon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class HoaDonDAO extends FastFood<HoaDon, Integer> {

    String insert_sql = "INSERT INTO HoaDon (NgayXuat, TongTien, MaNV, MaKH) VALUES (?,?,?,?)";
    String update_sql = "UPDATE HoaDon SET NgayXuat =?, TongTien =?, MaNV =?, MaKH =? where MaHD = ?";
    String delete_sql = "DELETE FROM HoaDon where MaHD=?";
    String select_all = "SELECT * FROM HoaDon";
    String select_byID = "SELECT * FROM HoaDon where MaHD=?";

    @Override
    public void insert(HoaDon entity) {
        JdbcHelper.update(insert_sql, entity.getNgayXuat(), entity.getTongTien(), entity.getMaNV(), entity.getMaKH());
    }

    @Override
    public void update(HoaDon entity) {
        JdbcHelper.update(update_sql, entity.getNgayXuat(), entity.getTongTien(), entity.getMaNV(), entity.getMaKH(), entity.getMaHD());

    }

    @Override
    public void delete(Integer id) {
        JdbcHelper.update(delete_sql, id);
    }

    @Override
    public List<HoaDon> selectAll() {
        return selectBySql(select_all);
    }

    @Override
    public HoaDon selectById(Integer key) {
        List<HoaDon> list = selectBySql(select_byID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
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

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getInt("MaHD"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayXuat(rs.getString("NgayXuat"));
                entity.setTongTien(rs.getFloat("TongTien"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return list;
    }

    public List<HoaDon> selectBySql1() {
        List<HoaDon> list = new ArrayList<>();
        String sql = "select top 1 MaHD\n"
                + "	from HoaDon\n"
                + "	order by MaHD DESC";
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getInt("MaHD"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException();

        }
        return list;
    }

    public static void main(String[] args) {
        HoaDonDAO d = new HoaDonDAO();
        d.tinhSoLuong(10, "ma01");
    }
    public void tinhSoLuong(int soLuong, String maMA) {
        String sql = "{CALL sp_tinhSoLuong(?, ?)}";
        try {
            PreparedStatement st = new JdbcHelper().getStmt(sql);
            st.setDouble(1, soLuong);
            st.setString(2, maMA);
            st.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
