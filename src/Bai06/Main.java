package Bai06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<HocSinh> arrayList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("1.them hs moi " + "\n" +
                    "2.hien thi thong tin cua moi hs" + "\n" +
                    "3.hien thi cac hs 20 tuoi" + "\n" +
                    "4.cho biet so luong cac hoc sinh co tuoi 23 va que o dn");
            System.out.println("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.println("hoTen : ");
                    String hoTen = new Scanner(System.in).nextLine();
                    System.out.println("tuoi : ");
                    String tuoi = new Scanner(System.in).nextLine();
                    System.out.println("que quan : ");
                    String queQuan = new Scanner(System.in).nextLine();
                    HocSinh hocSinh = new HocSinh(hoTen, tuoi, queQuan);
                    themHocSinh(hocSinh);
                    break;
                case "2":
                    hienThiThongTinMoiHS();
                    break;
                case "3":
                    hienThiHS20tuoi();
                    break;
                case "4":
                    soLuongHs23tuoiVaQueODN();
                    break;
                default:
                    System.out.println("sai lua chon");
                    break;
            }
        }
    }

    public static void themHocSinh(HocSinh hocSinh) {
        arrayList.add(hocSinh);
    }

    public static void hienThiThongTinMoiHS() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void hienThiHS20tuoi() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (Integer.parseInt(arrayList.get(i).getTuoi()) == 20) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    public static void soLuongHs23tuoiVaQueODN() {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (Integer.parseInt(arrayList.get(i).getTuoi()) == 23) {
                if (arrayList.get(i).getQueQuan().equals("dn")) {
                    count += 1;
                }
            }
        }
        System.out.println("so luong hs 23 tuoi + que o dn : " + count);
    }
}
