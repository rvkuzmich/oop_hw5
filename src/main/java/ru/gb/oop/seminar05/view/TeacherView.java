package ru.gb.oop.seminar05.view;

import ru.gb.oop.seminar05.model.Teacher;

import java.util.List;

public class TeacherView {
    public void teacherPrint(List<Teacher> teacherList){
        System.out.println("Все учиеля\n" + teacherList);
    }
}
