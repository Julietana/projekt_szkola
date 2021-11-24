package project.repository;

import project.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    public List<Student> getStudentList() {
        return studentList;
    }

    List<Student> studentList = new ArrayList<>();
}
