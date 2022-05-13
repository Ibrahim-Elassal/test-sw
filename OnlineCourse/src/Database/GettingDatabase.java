
package Database;
//import static Student.ViewMyCourses.course_mail;
import static Student.ViewMyCourses.course_mail;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import domain.*;

public class GettingDatabase {
    
    
    
    public static ArrayList<Users> getStudent(){
        ArrayList<Users> Student =new ArrayList<>();
        try{
          
            PreparedStatement ps =MyConnection.connection().prepareStatement("select *  from student");
            ResultSet r = ps.executeQuery();
            while(r.next()){
                Student.add(new Admin(r.getString("email"),r.getString("password")));
            }
            
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return Student;
    }
    
    public static ArrayList<Users> getAdmin(){
        ArrayList<Users> admin =new ArrayList<>();
        try{
            PreparedStatement ps =MyConnection.connection().prepareStatement("select *  from admin");
            ResultSet r = ps.executeQuery();
            while(r.next()){
                admin.add(new Admin(r.getString("email"),r.getString("password")));
            }
            
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return admin;
    }
    public static ArrayList<Student> GetStudents(){
   
       ArrayList<Student> students =new ArrayList<>();
        try{
          
            PreparedStatement ps =MyConnection.connection().prepareStatement("select *  from student");
            ResultSet r = ps.executeQuery();
            while(r.next()){
                students.add(new Student(r.getString("firstName"),r.getString("secondName"),r.getString("phone"),r.getString("gender"),r.getString("email"),r.getString("password")));
            }
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return students;
   }
    public static ArrayList<Courses> GetCourses(){
        
       ArrayList<Courses> courses=new ArrayList<>();
        try{
          
            PreparedStatement ps = MyConnection.connection().prepareStatement("select *  from course");
            ResultSet r = ps.executeQuery();
            while(r.next()){
                courses.add(new Courses(r.getString("courseName"),r.getString("courseID"),r.getInt("noHoures")));
            }
            
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return courses;
   }
       public static ArrayList<Registration> getRegistration()
   {
       ArrayList<Registration> registerion =new ArrayList<>();
        try{
          
            PreparedStatement ps = MyConnection.connection().prepareStatement("select *  from registrationcourse");
            ResultSet r = ps.executeQuery();
            while(r.next()){
                registerion.add(new Registration(r.getString("email"),r.getString("courseID")));
            }
            
        }catch (SQLException exception){
            System.out.println(exception.getMessage());
        }
        return registerion ;
   }
       
          public static ArrayList<Links> GetLinks(String id){
        
        ArrayList<Links> links =new ArrayList<>();
        try{    
            String query = "SELECT * FROM `links` WHERE `courseID`LIKE '%"+id+"%'";
            PreparedStatement ps = MyConnection.connection().prepareStatement(query);
            ResultSet r = ps.executeQuery();
            while(r.next()){
                 links.add(new Links(r.getString("courseID"), r.getString("url"), r.getInt("linkNo")));
            }
        }catch (SQLException exception) {
            System.out.println(exception.getMessage());
        }
        return links;
    }
    
     
}
