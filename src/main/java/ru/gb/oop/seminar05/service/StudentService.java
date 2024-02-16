package ru.gb.oop.seminar05.service;

import ru.gb.oop.seminar05.model.Student;
import ru.gb.oop.seminar05.model.User;
import java.util.List;

public interface StudentService {

    Student create(User user);
    List<Student> read();
}
