package Bai07;

import java.util.Scanner;

import static Bai07.CBGV.arrayList;

public class Main {
    public static void main(String[] args) {
        while (true) {

            System.out.println("1.them gv " + "\n" + "2.xoa giao vien theo ma so"
                    + "\n" + "3.tinh luong thuc linh cho giao vien");
            System.out.println("nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.println("ten : ");
                    String ten = new Scanner(System.in).nextLine();
                    System.out.println("tuoi : ");
                    String tuoi = new Scanner(System.in).nextLine();
                    System.out.println("que quan : ");
                    String queQuan = new Scanner(System.in).nextLine();
                    System.out.println("maSo : ");
                    String maSo = new Scanner(System.in).nextLine();
                    System.out.println("luong cung : ");
                    int luongCung = new Scanner(System.in).nextInt();
                    System.out.println("luong thuong : ");
                    int luongThuong = new Scanner(System.in).nextInt();
                    System.out.println("tien Phat : ");
                    int tienPhat = new Scanner(System.in).nextInt();
                    System.out.println("luong thuc linh : ");
                    int luongThucLinh = new Scanner(System.in).nextInt();
                    Nguoi nguoi = new CBGV(ten, tuoi, queQuan, maSo, luongCung, luongThuong, tienPhat, luongThucLinh);
                    CBGV.themGiaoVien(nguoi);
                    break;
                case "2":
                    System.out.println("nhap ma so : ");
                    maSo = new Scanner(System.in).nextLine();
                    CBGV.xoaGiaoVienTheoMaSo(maSo);
                    break;
                case "3":
                    System.out.println("Nhap ma so gv muon tinh luong thuc : ");
                    maSo = new Scanner(System.in).nextLine();
                    CBGV.tinhLuongThuc(maSo);
                    break;
                default:
                    System.out.println("sai");
                    break;
            }
        }
    }
}
