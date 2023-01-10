package Bai09;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {

    static ArrayList<BienLai> arrayList = new ArrayList<>();

    public static void themHoGiaDinh(BienLai bienLai) {
        arrayList.add(bienLai);
    }

    public static void xoaThongTin(String soNha) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).khachHang.getSoNha().equals(soNha)) {
                arrayList.remove(i);
            }
        }
    }

    public static void suaThongTin(String soNha) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).khachHang.getSoNha().equals(soNha)) {
                System.out.println("1.sua ten " + "\n" + "2.sua so nha "
                );
                String choose = new Scanner(System.in).nextLine();
                switch (choose) {
                    case "1":
                        System.out.println("nhap ten moi : ");
                        String tenMoi = new Scanner(System.in).nextLine();
                        arrayList.get(i).khachHang.setHoTen(tenMoi);
                        break;
                    case "2":
                        System.out.println("nhap so nha moi : ");
                        String soNhaMoi = new Scanner(System.in).nextLine();
                        arrayList.get(i).khachHang.setSoNha(soNhaMoi);
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static void tinhTienDien(String soNha) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).khachHang.getSoNha().equals(soNha)) {
                int tienDien = Integer.parseInt(arrayList.get(i).getChiSoMoi()) -
                        Integer.parseInt(arrayList.get(i).getChiSoDienCu()) * 5;
                System.out.println("tien dien cua so nha " + soNha + " la : " + tienDien);
            }
        }
    }
}
