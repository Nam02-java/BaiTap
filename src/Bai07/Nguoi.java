package Bai07;

public class Nguoi {
    private String hoTen, tuoi, queQuan, maSoGiaoVien;
    private int luongCuong, luongThuong, tienPhat, luongThucLinh;

    public Nguoi(String hoTen, String tuoi, String queQuan, String maSoGiaoVien, int luongCuong, int luongThuong, int tienPhat, int luongThucLinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maSoGiaoVien = maSoGiaoVien;
        this.luongCuong = luongCuong;
        this.luongThuong = luongThuong;
        this.tienPhat = tienPhat;
        this.luongThucLinh = luongThucLinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMaSoGiaoVien() {
        return maSoGiaoVien;
    }

    public void setMaSoGiaoVien(String maSoGiaoVien) {
        this.maSoGiaoVien = maSoGiaoVien;
    }

    public int getLuongCuong() {
        return luongCuong;
    }

    public void setLuongCuong(int luongCuong) {
        this.luongCuong = luongCuong;
    }

    public int getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(int luongThuong) {
        this.luongThuong = luongThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(int luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", queQuan='" + queQuan + '\'' +
                ", maSoGiaoVien='" + maSoGiaoVien + '\'' +
                ", luongCuong=" + luongCuong +
                ", luongThuong=" + luongThuong +
                ", tienPhat=" + tienPhat +
                ", luongThucLinh=" + luongThucLinh +
                '}';
    }
}
