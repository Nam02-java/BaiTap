package Bai13.Information;

import java.time.LocalDate;

public class NormalStudent extends Students {
    private int TOEIC_englishScore, entryTestScore;

    public NormalStudent(String fullName, LocalDate localDate, String sex, long phoneNumber, String universityName, String gradeLevel, int TOEIC_englishScore, int entryTestScore) {
        super(fullName, localDate, sex, phoneNumber, universityName, gradeLevel);
        this.TOEIC_englishScore = TOEIC_englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getTOEIC_englishScore() {
        return TOEIC_englishScore;
    }

    public void setTOEIC_englishScore(int TOEIC_englishScore) {
        this.TOEIC_englishScore = TOEIC_englishScore;
    }

    public int getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(int entryTestScore) {
        this.entryTestScore = entryTestScore;
    }
}
