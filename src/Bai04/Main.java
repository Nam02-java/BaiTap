package Bai04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<HoGiaDinh> arrayList_HoGiaDinh = new ArrayList<>();
    static ArrayList<Nguoi> arrayList_Nguoi = new ArrayList<>();
    static int count = 0;

    public static void main(String[] args) {
        System.out.print("\n" + "n ho dan : ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("\n" + "so thanh vien : ");
            int soThanhVien = new Scanner(System.in).nextInt();
            System.out.print("\n" + "so nha : ");
            String soNha = new Scanner(System.in).nextLine();
            for (int j = 1; j <= soThanhVien; j++) {
                System.out.print("\n" + "ho ten :");
                String hoTen = new Scanner(System.in).nextLine();
                System.out.print("\n" + "tuoi :");
                int tuoi = new Scanner(System.in).nextInt();
                System.out.print("\n" + "nghe nghiep :");
                String ngheNghiep = new Scanner(System.in).nextLine();
                System.out.print("\n" + "soCMND :");
                String soCMND = new Scanner(System.in).nextLine();
                arrayList_Nguoi.add(new Nguoi(hoTen, tuoi, ngheNghiep, soCMND));
                count = arrayList_Nguoi.size();
            }


            arrayList_HoGiaDinh.add(new HoGiaDinh(soThanhVien, soNha, arrayList_Nguoi));
        }
        System.out.println("\n" + "thong tin cac ho trong khu pho : ");
        for (int i = 0; i < arrayList_HoGiaDinh.size(); i++) {
            System.out.println(arrayList_HoGiaDinh.get(i));
        }
    }
}
