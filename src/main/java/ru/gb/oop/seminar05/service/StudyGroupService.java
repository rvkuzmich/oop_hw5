package ru.gb.oop.seminar05.service;

import ru.gb.oop.seminar05.model.Student;
import ru.gb.oop.seminar05.model.Teacher;

import java.util.List;

public interface StudyGroupService {
    List<Integer> createStudyGroup(Teacher teacher, List<Student> studentList);

    List<Integer> readStudyGroup();
}
