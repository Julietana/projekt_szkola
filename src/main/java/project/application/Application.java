package project.application;

import project.model.Teacher;
import project.model.Student;
import project.repository.StudentRepository;
import project.repository.TeacherRepository;
import project.service.StudentService;
import project.service.TeacherService;

import java.util.List;
import java.util.Scanner;

public class Application {
    public void run() {
        Scanner obj = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService();
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherService teacherService = new TeacherService();

        while (true) {
            System.out.println("1 - dodaj studenta");
            System.out.println("2 - dodaj nauczyciela");
            System.out.println("3 - zobacz wszystkich wpisanych studentów");
            System.out.println("4 - zaobacz wszystkich nauczycieli");
            System.out.println("5 - usuń studenta");
            System.out.println("6 - usuń nauczyciela");
            System.out.println("7 - zapisz studentow");
            System.out.println("8 - zapisz nauczycieli");
            System.out.println("exit - zakończ program");
            String option = obj.nextLine();
            List<Student> studentList = studentRepository.getStudentList();
            List<Teacher> teacherList = teacherRepository.getTeacherList();

            if (option.equals("1")) {
                studentService.addStudent(studentList);
            } else if (option.equals("2")){
                teacherService.addTeacher(teacherList);
            } else if (option.equals("3")) {
                studentService.printStudents(studentList);
            }else if (option.equals("4")){
                teacherService.printTeachers(teacherList);
            } else if (option.equals("5")){
                studentService.removeStudent(studentList);
            } else if (option.equals("6")){
                teacherService.removeTeacher(teacherList);
            } else if (option.equals("7")) {
                studentService.saveStudents(studentList);
            } else if (option.equals("8")){
                teacherService.saveTeachers(teacherList);
            }
            else if (option.equals("exit")){
                break;
            }

        }
    }
}

// 3 - usuwanie studenta
/*
git branch nazwa_galazki - komenda do tworzenia nowej galezi
git checkout nazwa_galezi - przelaczenie sie na konkretna galaz
 */
