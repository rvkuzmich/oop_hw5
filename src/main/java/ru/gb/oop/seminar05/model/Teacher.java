package ru.gb.oop.seminar05.model;

public class Teacher extends User{
    private Integer teacherId;
    private String subject;

    public Teacher(String name, String lastName, Integer age, String subject) {
        super(name, lastName, age);
        this.subject = subject;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }
}
