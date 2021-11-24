package project.application;

import project.model.Student;
import project.repository.StudentRepository;
import project.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public void run() {
        Scanner obj = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService();

        while (true) {
            System.out.println("1 - podaj dane studenta");
            System.out.println("2 - zobacz wszystkich wpisanych studentów");
            System.out.println("exit - zakończ program");
            String option = obj.nextLine();
            List<Student> studentList = studentRepository.getStudentList();

            if (option.equals("1")) {
                studentService.addStudent(studentList);
            } else if (option.equals("2")) {
                studentService.printStudents(studentList);
            } else if (option.equals("exit")) {
                break;
            }
        }
    }
}
