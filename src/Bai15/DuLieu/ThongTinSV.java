package Bai15.DuLieu;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ThongTinSV {
    private String heSV, maSV, hoTen;
    private LocalDate sinhNhat;
    private int namVaoHoc , diemDauVao;
    private List<KetQuaHocTap> ketQuaHocTapArrayList;


    public ThongTinSV(String heSV, String maSV, String hoTen, LocalDate sinhNhat, int namVaoHoc, int diemDauVao, List<KetQuaHocTap> ketQuaHocTapArrayList) {
        this.heSV = heSV;
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.sinhNhat = sinhNhat;
        this.namVaoHoc = namVaoHoc;
        this.diemDauVao = diemDauVao;
        this.ketQuaHocTapArrayList = ketQuaHocTapArrayList;
    }

    public String getHeSV() {
        return heSV;
    }

    public void setHeSV(String heSV) {
        this.heSV = heSV;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getSinhNhat() {
        return sinhNhat;
    }

    public void setSinhNhat(LocalDate sinhNhat) {
        this.sinhNhat = sinhNhat;
    }

    public int getNamVaoHoc() {
        return namVaoHoc;
    }

    public void setNamVaoHoc(int namVaoHoc) {
        this.namVaoHoc = namVaoHoc;
    }

    public int getDiemDauVao() {
        return diemDauVao;
    }

    public void setDiemDauVao(int diemDauVao) {
        this.diemDauVao = diemDauVao;
    }

    public List<KetQuaHocTap> getKetQuaHocTapArrayList() {
        return ketQuaHocTapArrayList;
    }

    public void setKetQuaHocTapArrayList(List<KetQuaHocTap> ketQuaHocTapArrayList) {
        this.ketQuaHocTapArrayList = ketQuaHocTapArrayList;
    }

    @Override
    public String toString() {
        return "ThongTinSV{" +
                "heSV='" + heSV + '\'' +
                ", maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", sinhNhat=" + sinhNhat +
                ", namVaoHoc=" + namVaoHoc +
                ", diemDauVao=" + diemDauVao +
                '}';
    }
}
