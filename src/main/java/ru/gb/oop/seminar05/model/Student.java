package ru.gb.oop.seminar05.model;

public class Student extends User{
    private Integer studentId;
    private Double average;

    public Student(String name, String lastName, Integer age, Double average) {
        super(name, lastName, age);
        this.average = average;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", average=" + average +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
