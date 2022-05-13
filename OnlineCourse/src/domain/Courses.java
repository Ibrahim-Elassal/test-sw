
package domain;


public class Courses {
    private final String Name ;
    private final String Id ;
    private final int number_of_hourse ;


     public Courses( String Name , String Id, int number_of_hourse )
    {
        this.Name = Name;
        this.Id = Id;
        this.number_of_hourse = number_of_hourse;
    }
    public String getCourse_Name() {
        return Name;
    }
    public String getCourse_Id() {
        return Id;
    }
    public int getNumber_of_hourse() {
        return number_of_hourse;
    }
}