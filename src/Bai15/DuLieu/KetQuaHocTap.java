package Bai15.DuLieu;

public class KetQuaHocTap {
    private String tenHocKy;
    private int diemTBHK;

    public KetQuaHocTap(String tenHocKy, int diemTBHK) {
        this.tenHocKy = tenHocKy;
        this.diemTBHK = diemTBHK;
    }

    public String getTenHocKy() {
        return tenHocKy;
    }

    public void setTenHocKy(String tenHocKy) {
        this.tenHocKy = tenHocKy;
    }

    public int getDiemTBHK() {
        return diemTBHK;
    }

    public void setDiemTBHK(int diemTBHK) {
        this.diemTBHK = diemTBHK;
    }

    @Override
    public String toString() {
        return "KetQuaHocTap{" +
                "tenHocKy='" + tenHocKy + '\'' +
                ", diemTBHK=" + diemTBHK +
                '}';
    }
}