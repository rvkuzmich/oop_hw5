package ru.gb.oop.seminar05.service;

import ru.gb.oop.seminar05.model.Teacher;
import ru.gb.oop.seminar05.model.User;
import java.util.List;

public interface TeacherService {

    Teacher create(User user);
    List<Teacher> read();
}
