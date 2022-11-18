/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.KhuyenMai;
import java.util.ArrayList;
import java.util.List;
import utils.JdbcHelper;
import java.sql.ResultSet;

/**
 *
 * @author Quan
 */
public class KhuyenMaiDAO {

    final String GET_ALL = "select * from KhuyenMai";
    String INSERT_SQL = "insert into KhuyenMai values (?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "update KhuyenMai set TenKM = ?, NgayBatDau = ?, NgayKetThuc = ?, Hinh = ?, GiaKhuyenMai = ? where MaKM = ?";
    String DELETE_SQL = "DELETE FROM KhuyenMai WHERE MaKM = ?";
    String SELECT_BY_ID_SQL = "SELECT * FROM KhuyenMai WHERE MaKM = ?";

    public List<KhuyenMai> selectBySql(String sql, Object... args) {
        List<KhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            while (rs.next()) {
                KhuyenMai entity = new KhuyenMai();
                entity.setMaKM(rs.getString("MaKM"));
                entity.setTenKM(rs.getString("TenKM"));
                entity.setNgayBD(rs.getString("NgayBatDau"));
                entity.setNgayKT(rs.getString("NgayKetThuc"));
                entity.setHinh(rs.getString("Hinh"));
                entity.setGiaKhuyenMai(rs.getString("GiaKhuyenMai"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<KhuyenMai> selectAll() {
        return selectBySql(GET_ALL);
    }

    public void insert(KhuyenMai khuyenMai) {
        JdbcHelper.update(INSERT_SQL, khuyenMai.getMaKM(), khuyenMai.getTenKM(), khuyenMai.getNgayBD(),
                khuyenMai.getNgayKT(), khuyenMai.getHinh(), khuyenMai.getGiaKhuyenMai());
    }

    public void update(KhuyenMai km) {
        JdbcHelper.update(UPDATE_SQL, km.getTenKM(), km.getNgayBD(), km.getNgayKT(), km.getHinh(), km.getGiaKhuyenMai(), km.getMaKM());
    }

    public void delete(String id) {
        JdbcHelper.update(DELETE_SQL, id);
    }

    public KhuyenMai selectByID(String maKM) {
        List<KhuyenMai> list = this.selectBySql(SELECT_BY_ID_SQL, maKM);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
