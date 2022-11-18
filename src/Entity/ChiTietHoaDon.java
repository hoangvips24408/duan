package Entity;

/**
 *
 * @author Admin
 */
public class ChiTietHoaDon {

    int MaHD;
    String MaMA;
    int SoLuong;
    float ThanhTien;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int MaHD, String MaMA, int SoLuong, float ThanhTien) {
        this.MaHD = MaHD;
        this.MaMA = MaMA;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaMA() {
        return MaMA;
    }

    public void setMaMA(String MaMA) {
        this.MaMA = MaMA;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public void getMaHD(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
