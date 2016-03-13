/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.ac.seu.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kmhasan
 */
public class ExamSlot {
    Date date;
    Time startTime;
    Time endTime;
    ArrayList<Room> availableRooms;
    ArrayList<Course> assignedCourses;
}
