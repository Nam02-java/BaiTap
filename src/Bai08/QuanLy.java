package Bai08;

import java.util.ArrayList;

public class QuanLy {
    public static ArrayList<SinhVien> arrayList = new ArrayList<>();

    public static void themSinhVien(SinhVien sinhVien) {
        arrayList.add(sinhVien);
    }

    public static void xoaTheoMaPhieu(String maPhieu) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TheMuon) {
                if (((TheMuon) arrayList.get(i)).getMaPhieu().equals(maPhieu)) {
                    arrayList.remove(i);
                }
            }
        }
    }

    public static void hienThiThongTin() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
