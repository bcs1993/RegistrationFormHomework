package model;

import com.briansmith.regHomework.Controller;

import java.net.ContentHandler;
import java.util.ArrayList;
import java.util.List;

public class StudentService extends Controller {

    private List student = new ArrayList();
    private static StudentService instance = new StudentService();

    public List getStudent() {
        return student;
    }

    public void setStudent(List student) {
        this.student = student;
    }

    public static StudentService getInstance() {
        return instance;
    }

    public static void setInstance(StudentService instance) {
        StudentService.instance = instance;
    }
    public void addStudent() {
        Student newStudent = new Student(getFirstNameField(),getLastNameField(),getEmailField(),getStudentIdField());
    }
}
