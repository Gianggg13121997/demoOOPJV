package model;

public class Student {
    private int id;
    private String name;
    private int score;
    private String gender;
    private String conduct;

    private int gradeClazz;

    public Student(int id, String name, String score, int gender, String conduct, int gradeClazz) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.gender = gender;
        this.conduct = conduct;
        this.gradeClazz = gradeClazz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getConduct() {
        return conduct;
    }

    public void setConduct(String conduct) {
        this.conduct = conduct;
    }

    public int getGradeClazz() {
        return gradeClazz;
    }

    public void setGradeClazz(int gradeClazz) {
        this.gradeClazz = gradeClazz;
    }

    @Override
    public String toString() {
        return "ID :" + this.id + ", name :" + this.name + ", score :" + this.score + ", gender :" + this.gender + ", conduct :" + this.conduct;
    }
}
