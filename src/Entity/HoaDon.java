package Entity;

/**
 *
 * @author Admin
 */
public class HoaDon {

    int MaHD;
    String NgayXuat;
    float TongTien;
    String MaNV;
    String MaKH;

    public HoaDon() {
    }

    public HoaDon(int MaHD, String NgayXuat, float TongTien, String MaNV, String MaKH) {
        this.MaHD = MaHD;
        this.NgayXuat = NgayXuat;
        this.TongTien = TongTien;
        this.MaNV = MaNV;
        this.MaKH = MaKH;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    @Override
    public String toString() {
        return "" +MaHD;
    }
    
    
    
}
