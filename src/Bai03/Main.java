package Bai03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("\n" + "1.Them moi thi sinh" + "\n" +
                    "2.Hien thi thong tin cua thi sinh va khoi thi cua thi sinh" + "\n" +
                    "3.Tim kiem theo so bao danh" + "\n" +
                    "4.Thoat khoi chuong trinh");
            System.out.print("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.print("\n" + "Khoi : ");
                    String khoi = new Scanner(System.in).nextLine();
                    System.out.print("So bao danh : ");
                    String soBaoDanh = new Scanner(System.in).nextLine();
                    System.out.print("Ho ten : ");
                    String hoTen = new Scanner(System.in).nextLine();
                    System.out.print("Dia chi :");
                    String diaChi = new Scanner(System.in).nextLine();
                    System.out.print("Muc uu tien : ");
                    String mucUuTien = new Scanner(System.in).nextLine();
                    ThongTin thongTin = new Khoi(soBaoDanh, hoTen, diaChi, mucUuTien,khoi);
                    tuyenSinh.themThiSinh(thongTin);
                    break;
                case "2":
                    tuyenSinh.hienThiTatCa();
                    break;
                case "3":
                    System.out.print("\n" + "Nhap : ");
                    choose = new Scanner(System.in).nextLine();
                    tuyenSinh.timKiemTheoSoBaoDanh(Integer.parseInt(choose));
                    break;
                case "4":
                    System.out.println("bye");
                    return;
                default:
                    System.out.println("sai lua chon");
                    break;
            }
        }
    }
}
