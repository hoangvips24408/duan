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
public class LoaiMonAn {
    public int MaLoai;
    public String TenLoai;

    public LoaiMonAn() {
    }

    public LoaiMonAn(int MaLoai, String TenLoai) {
        this.MaLoai = MaLoai;
        this.TenLoai = TenLoai;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    @Override
    public String toString() {
        return "" + TenLoai;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.MaLoai;
        hash = 97 * hash + Objects.hashCode(this.TenLoai);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LoaiMonAn other = (LoaiMonAn) obj;
        if (this.MaLoai != other.MaLoai) {
            return false;
        }
        if (!Objects.equals(this.TenLoai, other.TenLoai)) {
            return false;
        }
        return true;
    }

    
    
    
}
