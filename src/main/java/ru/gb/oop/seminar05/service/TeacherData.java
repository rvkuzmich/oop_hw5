package ru.gb.oop.seminar05.service;

import ru.gb.oop.seminar05.model.Teacher;
import ru.gb.oop.seminar05.model.User;

import java.util.ArrayList;
import java.util.List;

public class TeacherData implements TeacherService {
    List<Teacher> teacherList = new ArrayList<>();

    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherId(teacherList.size() + 1);
        teacherList.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return teacherList;
    }
}
