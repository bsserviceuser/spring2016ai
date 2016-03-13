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
    String courseCode;
    String courseTitle;
    int sectionNumber;
    Faculty courseTeacher;
    ArrayList<Student> registeredStudents;
    ExamSlot examSlot;
}
