package ru.gb.oop.seminar05.service;

import ru.gb.oop.seminar05.model.Student;
import ru.gb.oop.seminar05.model.User;

import java.util.ArrayList;
import java.util.List;

public class StudentData implements StudentService {
    List<Student> studentList = new ArrayList<>();

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentId(studentList.size() + 1);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return studentList;
    }
}
