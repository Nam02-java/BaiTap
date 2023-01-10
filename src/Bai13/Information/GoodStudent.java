package Bai13.Information;

import java.time.LocalDate;

public class GoodStudent extends Students {
    private int GPA;
    private String bestRewardName;

    public GoodStudent(String fullName, LocalDate localDate, String sex, long phoneNumber, String universityName, String gradeLevel, int GPA, String bestRewardName) {
        super(fullName, localDate, sex, phoneNumber, universityName, gradeLevel);
        this.GPA = GPA;
        this.bestRewardName = bestRewardName;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }
}

