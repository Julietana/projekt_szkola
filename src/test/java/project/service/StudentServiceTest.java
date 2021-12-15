package project.service;

import project.model.Student;
import project.repository.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.*;

import java.util.List;


class StudentServiceTest {

    @Test
    @DisplayName("Add student test")
    void whenAddStudentListShouldNotBeEmpty() {
        // given
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService();
        Student student = new Student("Jan", "Kowalski", 123);
        List<Student> studentList = studentRepository.getStudentList();

        // when
        studentService.addStudent(studentList, student);

        // then
        assertThat(studentRepository.getStudentList()).isNotEmpty();
        assertThat(studentRepository.getStudentList()).contains(student);
        assertThat(studentRepository.getStudentList()).endsWith(student);
        assertThat(studentRepository.getStudentList()).isNotNull();
    }

    @Test
    void shouldChangeStudentName() {
        /*
        tworze studenta 1

        wywoluje metode editStudent z serwisu

        wyoknuje asercje na to ze metoda editStudent zmienila jego imie na podane przez nas
         */
    }

    @Test
    void exampleAssertions() {
        assumeTrue(5 > 1);
        assertEquals(5+2, 7);
        assumeFalse(5 < 1);
    }
}