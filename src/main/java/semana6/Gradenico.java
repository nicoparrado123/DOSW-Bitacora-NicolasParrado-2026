package semana6;

import java.time.LocalDate;

public class Gradenico {
    private String subject;
    private double score;
    private LocalDate date;
    private boolean passed;

    public Gradenico(String subject, double score, LocalDate date, boolean passed) {
        this.subject = subject;
        this.score = score;
        this.date = date;
        this.passed = passed;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
}
