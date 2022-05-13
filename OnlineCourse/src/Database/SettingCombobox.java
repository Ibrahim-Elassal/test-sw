
package Database;
import domain.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;


public class SettingCombobox{
 
    public static void setCoursesComboBox(DefaultComboBoxModel comboBoxCoursID) {
         ArrayList<Courses> courses =GettingDatabase.GetCourses();
        Object[] row =new Object[3];
        for(int i=0;i<courses.size();i++){
            row[0] =courses.get(i).getCourse_Name();
            row[1] =courses.get(i).getCourse_Id();
            row[2] =courses.get(i).getNumber_of_hourse();
            comboBoxCoursID.addElement(row[1]);
        }
    }
}
 