package Bai11;

import java.util.Scanner;

public class Main {
    // Thuoc tinh
    private double a;
    private double b;

    public Main() {
        a = 0;
        b = 0;
    }


    public Main(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public void nhap(Scanner sc) {
        System.out.print("\tNhap vao phan thuc: ");
        a = sc.nextDouble();
        System.out.print("\tNhap vao phan ao: ");
        b = sc.nextDouble();
    }

    public void hienThi() {
        if (b < 0) {
            System.out.println(a + " - " + Math.abs(b) + "*i");
        } else {
            System.out.println(a + " + " + b + "*i");
        }
    }

    public Main congSP(Main sp2) {
        double thuc = a + sp2.a;
        double ao = b + sp2.b;
        return new Main(thuc, ao);
    }

    public Main truSP(Main sp2) {
        double thuc = a - sp2.a;
        double ao = b - sp2.b;
        return new Main(thuc, ao);
    }

    public Main nhanSP(Main sp2) {
        double thuc = a * sp2.a - b * sp2.b;
        double ao = a * sp2.b + sp2.a * b;
        return new Main(thuc, ao);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main sp1 = new Main();
        Main sp2 = new Main();
        Main spThuong = new Main();

        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap(sc);
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap(sc);

        System.out.println("So phuc 1 la:");
        sp1.hienThi();
        System.out.println("So phuc 2 la:");
        sp2.hienThi();


        // Hien thi
        System.out.println("Ket qua cua phep chia sp1 cho sp2 la:");
        spThuong.hienThi();

        sc.close();
    }
}