package Bai08;

public class TheMuon extends SinhVien{
    private String maPhieu , ngayMuon , hanTra, soHieuSach;


    public TheMuon(String hoTen, String tuoi, String lop, String maPhieu, String ngayMuon, String hanTra, String soHieuSach) {
        super(hoTen, tuoi, lop);
        this.maPhieu = maPhieu;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "maPhieu='" + maPhieu + '\'' +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanTra='" + hanTra + '\'' +
                ", soHieuSach='" + soHieuSach + '\'' +
                '}';
    }
}
