/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Objects;

/**
 *
 * @author lenovo
 */
public class MonAn {

    public String MaMA;
    public String TenMon;
    public int LoaiMon;
    public String DonViTinh;
    public double GiaTien;
    public int SoLuong;
    public String Hinh;

    public MonAn() {
    }

    public MonAn(String MaMA, String TenMon, int LoaiMon, String DonViTinh, double GiaTien, int SoLuong, String Hinh) {
        this.MaMA = MaMA;
        this.TenMon = TenMon;
        this.LoaiMon = LoaiMon;
        this.DonViTinh = DonViTinh;
        this.GiaTien = GiaTien;
        this.SoLuong = SoLuong;
        this.Hinh = Hinh;
    }

    public String getMaMA() {
        return MaMA;
    }

    public void setMaMA(String MaMA) {
        this.MaMA = MaMA;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public int getLoaiMon() {
        return LoaiMon;
    }

    public void setLoaiMon(int LoaiMon) {
        this.LoaiMon = LoaiMon;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public double getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(double GiaTien) {
        this.GiaTien = GiaTien;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    @Override
    public String toString() {
        return "" + TenMon;
    }



}
