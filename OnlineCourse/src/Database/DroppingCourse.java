
package Database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DroppingCourse {
    public static void drobCourse(String courseID,String email) throws SQLException{  
        try{    
        String query = "DELETE FROM `registrationcourse` WHERE (`courseID` = ? and email = ? )";
        PreparedStatement ps = MyConnection.connection().prepareStatement(query);

        ps.setString(1,courseID);
        ps.setString(2,email);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null,"course drop succesfully");

        }catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "course not drop", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
