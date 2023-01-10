package Bai01;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {

    static ArrayList<CanBo> canBoArrayList = new ArrayList<>();

    public static void themCanBo() {
        System.out.println("ho ten : ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("tuoi : ");
        String tuoi = new Scanner(System.in).nextLine();
        System.out.println("gioi tinh : ");
        String gioiTinh = new Scanner(System.in).nextLine();
        System.out.println("dia chi : ");
        String diaChi = new Scanner(System.in).nextLine();
        System.out.println("1.cong nhan  2.ky su  3.nhan vien ");
        String choose = new Scanner(System.in).nextLine();
        switch (choose) {
            case "1":
                System.out.println("bac exp : ");
                String bacEXP = new Scanner(System.in).nextLine();
                CanBo canBo_congNhan = new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bacEXP);
                canBoArrayList.add(canBo_congNhan);
                break;
            case "2":
                System.out.println("nghanh : ");
                String nghanh = new Scanner(System.in).nextLine();
                CanBo canBo_kySu = new KySu(hoTen, tuoi, gioiTinh, diaChi, nghanh);
                canBoArrayList.add(canBo_kySu);
                break;
            case "3":
                System.out.println("cong viec : ");
                String congViec = new Scanner(System.in).nextLine();
                CanBo canBo_nhanVien = new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec);
                canBoArrayList.add(canBo_nhanVien);
                break;
        }

    }

    public static void timKiemTheoHoTen(String hoTen) {
        for (int i = 0; i < canBoArrayList.size(); i++) {
            if (canBoArrayList.get(i).getHoTen().equalsIgnoreCase(hoTen)) {
                System.out.println(canBoArrayList.get(i));
            }
        }
    }

    public static void hienThiTatCa() {
        for (int i = 0; i < canBoArrayList.size(); i++) {
            System.out.println(canBoArrayList.get(i));
        }
    }
}
