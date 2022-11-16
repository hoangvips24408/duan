/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.MonAn;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;

/**
 *
 * @author lenovo
 */
public class MonAnDAO {

    String INSERT_SQL = "INSERT INTO MonAn(MaMA, TenMon, LoaiMon, DonViTinh, GiaTien, SoLuong, Hinh) "
            + "VALUES(?, ?, ?, ?, ?, ?, ?)";
    String SELECT_ALL_SQL = "select * from MonAn";
    String UPDATE_SQL = "UPDATE MonAn SET TenMon = ?, "
            + "LoaiMon = ?, DonViTinh = ?, GiaTien = ?, SoLuong = ?, Hinh = ? WHERE MaMA = ?";
    String DELETE_SQL = "DELETE FROM MonAn WHERE MaMA = ?";
    String SELECT_BY_ID_SQL = "SELECT * FROM MonAn WHERE MaMA = ?";
    String SELECT_LOAI_MON = "select MaLoai\n"
            + "from LoaiMon";
    String select_byKey = "SELECT * FROM MonAn where TenMon like ?";
    String select_bymaloai = "select * from LoaiMon\n"
            + "where MaLoai = ?";

    public void insert(MonAn monAn) {
        JdbcHelper.update(INSERT_SQL, monAn.getMaMA(), monAn.getTenMon(), monAn.getLoaiMon(),
                monAn.getDonViTinh(), monAn.getGiaTien(), monAn.getSoLuong(), monAn.getHinh());
    }

    public void update(MonAn monAn) {
        JdbcHelper.update(UPDATE_SQL, monAn.getTenMon(), monAn.getLoaiMon(), monAn.getDonViTinh(),
                monAn.getGiaTien(), monAn.getSoLuong(), monAn.getHinh(), monAn.getMaMA());
    }

    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    public List<MonAn> selectBYSQL(String sql, Object... args) {
        List<MonAn> list = new ArrayList<MonAn>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                MonAn monAn = new MonAn();
                monAn.setMaMA(rs.getString("MaMA"));
                monAn.setTenMon(rs.getString("TenMon"));
                monAn.setLoaiMon(rs.getInt("LoaiMon"));
                monAn.setDonViTinh(rs.getString("DonViTinh"));
                monAn.setGiaTien(rs.getDouble("GiaTien"));
                monAn.setSoLuong(rs.getInt("SoLuong"));
                monAn.setHinh(rs.getString("Hinh"));
                list.add(monAn);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public MonAn selectByID(String maMA) {
        List<MonAn> list = this.selectBYSQL(SELECT_BY_ID_SQL, maMA);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<MonAn> selectALL() {
        return this.selectBYSQL(SELECT_ALL_SQL);
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

    public static void main(String[] args) {
        MonAnDAO dao = new MonAnDAO();
        List<MonAn> list = dao.selectALL();

        System.out.println(dao.selectByTenMon("7 Up"));

    }

    public List<MonAn> selectByKeyword(String key) {
        return selectBYSQL(select_byKey, "%" + key + "%");
    }

    public List<MonAn> selectByTenLoai(int maloai) {
        String sql = "select *\n"
                + "from MonAn\n"
                + "where LoaiMon = ?";
        return this.selectBYSQL(sql, maloai);
    }

    public List<MonAn> selectByTenMon(String tenMon) {
        String sql = "select  hd.MaHD, ma.TenMon, ct.SoLuong, sum(ct.SoLuong * ma.GiaTien) as 'Thành tiền', hd.NgayXuat \n"
                + "from HoaDon hd, ChiTietHoaDon ct, MonAn ma\n"
                + "where hd.MaHD = ct.MaHD and ct.MaMA = ma.MaMA and ma.TenMon = ?\n"
                + "group by hd.MaHD, TenMon, ct.SoLuong, NgayXuat";
        return this.selectBYSQL(sql, tenMon);
    }

    public List<Object[]> getTenMon(String tenmon) {
        String sql = "{CALL tenmon(?)}";
        String[] cols = {"MaHD", "TenMon", "SoLuong", "Thành tiền", "NgayXuat"};
        return getListOfArray(sql, cols, tenmon);
    }

    
}
