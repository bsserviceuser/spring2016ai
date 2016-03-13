/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu;

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
        for (Student s: students)
            System.out.println(s.getId() + " - " + s.getName());
    }
    
}
