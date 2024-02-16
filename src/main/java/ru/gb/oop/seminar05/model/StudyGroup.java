package ru.gb.oop.seminar05.model;

import java.util.List;

public class StudyGroup {

    Teacher teacher;
    List<Student> studentList;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}
