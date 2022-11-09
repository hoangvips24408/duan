package Entity;

/**
 *
 * @author Admin
 */
public class MonAn {

    String MaMA;
    String TenMon;
    String LoaiMon;
    String DonViTinh;
    float GiaTien;
    int SoLuong;
    String Hinh;

    public MonAn() {
    }

    public MonAn(String MaMA, String TenMon, String LoaiMon, String DonViTinh, float GiaTien, int SoLuong, String Hinh) {
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

    public String getLoaiMon() {
        return LoaiMon;
    }

    public void setLoaiMon(String LoaiMon) {
        this.LoaiMon = LoaiMon;
    }

    public String getDonViTinh() {
        return DonViTinh;
    }

    public void setDonViTinh(String DonViTinh) {
        this.DonViTinh = DonViTinh;
    }

    public float getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(float GiaTien) {
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
    
}
