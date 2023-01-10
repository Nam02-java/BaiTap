package Bai13.Manager;

import Bai13.ExceptionController.Check;
import Bai13.ExceptionController.MyException;
import Bai13.Information.GoodStudent;
import Bai13.Information.NormalStudent;
import Bai13.Information.Students;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerStudent extends Function {
    Check check = new Check();
    static ArrayList<Students> studentsArrayList = new ArrayList<>();
    static ArrayList<GoodStudent> goodStudentArrayList = new ArrayList<>();
    static ArrayList<NormalStudent> normalStudentArrayList = new ArrayList<>();


    static ArrayList<Students> companyArrayList = new ArrayList<>();


    @Override
    public void showMyInfor() {

    }

    @Override
    public void insertData() {
        try {
            System.out.println("full Name: ");
            String fullName = new Scanner(System.in).nextLine();
            try {
                check.checkName(fullName);
            } catch (MyException e) {
                System.out.println("Exception : " + e);
                return;
            }
            System.out.println("birth date: ");
            int day = new Scanner(System.in).nextInt();
            System.out.println("month: ");
            int month = new Scanner(System.in).nextInt();
            System.out.println("year: ");
            int year = new Scanner(System.in).nextInt();
            LocalDate localDate = LocalDate.of(year, month, day);
            try {
                check.checkLocalDate(localDate);
            } catch (MyException e) {
                System.out.println("Exception : " + e);
                return;
            }
            System.out.println("sex: ");
            String sex = new Scanner(System.in).nextLine();
            System.out.println("phone Number: ");
            long phoneNumber = new Scanner(System.in).nextLong();
            try {
                check.checkNumberPhone(phoneNumber);
            } catch (MyException e) {
                System.out.println("Exception occured: " + e);
                return;
            }
            System.out.println("university Name: ");
            String universityName = new Scanner(System.in).nextLine();
            System.out.println("grade Level: ");
            String gradeLevel = new Scanner(System.in).nextLine();
            if (gradeLevel.equalsIgnoreCase("a")) {
                System.out.println("gpa : ");
                int gpa = new Scanner(System.in).nextInt();
                System.out.println("best Reward Name : ");
                String bestRewardName = new Scanner(System.in).nextLine();
                Students students = new GoodStudent(fullName, localDate, sex, phoneNumber, universityName, gradeLevel, gpa, bestRewardName);
                studentsArrayList.add(students);
                goodStudentArrayList.add(new GoodStudent(fullName, localDate, sex, phoneNumber, universityName, gradeLevel, gpa, bestRewardName));
            } else if (gradeLevel.equalsIgnoreCase("b")) {
                System.out.println("TOEIC english Score: ");
                int TOEIC_engScore = new Scanner(System.in).nextInt();
                System.out.println("entry test score: ");
                int entryTestScore = new Scanner(System.in).nextInt();
                Students students = new NormalStudent(fullName, localDate, sex, phoneNumber, universityName, gradeLevel, TOEIC_engScore, entryTestScore);
                studentsArrayList.add(students);
                normalStudentArrayList.add(new NormalStudent(fullName, localDate, sex, phoneNumber, universityName, gradeLevel, TOEIC_engScore, entryTestScore));
            }
        } catch (Exception e) {
            System.out.println("Input files have unknow errors !!!");
        }
    }


    @Override
    public void filterStudentToCompany() {
        int svGioiCanTuyen = 11;
        int count = 0;
        if (goodStudentArrayList.size() > svGioiCanTuyen) {
            Collections.sort(goodStudentArrayList, new Comparator<GoodStudent>() {
                @Override
                public int compare(GoodStudent o1, GoodStudent o2) {
                    if (o1.getGradeLevel().compareTo(o2.getGradeLevel()) > 0) {
                        return 1;
                    } else if (o1.getGradeLevel().compareTo(o2.getGradeLevel()) < 0) {
                        return -1;
                    } else {
                        if (o1.getGPA() - o2.getGPA() > 0) {
                            return 1;
                        } else if (o1.getGPA() - o2.getGPA() < 0) {
                            return -1;
                        } else {
                            if (o1.getFullName().compareTo(o2.getFullName()) > 0) {
                                return 1;
                            } else if (o1.getFullName().compareTo(o2.getFullName()) < 0) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            });
            for (int i = 0; i < svGioiCanTuyen; i++) {
                Students students = new GoodStudent(goodStudentArrayList.get(i).getFullName(),
                        goodStudentArrayList.get(i).getLocalDate(), goodStudentArrayList.get(i).getSex(), goodStudentArrayList.get(i).getPhoneNumber()
                        , goodStudentArrayList.get(i).getUniversityName(), goodStudentArrayList.get(i).getGradeLevel(), goodStudentArrayList.get(i).getGPA(), goodStudentArrayList.get(i).getBestRewardName());
                companyArrayList.add(students);
            }
        } else if (goodStudentArrayList.size() < svGioiCanTuyen) {
            for (int i = 0; i < studentsArrayList.size(); i++) {
                Students students = new GoodStudent(goodStudentArrayList.get(i).getFullName(),
                        goodStudentArrayList.get(i).getLocalDate(), goodStudentArrayList.get(i).getSex(), goodStudentArrayList.get(i).getPhoneNumber()
                        , goodStudentArrayList.get(i).getUniversityName(), goodStudentArrayList.get(i).getGradeLevel(), goodStudentArrayList.get(i).getGPA(), goodStudentArrayList.get(i).getBestRewardName());
                companyArrayList.add(students);
            }
            int getNormalStudent = svGioiCanTuyen - goodStudentArrayList.size();
            Collections.sort(normalStudentArrayList, new Comparator<NormalStudent>() {
                @Override
                public int compare(NormalStudent o1, NormalStudent o2) {
                    if (o1.getEntryTestScore() - o2.getEntryTestScore() > 0) {
                        return 1;
                    } else if (o1.getEntryTestScore() - o2.getEntryTestScore() < 0) {
                        return -1;
                    } else {
                        if (o1.getTOEIC_englishScore() - o2.getTOEIC_englishScore() > 0) {
                            return 1;
                        } else if (o1.getTOEIC_englishScore() - o2.getTOEIC_englishScore() < 0) {
                            return -1;
                        } else {
                            if (o1.getFullName().compareTo(o2.getFullName()) > 0) {
                                return 1;
                            } else if (o1.getFullName().compareTo(o2.getFullName()) < 0) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }
                    }
                }
            });
            for (int i = 0; i < getNormalStudent; i++) {
                Students students = new NormalStudent(normalStudentArrayList.get(i).getFullName(),
                        normalStudentArrayList.get(i).getLocalDate(), normalStudentArrayList.get(i).getSex(), normalStudentArrayList.get(i).getPhoneNumber()
                        , normalStudentArrayList.get(i).getUniversityName(), normalStudentArrayList.get(i).getGradeLevel(), normalStudentArrayList.get(i).getTOEIC_englishScore(), normalStudentArrayList.get(i).getEntryTestScore());
                companyArrayList.add(students);
            }
        }
        System.out.println("tat ca sinh vien duoc chon lua khi vao cong ty : ");
        for (int i = 0; i < companyArrayList.size(); i++) {
            System.out.println(companyArrayList.get(i));
        }
    }

    @Override
    public void showAllData() {
        Collections.sort(studentsArrayList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                if (o1.getFullName().compareTo(o2.getFullName()) > 0) {
                    return -1;
                } else if (o1.getFullName().compareTo(o2.getFullName()) < 0) {
                    return 1;
                } else {
                    if (o1.getPhoneNumber() - o2.getPhoneNumber() > 0) {
                        return 1;
                    } else if (o1.getPhoneNumber() - o2.getPhoneNumber() < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        for (int i = 0; i < studentsArrayList.size(); i++) {
            System.out.println(studentsArrayList.get(i).getFullName() + " " + studentsArrayList.get(i).getPhoneNumber());
        }
    }
}

