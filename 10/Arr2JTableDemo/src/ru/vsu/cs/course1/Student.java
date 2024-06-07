package ru.vsu.cs.course1;

public class Student {
    private String fullName;
    private int russianScore;
    private int mathScore;
    private int physicScore;
    private boolean hasOriginalCertificate;

    public Student(String fullName, int russianScore, int mathScore, int physicScore, boolean hasOriginalCertificate) {
        this.fullName = fullName;
        this.russianScore = russianScore;
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.hasOriginalCertificate = hasOriginalCertificate;
    }

    public int getTotalScore() {
        return russianScore + mathScore + physicScore;

    }

    public boolean getHasOriginalCertificate() {
        return hasOriginalCertificate;
    }

    public String getFullName() {
        return fullName;
    }

    public String toString() {
        return fullName + " " + getTotalScore();
    }
    public  int getMathScore(){
        return mathScore;
    }
    public int getPhysicScore(){
        return physicScore;
    }
}

