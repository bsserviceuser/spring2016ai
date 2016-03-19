/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu;

import bd.ac.seu.model.Course;
import bd.ac.seu.model.ExamSlot;
import bd.ac.seu.model.Faculty;
import bd.ac.seu.model.Room;
import bd.ac.seu.model.Student;
import java.util.ArrayList;

/**
 *
 * @author kmhasan
 */
public class ExamScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> students = InputReaderSingleton.getStudents();
        ArrayList<Course> courses = InputReaderSingleton.getCourses();
        ArrayList<Faculty> faculties = InputReaderSingleton.getFaculties();
        ArrayList<Room> rooms = InputReaderSingleton.getRooms();
        ArrayList<ExamSlot> examSlots = InputReaderSingleton.getExamSlots();
        for (Student s: students)
            System.out.println(s.toJSONObject());
        for (Course c: courses)
            System.out.println(c.toJSONObject());
        for (Faculty f: faculties)
            System.out.println(f.toJSONObject());
        for (Room r: rooms)
            System.out.println(r.toJSONObject());
        for (ExamSlot e: examSlots)
            System.out.println(e.toJSONObject());
    }
    
}
