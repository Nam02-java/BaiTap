package Bai14;

import Bai14.Function.method_action;
import Bai14.Information.*;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;

import static Bai14.Function.method_action.certificateArrayList;

public class Main {
    public static int count = 1;
    private static int index_certificateArrayList;

    public static void main(String[] args) {
        method_action method_action = new method_action();
        while (true) {
            System.out.print("\n" + "1.them nhan vien " + "\n" + "2.sua thong tin theo id" + "\n"
                    + "3.xoa thong tin theo id" + "\n" + "4.tim kiem theo loai nhan vien" + "\n"
                    + "5.tim kiem nv theo id" + "\n" + "6.hien thi tat ca nv");
            System.out.print("\n" + "Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    System.out.println("id : ");
                    String id = new Scanner(System.in).nextLine();
                    System.out.println("ho ten : ");
                    String hoTen = new Scanner(System.in).nextLine();
                    System.out.println("ngay sinh  : ");
                    int ngaySinh = new Scanner(System.in).nextInt();
                    System.out.println("thang sinh  : ");
                    int thangSinh = new Scanner(System.in).nextInt();
                    System.out.println("nam sinh  : ");
                    int namSinh = new Scanner(System.in).nextInt();
                    LocalDate localDate_nhanVien = LocalDate.of(namSinh, thangSinh, ngaySinh);
                    System.out.println("sdt : ");
                    String sdt = new Scanner(System.in).nextLine();
                    System.out.println("email : ");
                    String email = new Scanner(System.in).nextLine();
                    System.out.println("id bang:");
                    String idBang = new Scanner(System.in).nextLine();
                    System.out.println("ten bang :");
                    String tenBang = new Scanner(System.in).nextLine();
                    System.out.println("rank bang :");
                    String rankBang = new Scanner(System.in).nextLine();
                    System.out.println("ngay tot nghiep :");
                    int ngayTotNghiep = new Scanner(System.in).nextInt();
                    System.out.println("thang tot nghiep : ");
                    int thangTotNghiep = new Scanner(System.in).nextInt();
                    System.out.println("nam tot nghiep : ");
                    int namTotNghiep = new Scanner(System.in).nextInt();
                    LocalDate localDate_bangTotNghiep = LocalDate.of(namTotNghiep, thangTotNghiep, ngayTotNghiep);
                    certificateArrayList.add(new Certificate(idBang, tenBang, rankBang, localDate_bangTotNghiep));
                    System.out.println("1.experience" + "\n" + "2.fresher" + "\n" + "3.intern");
                    System.out.println("Nhap : ");
                    choose = new Scanner(System.in).nextLine();
                    switch (choose) {
                        case "1":
                            System.out.println("so nam kinh nghiem : ");
                            int expInYear = new Scanner(System.in).nextInt();
                            System.out.println("pro skill : ");
                            String proSkill = new Scanner(System.in).nextLine();
                            index_certificateArrayList = certificateArrayList.size() - 1;
                            Employee employee = new Experience(id, hoTen, localDate_nhanVien, sdt, email, Collections.singletonList(certificateArrayList.get(index_certificateArrayList)), 0
                                    , expInYear, proSkill);
                            method_action.themNhanVien(employee);
                            count += 1;
                            break;
                        case "2":
                            System.out.println("thoi gian tot nghiep ");
                            System.out.println("ngay tot nghiep :");
                            ngayTotNghiep = new Scanner(System.in).nextInt();
                            System.out.println("thang tot nghiep : ");
                            thangTotNghiep = new Scanner(System.in).nextInt();
                            System.out.println("nam tot nghiep : ");
                            namTotNghiep = new Scanner(System.in).nextInt();
                            LocalDate localDate_bangTotNghiep_fresher = LocalDate.of(namTotNghiep, thangTotNghiep, ngayTotNghiep);
                            System.out.println("xep loai tot nghiep : ");
                            String graduation_Rank = new Scanner(System.in).nextLine();
                            System.out.println("truong tot nghiep : ");
                            String education = new Scanner(System.in).nextLine();
                            index_certificateArrayList = certificateArrayList.size() - 1;
                            employee = new Fresher(id, hoTen, localDate_nhanVien, sdt, email, Collections.singletonList(certificateArrayList.get(index_certificateArrayList)), 0
                                    , localDate_bangTotNghiep_fresher, graduation_Rank, education);
                            method_action.themNhanVien(employee);
                            count += 1;
                            break;
                        case "3":
                            System.out.println("nganh dang hoc :");
                            String majors = new Scanner(System.in).nextLine();
                            System.out.println("hoc ki : ");
                            int semester = new Scanner(System.in).nextInt();
                            System.out.println("ten truonng : ");
                            String university_name = new Scanner(System.in).nextLine();
                            index_certificateArrayList = certificateArrayList.size() - 1;
                            employee = new Intern(id, hoTen, localDate_nhanVien, sdt, email, Collections.singletonList(certificateArrayList.get(index_certificateArrayList)), 0
                                    , majors, semester, university_name);
                            method_action.themNhanVien(employee);
                            count += 1;
                            break;
                    }
                    break;
                case "2":

                    break;
                case"3":
                    System.out.println("id : ");
                    id = new Scanner(System.in).nextLine();
                    method_action.xoaThongTin(id);
                    break;
                case "4":
                    System.out.println("1.intern" + "\n" + "2.experience" + "\n" + "3.fresher");
                    System.out.println("Nhap: ");
                    int type = new Scanner(System.in).nextInt();
                    method_action.timTheoLoaiNV(type);
                    break;
                case "5":
                    System.out.println("id : ");
                    id = new Scanner(System.in).nextLine();
                    method_action.timNVtheoID(id);
                    break;
                case"6":
                    method_action.showInfo();
                    break;
            }
        }
    }
}
