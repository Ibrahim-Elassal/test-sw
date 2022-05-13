
package domain;

public class Registration {
    private final String Email ;
    private final String courseId;
     
     public Registration( String Email , String courseId)
    {
        this.Email = Email;
        this.courseId = courseId;
    }
    public String getEmail() {
        return Email;
    }
    public String getcourseId() {
        return courseId;
    }
   
}

