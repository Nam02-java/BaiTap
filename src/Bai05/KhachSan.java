package Bai05;

import java.util.ArrayList;

public class KhachSan extends Nguoi {

    private int soNgayThue;
    protected  String Phong ;

    public KhachSan(String hoTen, int tuoi, String soCMND, int soNgayThue, String phong) {
        super(hoTen, tuoi, soCMND);
        this.soNgayThue = soNgayThue;
        Phong = phong;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public String getPhong() {
        return Phong;
    }

    public void setPhong(String phong) {
        Phong = phong;
    }

    @Override
    public String toString() {
        return "so ngay thue =" + soNgayThue + "\n"
                + "phong=" + Phong ;

    }
}
