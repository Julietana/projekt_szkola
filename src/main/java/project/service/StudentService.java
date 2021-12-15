package project.service;

import project.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    public void addStudent(List<Student> studentList, Student student) {
        studentList.add(student);
    }

    public List studentParams(Scanner obj) {
        System.out.println("Podaj imię studenta: ");
        String firstName = obj.nextLine();
        System.out.println("Podaj nazwisko studenta: ");
        String secondName = obj.nextLine();
        System.out.println("Podaj numer studenta: ");
        Integer studentNumber = obj.nextInt();

        return List.of(firstName, secondName, studentNumber);
    }

    public String test(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
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

    public void saveStudents(List<Student> studentList) {
        FileWriter writer = null;

        try {
            writer = new FileWriter("student.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Student student: studentList) {
            try {
                writer.write(student.toString() + System.lineSeparator());
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

    public void loadStudents(List<Student> studentList) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        try {
            String line = br.readLine();

            while (line != null) {
                String[] splited = line.split("\\s+");
                Student student = new Student(splited[0], splited[1], Integer.parseInt(splited[2]));
                studentList.add(student);
                line = br.readLine();
            }
        } finally {
            br.close();
        }
    }
}
