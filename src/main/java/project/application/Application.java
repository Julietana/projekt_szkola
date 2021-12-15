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
    public void run() throws Exception{
        Scanner obj = new Scanner(System.in);
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService();
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherService teacherService = new TeacherService();

        teacherService.loadTeachers(teacherRepository.getTeacherList());
        studentService.loadStudents(studentRepository.getStudentList());

        while (true) {
            System.out.println("1 - dodaj studenta");
            System.out.println("2 - dodaj nauczyciela");
            System.out.println("3 - zobacz wszystkich wpisanych studentów");
            System.out.println("4 - zaobacz wszystkich nauczycieli");
            System.out.println("5 - usuń studenta");
            System.out.println("6 - usuń nauczyciela");
            System.out.println("exit - zakończ program");
            String option = obj.nextLine();
            List<Student> studentList = studentRepository.getStudentList();
            List<Teacher> teacherList = teacherRepository.getTeacherList();

            if (option.equals("1")) {
                List list = studentService.studentParams(obj);
                studentService.addStudent(studentList,
                        new Student(String.valueOf(list.get(0)), String.valueOf(list.get(1)), (Integer)list.get(2)));
            } else if (option.equals("2")) {
                teacherService.addTeacher(teacherList);
            } else if (option.equals("3")) {
                System.out.println(studentList);
            } else if (option.equals("4")) {
                System.out.println(teacherList);
            } else if (option.equals("5")) {
                studentService.removeStudent(studentList);
            } else if (option.equals("6")) {
                teacherService.removeTeacher(teacherList);
            }  else if (option.equals("exit")) {
                studentService.saveStudents(studentList);
                teacherService.saveTeachers(teacherList);
                break;
            }
        }
    }
}
//fffff
// zadanie: persystencja dla studentow na osobnej galazce + po skonczeniu wystaw pull request
// testy
/*
git branch nazwa_galazki - komenda do tworzenia nowej galezi
git checkout nazwa_galezi - przelaczenie sie na konkretna galaz
 */

/*
- Wszystko na galazce "homework-unit-tests" i na koniec wystawiony pull request
- obsluga niepoprawnych komend
- poczytac o TDD ang. test - driven - development
- przetestowac metode ze scannerem StudentParams
- do przetestowania
    * addTeacher
    * removeTeacher, removeStudent
    * saveTeacher, saveStudent (google: unit tests with files java)
    ** problem z testami na plikach "produkcyjnych" -> inna nazwa pliku w testach
 */