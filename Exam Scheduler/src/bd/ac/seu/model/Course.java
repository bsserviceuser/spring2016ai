/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.model;

import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class Course {
    private String courseCode;
    private String courseTitle;
    private int sectionNumber;
    private Faculty courseTeacher;
    private ArrayList<Student> registeredStudents;
    private ExamSlot examSlot;

    public Course(String courseCode, String courseTitle, int sectionNumber) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.sectionNumber = sectionNumber;
        courseTeacher = null;
        registeredStudents = new ArrayList<>();
        examSlot = null;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public Faculty getCourseTeacher() {
        return courseTeacher;
    }

    public ArrayList<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public ExamSlot getExamSlot() {
        return examSlot;
    }

}
