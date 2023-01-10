package Bai03;

import java.util.ArrayList;

public class TuyenSinh {
    public static ArrayList<ThongTin> arrayList = new ArrayList<>();

    public void themThiSinh(ThongTin thongTin) {
        this.arrayList.add(thongTin);
    }

    public  void hienThiTatCa() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof Khoi) {
                System.out.println(arrayList.get(i));
            } else {
            }
        }
    }

    public void timKiemTheoSoBaoDanh(int soBaoDanh) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (Integer.parseInt(arrayList.get(i).getSoBaoDanh())==soBaoDanh) {
                if (arrayList.get(i) instanceof Khoi) {
                    System.out.println(arrayList.get(i));
                }
            }
        }
    }
}
