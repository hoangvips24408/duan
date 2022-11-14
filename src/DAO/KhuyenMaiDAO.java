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
}
