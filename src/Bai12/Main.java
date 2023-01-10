package Bai12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.them xe " + "\n" +
                    "2.xoa theo id" + "\n" + "3.tim phuong tien theo hang sx , mau"
                    + "\n" + "4.thoat chuong trinh");
            System.out.println("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.println("id xe : ");
                    String id = new Scanner(System.in).nextLine();
                    System.out.println("hang sx : ");
                    String hangSX = new Scanner(System.in).nextLine();
                    System.out.println("nam sx : ");
                    String namSX = new Scanner(System.in).nextLine();
                    System.out.println("gia ban : ");
                    int giaBan = new Scanner(System.in).nextInt();
                    System.out.println("mau xe : ");
                    String mauXe = new Scanner(System.in).nextLine();
                    System.out.println("1.o to " + "\n" + "2.xe may" + "\n" + "3.xe tai");
                    System.out.println("Nhap : ");
                    choose = new Scanner(System.in).nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("so cho ngoi : ");
                            int soChoNgoi = new Scanner(System.in).nextInt();
                            System.out.println("kieu dong co :");
                            String kieuDongCo = new Scanner(System.in).nextLine();
                            PTGT ptgt_oTo = new Oto(id, hangSX, namSX, giaBan, mauXe, soChoNgoi, kieuDongCo);
                            QLPTGT.themXe(ptgt_oTo);
                            break;
                        case "2":
                            System.out.println("cong xuat : ");
                            int congXuat = new Scanner(System.in).nextInt();
                            PTGT ptgt_xeMay = new XeMay(id, hangSX, namSX, giaBan, mauXe, congXuat);
                            QLPTGT.themXe(ptgt_xeMay);
                            break;
                        case "3":
                            System.out.println("trong tai : ");
                            int trongTai = new Scanner(System.in).nextInt();
                            PTGT ptgt_xeTai = new XeTai(id, hangSX, namSX, giaBan, mauXe, trongTai);
                            QLPTGT.themXe(ptgt_xeTai);
                            break;

                        default:
                            break;
                    }
                    break;
                case "2":
                    System.out.println("Nhap id de xoa : ");
                    id = new Scanner(System.in).nextLine();
                    QLPTGT.xoaTheoID(id);
                    break;
                case "3":
                    System.out.println("1.hang sx " + "\n" + "2.mau xe");
                    System.out.println("Nhap : ");
                    choose = new Scanner(System.in).nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("hang sx : ");
                            hangSX = new Scanner(System.in).nextLine();
                            QLPTGT.timTheoHangSX(hangSX);
                            break;
                        case "2":
                            System.out.println("mau xe : ");
                            mauXe = new Scanner(System.in).nextLine();
                            QLPTGT.timTheoMau(mauXe);
                            break;
                    }
                    break;
                case "4":
                    System.out.println("bye");
                    return;
                case"5":
                    QLPTGT.filter();
                    break;
                default:
                    System.out.println("chon sai");
                    break;
            }
        }
    }
}