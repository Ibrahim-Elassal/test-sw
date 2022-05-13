
package domain;


public class Student extends Users{
    
    
     private String firstName,secondName, phone, gender;
     public Student( String firstName,String secondName,String phone,String gender,String Email, String password)
    {
        super(Email, password);
        this.firstName = firstName;
        this.secondName = secondName;
        this.gender = gender;
        this.phone = phone;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getGender() {
        return gender;
    }
    
    public String getPhone() {
        return phone;
    }
    
   
}
