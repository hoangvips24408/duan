package Entity;

/**
 *
 * @author Admin
 */
public class LoaiMon {

    String TenLoai;
    int MaLoai;

    public LoaiMon() {
    }

    public LoaiMon(String TenLoai, int MaLoai) {
        this.TenLoai = TenLoai;
        this.MaLoai = MaLoai;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }

    public int getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(int MaLoai) {
        this.MaLoai = MaLoai;
    }
    
}
