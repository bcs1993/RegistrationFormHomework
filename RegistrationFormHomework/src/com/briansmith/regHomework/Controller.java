package com.briansmith.regHomework;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Student;
import model.StudentService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
    @FXML
    private Button submitButton;
    @FXML
    private TextField firstNameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField studentIdField;

    public TextField getFirstNameField() {
        return firstNameField;
    }

    public void setFirstNameField(TextField firstNameField) {
        this.firstNameField = firstNameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public void setLastNameField(TextField lastNameField) {
        this.lastNameField = lastNameField;
    }

    public TextField getEmailField() {
        return emailField;
    }

    public void setEmailField(TextField emailField) {
        this.emailField = emailField;
    }

    public TextField getStudentIdField() {
        return studentIdField;
    }

    public void setStudentIdField(TextField studentIdField) {
        this.studentIdField = studentIdField;
    }

    private List<Student> student = new ArrayList<>();


    public void onSubmit(ActionEvent actionEvent) {
        if (firstNameField.getText().isEmpty() || firstNameField.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Error", "Please enter first name!");


        } else if (lastNameField.getText().isEmpty() || lastNameField.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Error", "Please enter last name");
        } else if (emailField.getText().isEmpty() || emailField.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Error", "Please enter email!");
        } else if (studentIdField.getText().isEmpty() || studentIdField.getText().isBlank()) {
            AlertHelper.showAlert(Alert.AlertType.ERROR, "Error", "Please enter Student ID!");
        } else {
            AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, "Success", "Student Registered");
            StudentService.getInstance().addStudent();

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("Students.txt"));
                for (Student student : student) {
                    bw.write(student.getFirstName() + "\t" + student.getLastNAme() + "\t" + student.getEmail() + "\t"
                            + student.getStudentID());
                }
                bw.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
}
