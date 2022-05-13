
package Database;

import domain.Users;
import java.util.ArrayList;


public class CheckingUser {
    public static int checkUser(String email,String password)
    {
        ArrayList<Users> Students = GettingDatabase.getStudent();
        ArrayList<Users> Admins = GettingDatabase.getAdmin();
        int message=0;
        for (int search = 0; search < Students.size(); search++) {
            if(Students.get(search).getEmail().equals(email))
            {
                if(Students.get(search).getPassword().equals(password)){   
                    message=1;//email correct,password correct,usertype correct
                        break;
                }
                else{
                    message=3;//email correct,password Wonge
                    break;
                } 
            }
            else{
                message=0;
            }
        }
        if(message==0){
             for (int search = 0; search < Admins.size(); search++) {
                if(Admins.get(search).getEmail().equals(email))
                {
                    if(Admins.get(search).getPassword().equals(password)){   
                        message=2;//email correct,password correct,usertype correct
                            break;
                    }
                    else{
                        message=3;//email correct,password Wronge
                        break;
                    } 
                }
                else{
                    message=0;
                }
            }
        }
        return message;
        
    }
}
