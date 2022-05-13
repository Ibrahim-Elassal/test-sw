
package Database;

import domain.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class SettingTable {
    
    
     
     public static void showStudentTable(DefaultTableModel table){
        ArrayList<Student> student = GettingDatabase.GetStudents();
        Object[] row =new Object[5];
        for(int i=0; i<student.size(); i++){
            row[0] = student.get(i).getFirstName();
            row[1] = student.get(i).getSecondName();
            row[2] = student.get(i).getEmail();
            row[3] = student.get(i).getGender();
            row[4] = student.get(i).getPhone();
            table.addRow(row);
        }
    }
     
    public static void showCourseTable(DefaultTableModel table){
        ArrayList<Courses> courses = GettingDatabase.GetCourses();
        Object[] row =new Object[3];
        for(int i=0; i<courses.size(); i++){
            row[0] = courses.get(i).getCourse_Name();
            row[1] = courses.get(i).getCourse_Id();
            row[2] = courses.get(i).getNumber_of_hourse();
            table.addRow(row);
        }
    }
     public static void showRegistrationTable(DefaultTableModel table){
        ArrayList<Registration> registration = GettingDatabase.getRegistration();
        Object[] row =new Object[3];
        for(int i=0;i<registration.size();i++){
           row[0] =registration.get(i).getEmail();
           row[1] =registration.get(i).getcourseId();
           table.addRow(row);
       }
    }
       public static void showLinkTable(DefaultTableModel table , String id){
        ArrayList<Links> link = GettingDatabase.GetLinks(id);
        Object[] row =new Object[3];
        for(int i=0; i<link.size(); i++){
            row[0] = link.get(i).getFormId();
            row[1] = link.get(i).getFormUrl();
            row[2] = link.get(i).getFormNo();
            table.addRow(row);
        }
    }
}
