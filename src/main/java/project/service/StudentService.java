package project.service;

import project.model.Student;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    public void printStudents(List<Student> studentList){
        System.out.println(studentList);
    }

    public void addStudent(List<Student> studentList) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Podaj imię studenta: ");
        String firstName = obj.nextLine();
        System.out.println("Podaj nazwisko studenta: ");
        String secondName = obj.nextLine();
        System.out.println("Podaj numer studenta: ");
        Integer studentNumber = obj.nextInt();
        studentList.add(new Student(firstName, secondName, studentNumber));
    }

    public void removeStudent(List<Student> studentList){
        Scanner obj = new Scanner(System.in);
        System.out.println("Podaj numer studenta");
        Integer number = obj.nextInt();
        for (int i=0; i<studentList.size(); i++){
            if (studentList.get(i).getStudentNumber() == number){
                studentList.remove(i);
            }
        }
    }
}
