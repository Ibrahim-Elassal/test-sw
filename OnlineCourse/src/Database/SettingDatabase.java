
package Database;

import SignUp.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class SettingDatabase {
    public static void insertUsers(String firstName,String secondName,String email,String password,String phone,String gender) throws SQLException{
        if(CheckingTextField.checkUserTextField(firstName, secondName, email, password, phone, gender)!=""){
        JOptionPane.showMessageDialog(null, CheckingTextField.checkUserTextField(firstName, secondName, email, password, phone, gender), "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
        try{
        String query = "INSERT INTO `student`(`firstName`, `secondName`, `email`, `password`, `phone`, `gender`)VALUES(?,?,?,?,?,?)";
        PreparedStatement ps = MyConnection.connection().prepareStatement(query);
                ps.setString(1,firstName);
                ps.setString(2,secondName);
                ps.setString(3,email);
                ps.setString(4,password);
                ps.setString(5,phone);
                ps.setString(6,gender);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"Adding Successfully");
                new LogIn().setVisible(true);
                new SignUp().setVisible(false);
        }catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Error in Insert", "Error", JOptionPane.ERROR_MESSAGE);
        }}
    }
    
   
public static void insertCourses(String courseName,String courseId,String numberOfHours) throws SQLException{ 
       if(CheckingTextField.checkCourseTextField(courseName, courseId, numberOfHours)!=""){
       JOptionPane.showMessageDialog(null, CheckingTextField.checkCourseTextField(courseName, courseId, numberOfHours), "Error", JOptionPane.ERROR_MESSAGE);
       }else{
        try{    
                String query = "INSERT INTO `course`(`courseName`, `courseID`, `noHoures`) VALUES(?,?,?)";
                PreparedStatement ps = MyConnection.connection().prepareStatement(query);
                ps.setString(1,courseName);
                ps.setString(2,courseId);
                ps.setString(3, numberOfHours);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"course add succesfully");

        }catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Error in Insert", "Error", JOptionPane.ERROR_MESSAGE);
        }

       
        
    }}
  public static void insertRegistrations(String courseID,String email) throws SQLException{ 
        if(CheckingTextField.CheckRegistrationTextField(courseID)!=""){
        JOptionPane.showMessageDialog(null, CheckingTextField.CheckRegistrationTextField(courseID), "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
        try{    
        String query = "INSERT INTO `registrationcourse`(`email`, `courseID`) VALUES(?,?)";
        PreparedStatement ps = MyConnection.connection().prepareStatement(query);
                ps.setString(1,email);
                ps.setString(2,courseID);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"course add succesfully");

        }catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "Error in Insertd", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }}
  
  public static void insertLinks(String courseID,String url,String linkNo) throws SQLException{
        if(CheckingTextField.checkTextField(courseID, url, linkNo)!=""){
        JOptionPane.showMessageDialog(null, CheckingTextField.checkTextField(courseID, url, linkNo), "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{    
            String query = "INSERT INTO `links`(`courseID`, `url`, `linkNo`) VALUES(?,?,?)";
            PreparedStatement ps = MyConnection.connection().prepareStatement(query);
                    ps.setString(1,courseID);
                    ps.setString(2,url);
                    ps.setString(3,linkNo);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Adding Successfully");
            }catch (SQLException exception) {
                JOptionPane.showMessageDialog(null, "Error in Insert", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
