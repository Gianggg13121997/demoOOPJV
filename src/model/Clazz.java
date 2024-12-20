package model;

public class Clazz {
    private int id;
    private String name;
    private String grade;

    public Clazz(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Clazz() {

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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}
