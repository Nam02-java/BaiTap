package Bai14.Information;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee {
    private String majors ;
    private int semester ;
    private String university_Name;

    public Intern(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificateList, int employee_count, String majors, int semester, String university_Name) {
        super(id, fullName, birthDay, phone, email, certificateList, employee_count);
        this.majors = majors;
        this.semester = semester;
        this.university_Name = university_Name;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversity_Name() {
        return university_Name;
    }

    public void setUniversity_Name(String university_Name) {
        this.university_Name = university_Name;
    }


}