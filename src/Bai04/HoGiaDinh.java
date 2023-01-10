package Bai04;

import java.util.ArrayList;

public class HoGiaDinh extends Nguoi {
    private int soThanhVien ;
    private String soNha;
    private ArrayList<Nguoi> arrayList;


    public HoGiaDinh(String hoTen, int tuoi, String ngheNghiep, String soCMND, int soThanhVien, String soNha, ArrayList<Nguoi> arrayList) {
        super(hoTen, tuoi, ngheNghiep, soCMND);
        this.soThanhVien = soThanhVien;
        this.soNha = soNha;
        this.arrayList = arrayList;
    }

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public ArrayList<Nguoi> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Nguoi> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "soThanhVien=" + soThanhVien +
                ", soNha='" + soNha + '\'' +
                ", arrayList=" + arrayList +
                '}';
    }
}