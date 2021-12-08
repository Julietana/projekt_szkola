package project.service;

import project.model.Teacher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

    public void saveTeachers(List<Teacher> teacherList) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("teacher.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Teacher teacher : teacherList) {
            try {
                writer.write(teacher.toString() + System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void loadTeachers() throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("teacher.txt"));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            System.out.println(everything);
        } finally {
            br.close();
        }

    }
}
