package ru.gb.oop.seminar05.view;

import ru.gb.oop.seminar05.model.Student;

import java.util.List;

public class StudentView {
    public void studentPrint(List<Student> studentList){
        System.out.println("Все студенты\n" + studentList);
    }
}
