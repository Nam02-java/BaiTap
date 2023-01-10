package Bai09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.Them thong tin ho su dung dien " + "\n" +
                    "2.xoa thong tin ho su dung dien " + "\n" +
                    "3.sua thong tin ho su dung dien " + "\n" +
                    "4.tinh tien dien cho moi ho gia dinh");
            System.out.println("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.println("ho ten : ");
                    String hoTen = new Scanner(System.in).nextLine();
                    System.out.println("so nha : ");
                    String soNha = new Scanner(System.in).nextLine();
                    System.out.println("ma so cong to dien : ");
                    String maSoCongToDien = new Scanner(System.in).nextLine();
                    System.out.println("chi so dien cu : ");
                    String chiSoDienCu = new Scanner(System.in).nextLine();
                    System.out.println("chi so moi : ");
                    String chiSoMoi = new Scanner(System.in).nextLine();
                    System.out.println("so tien phai tra : ");
                    String soTienPhaiTra = new Scanner(System.in).nextLine();
                    BienLai bienLai = new BienLai(new KhachHang(hoTen, soNha, maSoCongToDien)
                            , chiSoDienCu, chiSoMoi, soTienPhaiTra);
                    QuanLy.themHoGiaDinh(bienLai);
                    break;
                case "2":
                    System.out.println("Nhap so nha de xoa  : ");
                    soNha = new Scanner(System.in).nextLine();
                    QuanLy.xoaThongTin(soNha);
                    break;
                case "3":
                    System.out.println("Nhap so nha de sua thong tin : ");
                    soNha = new Scanner(System.in).nextLine();
                    QuanLy.suaThongTin(soNha);
                    break;
                case "4":
                    System.out.println("Nhap so nha de tinh tien dien : ");
                    soNha = new Scanner(System.in).nextLine();
                    QuanLy.tinhTienDien(soNha);
                    break;
                default:
                    System.out.println("sai lua chon");
                    break;
            }
        }
    }
}
