/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.LoaiMonAn;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import utils.JdbcHelper;

/**
 *
 * @author lenovo
 */
public class LoaiMonDAO {

    String SELECT_MALOAI = "select MaLoai\n"
            + "from LoaiMon";
    String SELECT_ALL_SQL = "select * from LoaiMon";

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
}
