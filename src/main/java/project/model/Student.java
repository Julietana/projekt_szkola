package project.model;

public class Student {
    private String firstName;
    private String secondName;
    private Integer studentNumber;

    public Student(String firstName, String secondName, Integer studentNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.studentNumber = studentNumber;
    }

    public Integer getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.secondName + " " + this.studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
