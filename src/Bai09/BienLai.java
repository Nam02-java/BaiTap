package Bai09;

public class BienLai {
    KhachHang khachHang;
    private String chiSoDienCu, chiSoMoi, soTienPhaiTra;

    public BienLai(KhachHang khachHang, String chiSoDienCu, String chiSoMoi, String soTienPhaiTra) {
        this.khachHang = khachHang;
        this.chiSoDienCu = chiSoDienCu;
        this.chiSoMoi = chiSoMoi;
        this.soTienPhaiTra = soTienPhaiTra;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public String getChiSoDienCu() {
        return chiSoDienCu;
    }

    public void setChiSoDienCu(String chiSoDienCu) {
        this.chiSoDienCu = chiSoDienCu;
    }

    public String getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(String chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public String getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(String soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    @Override
    public String toString() {
        return
                "ChiSoDienCu='" + chiSoDienCu + '\'' +
                        ", chiSoMoi='" + chiSoMoi + '\'' +
                        ", soTienPhaiTra='" + soTienPhaiTra + '\'' +
                        '}';
    }
}

