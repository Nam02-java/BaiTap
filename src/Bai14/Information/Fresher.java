package Bai14.Information;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee {
    private LocalDate graduation_Date;
    private String graduation_Rank;
    private String education;

    public Fresher(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificateList, int employee_count, LocalDate graduation_Date, String graduation_Rank, String education) {
        super(id, fullName, birthDay, phone, email, certificateList, employee_count);
        this.graduation_Date = graduation_Date;
        this.graduation_Rank = graduation_Rank;
        this.education = education;
    }

    public LocalDate getGraduation_Date() {
        return graduation_Date;
    }

    public void setGraduation_Date(LocalDate graduation_Date) {
        this.graduation_Date = graduation_Date;
    }

    public String getGraduation_Rank() {
        return graduation_Rank;
    }

    public void setGraduation_Rank(String graduation_Rank) {
        this.graduation_Rank = graduation_Rank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}