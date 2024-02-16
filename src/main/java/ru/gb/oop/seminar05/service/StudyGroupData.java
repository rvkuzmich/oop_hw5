package ru.gb.oop.seminar05.service;

import ru.gb.oop.seminar05.model.Student;
import ru.gb.oop.seminar05.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupData implements StudyGroupService{
    List<Integer> studyGroup = new ArrayList<>();

    @Override
    public List<Integer> createStudyGroup(Teacher teacher, List<Student> studentList) {
        studyGroup.add(teacher.getTeacherId());
        for(Student student : studentList) {
            studyGroup.add(student.getStudentId());
        }
        return studyGroup;
    }

    @Override
    public List<Integer> readStudyGroup() {
        return studyGroup;
    }
}
