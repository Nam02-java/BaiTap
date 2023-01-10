package Bai14.Function;

import Bai14.Information.*;

import java.util.ArrayList;

import static Bai14.Main.count;

public class method_action extends allMethod {
    public static ArrayList<Certificate> certificateArrayList = new ArrayList<>();
    static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @Override
    public void showInfo() {
        for (int i = 0; i < employeeArrayList.size(); i++) {
            System.out.println(employeeArrayList.get(i));
        }
        System.out.println("-------------------");
        for (int i = 0; i < certificateArrayList.size(); i++) {
            System.out.println(certificateArrayList.get(i));
        }
    }

    @Override
    public void showMe() {

    }

    @Override
    public void themNhanVien(Employee employee) {
        employeeArrayList.add(employee);
        int index = employeeArrayList.size();
        employeeArrayList.get(index - 1).setEmployee_count(count);
    }

    @Override
    public void timTheoLoaiNV(int type) {

        switch (type) {
            case 1:
                for (int i = 0; i < employeeArrayList.size(); i++) {
                    if (employeeArrayList.get(i) instanceof Intern) {
                        System.out.println(employeeArrayList.get(i) + " " +
                                ((Intern) employeeArrayList.get(i)).getMajors() + " " +
                                ((Intern) employeeArrayList.get(i)).getSemester() + " " +
                                ((Intern) employeeArrayList.get(i)).getUniversity_Name());
                    }
                }
                break;
            case 2:
                for (int i = 0; i < employeeArrayList.size(); i++) {
                    if (employeeArrayList.get(i) instanceof Experience) {
                        System.out.println(employeeArrayList.get(i) + " " +
                                ((Experience) employeeArrayList.get(i)).getExpinYear() + " " +
                                ((Experience) employeeArrayList.get(i)).getProSkill());
                    }
                }
                break;
            case 3:
                for (int i = 0; i < employeeArrayList.size(); i++) {
                    if (employeeArrayList.get(i) instanceof Fresher) {
                        System.out.println(employeeArrayList.get(i) + " " +
                                ((Fresher) employeeArrayList.get(i)).getGraduation_Date() + " " +
                                ((Fresher) employeeArrayList.get(i)).getGraduation_Rank() + " " +
                                ((Fresher) employeeArrayList.get(i)).getEducation());
                    }
                }
                break;
        }
    }

    @Override
    public void timNVtheoID(String id) {
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getId().equals(id)) {
                if (employeeArrayList.get(i) instanceof Intern) {
                    System.out.println(employeeArrayList.get(i) + " " +
                            ((Intern) employeeArrayList.get(i)).getMajors() + " " +
                            ((Intern) employeeArrayList.get(i)).getSemester() + " " +
                            ((Intern) employeeArrayList.get(i)).getUniversity_Name());
                } else if (employeeArrayList.get(i) instanceof Fresher) {
                    System.out.println(employeeArrayList.get(i) + " " +
                            ((Fresher) employeeArrayList.get(i)).getGraduation_Date() + " " +
                            ((Fresher) employeeArrayList.get(i)).getGraduation_Rank() + " " +
                            ((Fresher) employeeArrayList.get(i)).getEducation());
                } else if (employeeArrayList.get(i) instanceof Experience) {
                    System.out.println(employeeArrayList.get(i) + " " +
                            ((Experience) employeeArrayList.get(i)).getExpinYear() + " " +
                            ((Experience) employeeArrayList.get(i)).getProSkill());
                }
            }
        }
    }

    @Override
    public void xoaThongTin(String id) {
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if(employeeArrayList.get(i).getId().equals(id)){
                employeeArrayList.remove(i);
            }
        }
    }
}