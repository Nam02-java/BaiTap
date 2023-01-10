package Bai08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.them sinh vien  " + "\n" + "2.xoa theo ma phieu" + "\n" +
                    "3.hien thi thong tin cac the muon");
            System.out.println("nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.println("ho ten : ");
                    String hoTen = new Scanner(System.in).nextLine();
                    System.out.println("tuoi : ");
                    String tuoi = new Scanner(System.in).nextLine();
                    System.out.println("lop : ");
                    String lop = new Scanner(System.in).nextLine();
                    System.out.println("ma phieu : ");
                    String maPhieu = new Scanner(System.in).nextLine();
                    System.out.println("ngay muon : ");
                    String ngayMuon = new Scanner(System.in).nextLine();
                    System.out.println("han tra: ");
                    String hanTra = new Scanner(System.in).nextLine();
                    System.out.println("so hieu sach : ");
                    String soHieuSach = new Scanner(System.in).nextLine();
                    SinhVien sinhVien = new TheMuon(hoTen, tuoi, lop, maPhieu, ngayMuon, hanTra, soHieuSach);
                    QuanLy.themSinhVien(sinhVien);
                    break;
                case "2":
                    System.out.println("Nhap ma phieu de xoa : ");
                    maPhieu = new Scanner(System.in).nextLine();
                    QuanLy.xoaTheoMaPhieu(maPhieu);
                    break;
                case "3":
                    QuanLy.hienThiThongTin();
                    break;
                default:
                    System.out.println("sai lua chon");
                    break;
            }
        }
    }
}
