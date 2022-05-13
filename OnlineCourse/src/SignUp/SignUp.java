
package SignUp;

import Database.*;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        jPanel2.setFocusable(true);
        TextFeildBackground();
        
    }
    
    
    private void TextFeildBackground(){
        FirstName.setBackground(new Color(0,0,0,1));
        SecondName.setBackground(new Color(0,0,0,1));
        mail.setBackground(new Color(0,0,0,1));
        password.setBackground(new Color(0,0,0,1));
        ConfirmPassword.setBackground(new Color(0,0,0,1));
        PhoneNumber.setBackground(new Color(0,0,0,1));
        signUp.setBackground(new Color(0,0,0,1));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        SecondName = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        mail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        jSeparator9 = new javax.swing.JSeparator();
        PhoneNumber = new javax.swing.JTextField();
        signUp = new javax.swing.JPanel();
        SignUp = new javax.swing.JLabel();
        ConfirmPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        SignUp1 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 700));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconSignUp/icons8_user_120px_1.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        FirstName.setBackground(new java.awt.Color(204, 204, 204));
        FirstName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(255, 255, 255));
        FirstName.setText("First Name");
        FirstName.setBorder(null);
        FirstName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        FirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstNameFocusGained(evt);
            }
        });
        FirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstNameMouseClicked(evt);
            }
        });
        jPanel2.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 304, 43));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 253, 304, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 319, 304, 10));

        SecondName.setBackground(new java.awt.Color(204, 204, 204));
        SecondName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SecondName.setForeground(new java.awt.Color(255, 255, 255));
        SecondName.setText("Second Name");
        SecondName.setBorder(null);
        SecondName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        SecondName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                SecondNameFocusGained(evt);
            }
        });
        jPanel2.add(SecondName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 276, 304, 43));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 385, 304, 10));

        mail.setBackground(new java.awt.Color(204, 204, 204));
        mail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mail.setForeground(new java.awt.Color(255, 255, 255));
        mail.setText("e-mail");
        mail.setBorder(null);
        mail.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        mail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailFocusGained(evt);
            }
        });
        jPanel2.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 342, 270, 43));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconSignUp/icons8_envelope_20px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 20, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconSignUp/icons8_privacy_20px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 20, 40));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 521, 304, 10));

        Male.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        Male.setBorder(null);
        Male.setIconTextGap(6);
        jPanel2.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 617, 70, -1));

        Female.setBackground(new java.awt.Color(204, 204, 204));
        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        Female.setBorder(null);
        Female.setIconTextGap(6);
        jPanel2.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 90, -1));

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 587, 304, 10));

        PhoneNumber.setBackground(new java.awt.Color(204, 204, 204));
        PhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        PhoneNumber.setText("Phone Number");
        PhoneNumber.setBorder(null);
        PhoneNumber.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        PhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PhoneNumberFocusGained(evt);
            }
        });
        jPanel2.add(PhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 544, 304, 43));

        signUp.setBackground(new java.awt.Color(204, 204, 204));
        signUp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                signUpMousePressed(evt);
            }
        });

        SignUp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("Sign Up");

        javax.swing.GroupLayout signUpLayout = new javax.swing.GroupLayout(signUp);
        signUp.setLayout(signUpLayout);
        signUpLayout.setHorizontalGroup(
            signUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(SignUp)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        signUpLayout.setVerticalGroup(
            signUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel2.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 300, -1));

        ConfirmPassword.setBackground(new java.awt.Color(204, 204, 204));
        ConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ConfirmPassword.setBorder(null);
        jPanel2.add(ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 300, 40));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setBorder(null);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 412, 270, 40));

        SignUp1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        SignUp1.setForeground(new java.awt.Color(255, 255, 255));
        SignUp1.setText("have an account !");
        SignUp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SignUp1MousePressed(evt);
            }
        });
        jPanel2.add(SignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 740, 130, -1));

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 455, 304, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconSignUp/SignUpBackground.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(102, 0, 102)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconSignUp/EducationBackground.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void FirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstNameFocusGained
        if (FirstName.getText().equals("First Name")){
            FirstName.setText("");
        }
    }//GEN-LAST:event_FirstNameFocusGained

    private void FirstNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameMouseClicked
        // TODO add your handling code here:
        FirstName.setText("");
    }//GEN-LAST:event_FirstNameMouseClicked

    private void SecondNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SecondNameFocusGained
        if (SecondName.getText().equals("Second Name")){
            SecondName.setText("");
        }
    }//GEN-LAST:event_SecondNameFocusGained

    private void mailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFocusGained
        if (mail.getText().equals("e-mail")){
            mail.setText("");
        }
    }//GEN-LAST:event_mailFocusGained

    private void PhoneNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PhoneNumberFocusGained
        if (PhoneNumber.getText().equals("Phone Number")){
            PhoneNumber.setText("");
        }
    }//GEN-LAST:event_PhoneNumberFocusGained

    private void signUpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMousePressed
         
        String userFirstName = FirstName.getText();
        String userSecondName = SecondName.getText();
        String userEmail = mail.getText();
        String userPassword = String.valueOf(password.getPassword());
        String repeatPassword = String.valueOf(ConfirmPassword.getPassword());
        String userPhone = PhoneNumber.getText();
        String userGender = null;
        if (Female.isSelected()){
            userGender = "Female";
        }
        else if(Male.isSelected()){
            userGender = "Male";
        }
        if((Female.isSelected() || Male.isSelected()) && (userFirstName.trim().isEmpty() || userSecondName.trim().isEmpty() || userEmail.trim().isEmpty() || userPhone.trim().isEmpty() || userPassword.trim().isEmpty())){
            JOptionPane.showMessageDialog(null,"Enter Data correctly");
       }   
       
         else if (userPassword.equals(repeatPassword)){
                try {
                   SettingDatabase.insertUsers(userFirstName,userSecondName,userEmail,userPassword,userPhone,userGender);
                  new LogIn().setVisible(true);
                this.setVisible(false);
               } catch (SQLException ex) {
                   System.out.println(ex.getMessage());
               }
           }
         else{
            JOptionPane.showMessageDialog(null,"Password not Matching");
           }
    }//GEN-LAST:event_signUpMousePressed

    private void SignUp1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp1MousePressed
       /* new LogIn().setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_SignUp1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField FirstName;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JTextField SecondName;
    private javax.swing.JLabel SignUp;
    private javax.swing.JLabel SignUp1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel signUp;
    // End of variables declaration//GEN-END:variables
}
