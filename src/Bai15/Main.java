package Bai15;

import Bai15.CRUD.XuLyPhuongThuc;

import java.util.Scanner;

public class Main {
    static XuLyPhuongThuc xuLyPhuongThuc = new XuLyPhuongThuc();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n" + "1.them SV" + "\n" + "2.in tat ca SV" + "\n"
                    + "3.xac dinh sv chinh quy " + "\n" + "4.tinh diem TB cac mon dua vao HK cho truoc" + "\n"
                    + "5.tong so sv chinh quy cua khoa " + "\n" + "6.sv co diem vao cao nhat moi khoa" + "\n" +
                    "7.danh sach sv tai chuc theo noi lk dao tao cho truoc" + "\n" + "8.danh sach sv co diem TB o hk gan nhat"
                    + "\n" + "9.tim sv co diem TBHK cao nhat theo HK" + "\n" + "10.sort sv tang dan theo loai va giam dan theo nam hoc"
                    + "\n" + "11.thong ke luong sv theo nam hoc");
            System.out.println("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    xuLyPhuongThuc.themSV();
                    break;
                case "2":
                    xuLyPhuongThuc.tatCaThongTinSV();
                    break;
                case "3":
                    System.out.println("ma sv");
                    String masv = new Scanner(System.in).nextLine();
                    xuLyPhuongThuc.xacDinhHeSV(masv);
                    break;
                case "4":
                    System.out.println("ten HK : ");
                    String tenHK = new Scanner(System.in).nextLine();
                    xuLyPhuongThuc.diemTBHK(tenHK);
                    break;
                case "5":
                    xuLyPhuongThuc.tongSoSVChinhQuyCuaKhoa();
                    break;
                case "6":
                    xuLyPhuongThuc.svDiemDauVaoCaoNhatKhoa();
                    break;
                case "7":
                    System.out.println("noi lien ket : ");
                    String noiLK = new Scanner(System.in).nextLine();
                    xuLyPhuongThuc.timSVtaiChucTheo_noiLienKet(noiLK);
                    break;
                case "8":
                    xuLyPhuongThuc.timSVdatDiemTBTheoHKganNhat();
                    break;
                case "9":
                    System.out.println("Nhap HK : ");
                    String HK = new Scanner(System.in).nextLine();
                    xuLyPhuongThuc.timSVdiemHKcaoNhat(HK);
                    break;
                case "10":
                    xuLyPhuongThuc.sortSVtangDanTheoLoai_giamDanTheoNam();
                    break;
                case "11":
                    xuLyPhuongThuc.thongKeLuongSVtheoNamHoc();
                    break;
                default:
                    System.out.println("sai lua chon");
                    break;
            }
        }
    }
}
