package project.model;

public class Teacher {
    private String firstName;
    private String secondName;
    private String lessonName;
    private Integer teacherNumber;

    public Teacher(String firstName, String secondName, String lessonName, Integer teacherNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lessonName = lessonName;
        this.teacherNumber = teacherNumber;
    }


    public Integer getTeacherNumber() {
        return this.teacherNumber;
    }

    public void setTeacherNumber(Integer studentNumber) {this.teacherNumber = teacherNumber;}

    @Override
    public String toString() {
        return this.firstName + " " + this.secondName + " " + this.lessonName + " "
                + this.teacherNumber;}

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





