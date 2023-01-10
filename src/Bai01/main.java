package Bai01;

import java.util.Scanner;

public class main {
    static QLCB qlcb = new QLCB();
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.them can bo " + "\n" + "2.tim kiem theo ten" + "\n" +
                    "3.hien thi tat ca" + "\n" + "4.thoat chuong trinh");
            System.out.println("Nhap");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    qlcb.themCanBo();
                    break;
                case "2":
                    System.out.println("ten : ");
                    String ten = new Scanner(System.in).nextLine();
                    qlcb.timKiemTheoHoTen(ten);
                    break;
                case "3":
                    qlcb.hienThiTatCa();
                    break;
                case "4":
                    System.out.println("bye");
                    System.exit(0);
                default:
                    System.out.println("sai lua chon");
                    return;
            }
        }
    }
}
