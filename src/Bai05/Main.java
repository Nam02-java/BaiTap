package Bai05;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final int giaPhongA = 500;
    private static final int giaPhongB = 300;
    private static final int giaPhongC = 100;

    static ArrayList<Nguoi> arrayList = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n" + "1.them khach" + "\n" + "2.xoa khach theo soCMND" + "\n"
                    + "3.tinh tien thue phong");
            System.out.print("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.print("\n" + "so ngay thue : ");
                    int soNgayThue = new Scanner(System.in).nextInt();
                    System.out.print("\n" + "loai phong : ");
                    String loaiPhong = new Scanner(System.in).nextLine();
                    System.out.print("\n" + "ho ten : ");
                    String hoTen = new Scanner(System.in).nextLine();
                    System.out.print("\n" + "tuoi : ");
                    int tuoi = new Scanner(System.in).nextInt();
                    System.out.print("\n" + "soCMND: ");
                    String soCMND = new Scanner(System.in).nextLine();
                    Nguoi nguoi = new KhachSan(hoTen, tuoi, soCMND, soNgayThue, loaiPhong);
                    arrayList.add(nguoi);
                    break;
                case "2":
                    System.out.print("\n" + "so cmnd : ");
                    int xoaBang_soCMND = new Scanner(System.in).nextInt();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (Integer.valueOf(arrayList.get(i).getSoCMND()) == xoaBang_soCMND) {
                            arrayList.remove(i);
                        }
                    }
                    break;
                case "3":
                    System.out.print("\n" + "so cmnd : ");
                    int tinhTienBang_soCMND = new Scanner(System.in).nextInt();
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (arrayList.get(i) instanceof KhachSan) {
                            if (((KhachSan) arrayList.get(i)).getPhong().equals("A")) {
                                System.out.println(((KhachSan) arrayList.get(i)).getSoNgayThue() *500);
                            } else if (((KhachSan) arrayList.get(i)).getPhong().equals("B")) {
                                System.out.println(((KhachSan) arrayList.get(i)).getSoNgayThue() *300);
                            } else if (((KhachSan) arrayList.get(i)).getPhong().equals("C")) {
                                System.out.println(((KhachSan) arrayList.get(i)).getSoNgayThue() *100);

                            }
                        } else {
                        }
                    }
                    break;
            }
        }
    }
}
