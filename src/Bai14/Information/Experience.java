package Bai14.Information;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {
    int ExpinYear ;
    String proSkill;

    public Experience(String id, String fullName, LocalDate birthDay, String phone, String email, List<Certificate> certificateList, int employee_count, int expinYear, String proSkill) {
        super(id, fullName, birthDay, phone, email, certificateList, employee_count);
        ExpinYear = expinYear;
        this.proSkill = proSkill;
    }

    public int getExpinYear() {
        return ExpinYear;
    }

    public void setExpinYear(int expinYear) {
        ExpinYear = expinYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}