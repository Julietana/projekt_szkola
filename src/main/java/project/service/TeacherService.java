package project.service;

import project.model.Teacher;
import java.util.List;
import java.util.Scanner;

public class TeacherService {

    public void printTeachers (List<Teacher> teacherList){
        System.out.println(teacherList);
    }

    public void addTeacher (List<Teacher> teacherList){
        Scanner obj = new Scanner(System.in);
        System.out.println("Podaj imię nauczyciela: ");
        String firstName = obj.nextLine();
        System.out.println("Podaj nazwisko nauczyciela: ");
        String secondName = obj.nextLine();
        System.out.println("Podaj nazwę pnauczanego przedmiotu: ");
        String lessonName = obj.nextLine();
        System.out.println("Podaj numer nauczyciela: ");
        Integer teacherNumber = obj.nextInt();
        teacherList.add(new Teacher(firstName, secondName, lessonName, teacherNumber));
    }

    public void removeTeacher (List<Teacher> teacherList){
        Scanner obj = new Scanner(System.in);
        System.out.println("Podaj numer nauczyciela");
        Integer number = obj.nextInt();
        for (int i=0; i<teacherList.size(); i++){
            if (teacherList.get(i).getTeacherNumber() == number){
                teacherList.remove(i);
            }
        }
    }

}
