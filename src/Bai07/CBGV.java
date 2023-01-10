package Bai07;

import java.util.ArrayList;

public class CBGV extends Nguoi {

    public static ArrayList<Nguoi> arrayList = new ArrayList<>();
    static int tinhLuongThuc ;

    public CBGV(String hoTen, String tuoi, String queQuan, String maSoGiaoVien, int luongCuong, int luongThuong, int tienPhat, int luongThucLinh) {
        super(hoTen, tuoi, queQuan, maSoGiaoVien, luongCuong, luongThuong, tienPhat, luongThucLinh);
    }

    public static void themGiaoVien(Nguoi nguoi) {
        arrayList.add(nguoi);
    }

    public static void xoaGiaoVienTheoMaSo(String maSo) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getMaSoGiaoVien().equals(maSo)) {
                arrayList.remove(i);
            }
        }
    }

    public static void tinhLuongThuc(String maSo) {
        for (int i =0 ; i < arrayList.size();i++){
            if (arrayList.get(i).getMaSoGiaoVien().equals(maSo)) {
                 tinhLuongThuc = arrayList.get(i).getLuongCuong()+
                        arrayList.get(i).getLuongThuong() -
                        arrayList.get(i).getTienPhat();
                 arrayList.get(i).setLuongThucLinh(tinhLuongThuc);
                System.out.println(arrayList.get(i).getLuongThucLinh());
            }
        }
    }
}
