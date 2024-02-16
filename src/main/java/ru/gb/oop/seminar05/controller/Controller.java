package ru.gb.oop.seminar05.controller;

import ru.gb.oop.seminar05.model.Student;
import ru.gb.oop.seminar05.model.StudyGroup;
import ru.gb.oop.seminar05.model.Teacher;
import ru.gb.oop.seminar05.model.User;
import ru.gb.oop.seminar05.service.StudentData;
import ru.gb.oop.seminar05.service.StudyGroupData;
import ru.gb.oop.seminar05.service.TeacherData;
import ru.gb.oop.seminar05.view.StudentView;
import ru.gb.oop.seminar05.view.TeacherView;
import ru.gb.oop.seminar05.view.StudyGroupView;

import java.util.List;

public class Controller {
    private StudentData studentData;
    private TeacherData teacherData;
    private StudentView studentView;
    private TeacherView teacherView;
    private StudyGroupView studyGroupView;
    private StudyGroupData studyGroupData;
    public void start(){
        User u1 = new Student("Роман", "Кузьмич", 38, 4.6);
        User u3 = new Student("Алексей", "Бобылев", 33, 4.8);
        User u2 = new Teacher("Роман", "Вороновский", 29, "Java OOP");
        studentCreate(u1);
        studentCreate(u3);
        teacherCreate(u2);
        List<Student> studentList = studentData.read();
        studentView.studentPrint(studentList);
        List<Teacher> teacherList = teacherData.read();
        teacherView.teacherPrint(teacherList);
        studyGroupData.createStudyGroup((Teacher)u2, studentList);
        studyGroupView.studyGroupPrint(studyGroupData.readStudyGroup());



    }
    public Student studentCreate(User user){
        return studentData.create(user);
    }
    public Teacher teacherCreate(User user){
        return teacherData.create(user);
    }

    public Controller() {
        studentData = new StudentData();
        teacherData = new TeacherData();
        studentView = new StudentView();
        teacherView = new TeacherView();
        studyGroupData = new StudyGroupData();
        studyGroupView = new StudyGroupView();
    }
}
