package Bai13;

import Bai13.Manager.ManagerStudent;

import java.util.Scanner;

public class Main {
    static ManagerStudent managerStudent = new ManagerStudent();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.insert data" + "\n" + "2.filter data student to enjoy company"
                    + "\n" + "3.showInfor by phoneNumber" + "\n" + "4.showAllData");
            System.out.println("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    managerStudent.insertData();
                    break;
                case "2":
                    managerStudent.filterStudentToCompany();
                    break;
                case "3":
                    managerStudent.showMyInfor();
                    break;
                case "4":
                    managerStudent.showAllData();
                    break;
                default:
                    System.out.println("wrong");
                    break;
            }
        }
    }
}

