
package Database;

import domain.Registration;
import java.util.ArrayList;
import java.util.List;

public class CheckingRegister {
     public static int checkRegister(String email,String CourseId)
    {
        ArrayList<Registration> User = GettingDatabase.getRegistration();
        ArrayList<String> allregistration = new ArrayList<>(); 
        
        int message=0;
        for (int search = 0; search < User.size(); search++) {
            if(User.get(search).getEmail().equals(email))
            {
                allregistration.add(User.get(search).getcourseId());
                message=3;
            }
            
        }
        if(message==3){
            for(int search =0;search<allregistration.size();search++){
                if(allregistration.size()>0){  
                    if(allregistration.get(search).equals(CourseId)){
                        message=1;//email correct,courseId correct
                        break;
                }}
                else{
                    message=2;//email correct,courseId Wonge
                    break;
                } 
    }}
       
        return message;
        
    }
   
    
}
