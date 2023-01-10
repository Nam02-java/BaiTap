package Bai02;

import java.util.ArrayList;
import java.util.Scanner;

import static Bai02.QuanLySach.arrayList;

public class Main {

    public static void main(String[] args) {
        QuanLySach quanLySach = new QuanLySach();

        while (true) {
            System.out.println("\n" + "1.Them moi tai lieu : sach , tap chi , bao" + "\n" +
                    "2.Xoa tai lieu theo ma tai lieu" + "\n" +
                    "3.Hien thi thong tin ve tai lieu" + "\n" +
                    "4.Tim kiem tai lieu theo loai : sach , tap chi , bao" + "\n" +
                    "5.Thoat khoi chuong trinh");
            System.out.print("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.println("\n" + "1.Sach" + "\n" + "2.Tap chi"
                            + "\n" + "3.Bao");
                    choose = new Scanner(System.in).nextLine();
                    switch (choose) {
                        case "1":
                            System.out.print("Ma tai lieu: ");
                            String maTaiLieu = new Scanner(System.in).nextLine();
                            System.out.print("Nha xuat ban:");
                            String nhaXuatBan = new Scanner(System.in).nextLine();
                            System.out.print("So ban phat hanh: ");
                            String soBanPhatHanh = new Scanner(System.in).nextLine();
                            System.out.print("Ten tac gia: ");
                            String tenTacGia = new Scanner(System.in).nextLine();
                            System.out.print("So trang: ");
                            String soTrang = new Scanner(System.in).nextLine();
                            ThuocTinhSach sach = new Sach(maTaiLieu, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
                            quanLySach.themMoiTaiLieu(sach);
                            break;
                        case "2":
                            System.out.print("Ma tai lieu: ");
                            maTaiLieu = new Scanner(System.in).nextLine();
                            System.out.print("Nha xuat ban:");
                            nhaXuatBan = new Scanner(System.in).nextLine();
                            System.out.print("So ban phat hanh: ");
                            soBanPhatHanh = new Scanner(System.in).nextLine();
                            System.out.print("So phat hanh: ");
                            String soPhatHanh = new Scanner(System.in).nextLine();
                            System.out.print("Thang phat hanh: ");
                            String thangPhatHanh = new Scanner(System.in).nextLine();
                            ThuocTinhSach tapChi = new TapChi(maTaiLieu, nhaXuatBan, soPhatHanh, soPhatHanh, thangPhatHanh);
                            quanLySach.themMoiTaiLieu(tapChi);
                            break;
                        case "3":
                            System.out.print("Ma tai lieu: ");
                            maTaiLieu = new Scanner(System.in).nextLine();
                            System.out.print("Nha xuat ban:");
                            nhaXuatBan = new Scanner(System.in).nextLine();
                            System.out.print("So ban phat hanh: ");
                            soBanPhatHanh = new Scanner(System.in).nextLine();
                            System.out.print("Ngay phat hanh: ");
                            String ngayPhatHanh = new Scanner(System.in).nextLine();
                            ThuocTinhSach bao = new Bao(maTaiLieu, nhaXuatBan, soBanPhatHanh, ngayPhatHanh);
                            quanLySach.themMoiTaiLieu(bao);
                            break;
                        default:
                            break;
                    }
                    break;
                case "2":
                    System.out.print("\n" + "Nhap ma tai lieu de xoa : ");
                    choose = new Scanner(System.in).nextLine();
                    quanLySach.xoaTaiLieu(Integer.parseInt(choose));
                    break;
                case "3":
                    quanLySach.hienThiTatCa();
                    break;
                case "4":
                    System.out.println("\n" + "1.Sach " + "\n" + "2.Tap chi " + "\n" +"3.Bao " );
                    System.out.print("Nhap: ");
                    choose = new Scanner(System.in).nextLine();
                    switch (choose){
                        case "1":
                            quanLySach.timSach();
                            break;
                        case"2":
                            quanLySach.timTapChi();
                            break;
                        case"3":
                            quanLySach.timBao();
                            break;
                    }
                    break;
                case"5":
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Sai lua chon");
                    break;
            }
        }
    }
}
