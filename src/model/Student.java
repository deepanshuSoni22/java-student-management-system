package model;

public class Student {
    public int id;
    private static int counter;
    public String name;

    public Student(String name) {
        this.name = name;
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}