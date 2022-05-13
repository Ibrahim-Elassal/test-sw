
package Database;

import javax.swing.JOptionPane;


public class CheckingTextField {
 
     public static String checkCourseTextField(String course_name,String courseId,String numberOfHours){
         String message=""; 
        if (course_name.isEmpty()== true||courseId.isEmpty()== true||numberOfHours.isEmpty()== true){
            if (course_name.isEmpty()==true){
                message="enter course name";
            }
            else if(courseId.isEmpty()==true){
                message="enter course id";
            }
            else if(numberOfHours.isEmpty()==true){
                message="enter number of hours";
            }
        }
        return message ;
    }
     
    public static String checkTextField(String id,String url,String numberOfHours){
        String message="";
        if(id.isEmpty()==true ||numberOfHours.isEmpty()==true|| url.isEmpty()==true){
            if (id.isEmpty()==true){
                message="enter course id";
            }
            else if(url.isEmpty()==true){
                message="enter the url";
            }
            else if(numberOfHours.isEmpty()==true){
                message="enter number of hours";
            }
        }
        return message;
    }
    
    public static String checkUserTextField(String firstName,String secondName,String email,String password,String phone,String gender){
        String message="";
        if(firstName.isEmpty()==true ||secondName.isEmpty()==true|| email.isEmpty()==true|| password.isEmpty()==true|| phone.isEmpty()==true|| gender.isEmpty()==true){
            if (firstName.isEmpty()==true){
                message="enter the First Name";
            }
            else if(secondName.isEmpty()==true){
                message="enter the Second Name";
            }
            else if(email.isEmpty()==true){
                message="enter the E_mail";
            }
            else if(password.isEmpty()==true){
                message="enter the password";
            }
            else if(phone.isEmpty()==true){
                message="enter the phone";
            }
            else if(gender.isEmpty()==true){
                message="enter the Gender";
            }
        }
        return message;
    }
    public static String CheckRegistrationTextField(String courseId){
    String message="";
    if(courseId.isEmpty()==true){
    message="enter the Course Id";
    }
    return message;
    }
}