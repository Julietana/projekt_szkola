package project.repository;

import project.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    List<Teacher> teacherList = new ArrayList<>();
}
