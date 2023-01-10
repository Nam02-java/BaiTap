package Bai15.DuLieu;

import java.util.ArrayList;
import java.util.List;

public class Khoa {
    private String tenKhoa;
    private List<ThongTinSV> thongTinSVArrayList = new ArrayList<>();

    public Khoa(String tenKhoa, List<ThongTinSV> thongTinSVArrayList) {
        this.tenKhoa = tenKhoa;
        this.thongTinSVArrayList = thongTinSVArrayList;
    }

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }

    public List<ThongTinSV> getThongTinSVArrayList() {
        return thongTinSVArrayList;
    }

    public void setThongTinSVArrayList(List<ThongTinSV> thongTinSVArrayList) {
        this.thongTinSVArrayList = thongTinSVArrayList;
    }

    @Override
    public String toString() {
        return "Khoa{" +
                "tenKhoa='" + tenKhoa + '\'' +
                ", thongTinSVArrayList=" + thongTinSVArrayList +
                '}';
    }
}