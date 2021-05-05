package model;

import javafx.scene.control.TextField;

public class Student {
    private TextField firstName;
    private TextField lastNAme;
    private TextField email;
    private TextField studentID;

    @Override
    public String toString() {
        return "Student " + firstName;

    }

    public TextField getFirstName() {
        return firstName;
    }

    public void setFirstName(TextField firstName) {
        this.firstName = firstName;
    }

    public TextField getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(TextField lastNAme) {
        this.lastNAme = lastNAme;
    }

    public TextField getEmail() {
        return email;
    }

    public void setEmail(TextField email) {
        this.email = email;
    }

    public TextField getStudentID() {
        return studentID;
    }

    public void setStudentID(TextField studentID) {
        this.studentID = studentID;
    }

    public Student(TextField firstName, TextField lastNAme, TextField email, TextField studentID) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.email = email;
        this.studentID = studentID;
    }
}
