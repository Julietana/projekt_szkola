package project.service;

import project.model.Student;
import project.repository.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.*;


class StudentServiceTest {

    @Test
    @DisplayName("Add student test")
    void whenAddStudentListShouldNotBeEmpty() {
        StudentRepository studentRepository = new StudentRepository();
        Student student = new Student("Jan", "Kowalski", 123);
        studentRepository.getStudentList().add(student);

        assertThat(studentRepository.getStudentList()).isNotEmpty();
        assertThat(studentRepository.getStudentList()).contains(student);
        assertThat(studentRepository.getStudentList()).endsWith(student);
        assertThat(studentRepository.getStudentList()).isNotNull();
    }

    @Test
    void exampleAssertions() {
        assumeTrue(5 > 1);
        assertEquals(5+2, 7);
        assumeFalse(5 < 1);
    }

}