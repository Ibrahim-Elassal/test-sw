/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Student;

import SignUp.LogIn;
/*import static Student.RegisterCourse.e_mail;
import static Student.ViewLinks.link_mail;
import static Student.ViewMyCourses.course_mail;
import static Student.ViewSolutions.solution_mail;
import static Student.ViewTasks.task_mail;*/

public class Student extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Student() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Student = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        RegisterLabel = new javax.swing.JLabel();
        TaskLabel = new javax.swing.JLabel();
        SolutionLabel = new javax.swing.JLabel();
        LinkLabel = new javax.swing.JLabel();
        IconLink = new javax.swing.JLabel();
        IconTask = new javax.swing.JLabel();
        IconSolution = new javax.swing.JLabel();
        IconRegister = new javax.swing.JLabel();
        sign_out1 = new javax.swing.JLabel();
        Iconcourse = new javax.swing.JLabel();
        MyCoursesLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        RegisterCourse1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        ViewTasks1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        ViewSolutions1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ViewLink1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        ViewMyCourse = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Student.setText("Hello Student");
        Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StudentMousePressed(evt);
            }
        });
        jPanel2.add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 71, 339, -1));

        jSeparator9.setBackground(new java.awt.Color(153, 153, 255));
        jSeparator9.setForeground(new java.awt.Color(153, 153, 255));
        jSeparator9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 136, 395, 12));

        RegisterLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegisterLabel.setText("Register Course");
        RegisterLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterLabelMousePressed(evt);
            }
        });
        jPanel2.add(RegisterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, 51));

        TaskLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TaskLabel.setText("View Tasks");
        TaskLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TaskLabelMousePressed(evt);
            }
        });
        jPanel2.add(TaskLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 115, 50));

        SolutionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SolutionLabel.setText("View  Solutions");
        SolutionLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SolutionLabelMousePressed(evt);
            }
        });
        jPanel2.add(SolutionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, 55));

        LinkLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LinkLabel.setText("View Video Links");
        LinkLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LinkLabelMousePressed(evt);
            }
        });
        jPanel2.add(LinkLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, 46));

        IconLink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconStudent/ViewLink.png"))); // NOI18N
        IconLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IconLinkMousePressed(evt);
            }
        });
        jPanel2.add(IconLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, 100));

        IconTask.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconStudent/ViewTask.png"))); // NOI18N
        IconTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IconTaskMousePressed(evt);
            }
        });
        jPanel2.add(IconTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, -1));

        IconSolution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconStudent/ViewSolution.png"))); // NOI18N
        IconSolution.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IconSolutionMousePressed(evt);
            }
        });
        jPanel2.add(IconSolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, 116));

        IconRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconStudent/RegisterCourses.png"))); // NOI18N
        IconRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IconRegisterMousePressed(evt);
            }
        });
        jPanel2.add(IconRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        sign_out1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconSignUp/icons8_logout_rounded_up_50px.png"))); // NOI18N
        sign_out1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sign_out1MousePressed(evt);
            }
        });
        jPanel2.add(sign_out1, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 28, -1, -1));

        Iconcourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconStudent/icons8_course_assign_100px.png"))); // NOI18N
        Iconcourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IconcourseMousePressed(evt);
            }
        });
        jPanel2.add(Iconcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 670, -1, 116));

        MyCoursesLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MyCoursesLabel.setText("View  My Courses");
        MyCoursesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MyCoursesLabelMousePressed(evt);
            }
        });
        jPanel2.add(MyCoursesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 790, -1, 55));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        RegisterCourse1.setBackground(new java.awt.Color(204, 204, 255));
        RegisterCourse1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterCourse1MousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Register Courses");

        javax.swing.GroupLayout RegisterCourse1Layout = new javax.swing.GroupLayout(RegisterCourse1);
        RegisterCourse1.setLayout(RegisterCourse1Layout);
        RegisterCourse1Layout.setHorizontalGroup(
            RegisterCourse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterCourse1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegisterCourse1Layout.setVerticalGroup(
            RegisterCourse1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        ViewTasks1.setBackground(new java.awt.Color(204, 204, 255));
        ViewTasks1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewTasks1MousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("View Tasks");

        javax.swing.GroupLayout ViewTasks1Layout = new javax.swing.GroupLayout(ViewTasks1);
        ViewTasks1.setLayout(ViewTasks1Layout);
        ViewTasks1Layout.setHorizontalGroup(
            ViewTasks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewTasks1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewTasks1Layout.setVerticalGroup(
            ViewTasks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        ViewSolutions1.setBackground(new java.awt.Color(204, 204, 255));
        ViewSolutions1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewSolutions1MousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("View Solutions");

        javax.swing.GroupLayout ViewSolutions1Layout = new javax.swing.GroupLayout(ViewSolutions1);
        ViewSolutions1.setLayout(ViewSolutions1Layout);
        ViewSolutions1Layout.setHorizontalGroup(
            ViewSolutions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewSolutions1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewSolutions1Layout.setVerticalGroup(
            ViewSolutions1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        ViewLink1.setBackground(new java.awt.Color(204, 204, 255));
        ViewLink1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewLink1MousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("View Video links ");

        javax.swing.GroupLayout ViewLink1Layout = new javax.swing.GroupLayout(ViewLink1);
        ViewLink1.setLayout(ViewLink1Layout);
        ViewLink1Layout.setHorizontalGroup(
            ViewLink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLink1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel10)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        ViewLink1Layout.setVerticalGroup(
            ViewLink1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        ViewMyCourse.setBackground(new java.awt.Color(204, 204, 255));
        ViewMyCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewMyCourseMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("View My Courses");

        javax.swing.GroupLayout ViewMyCourseLayout = new javax.swing.GroupLayout(ViewMyCourse);
        ViewMyCourse.setLayout(ViewMyCourseLayout);
        ViewMyCourseLayout.setHorizontalGroup(
            ViewMyCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewMyCourseLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ViewMyCourseLayout.setVerticalGroup(
            ViewMyCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterCourse1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewTasks1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewSolutions1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ViewLink1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addComponent(ViewMyCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RegisterCourse1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewTasks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewSolutions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewLink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewMyCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StudentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StudentMousePressed
        new Student().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StudentMousePressed

    private void RegisterLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterLabelMousePressed
       /* new RegisterCourse().setVisible(true);
        this.setVisible(false);
        e_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_RegisterLabelMousePressed

    private void IconTaskMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconTaskMousePressed
      /* new ViewTasks().setVisible(true);
       this.setVisible(false);
       task_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_IconTaskMousePressed

    private void SolutionLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SolutionLabelMousePressed
      /* new ViewSolutions().setVisible(true);
       this.setVisible(false);
        solution_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_SolutionLabelMousePressed

    private void IconLinkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconLinkMousePressed
       /*new ViewLinks().setVisible(true);
       this.setVisible(false);
       link_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_IconLinkMousePressed

    private void LinkLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkLabelMousePressed
       /*new ViewLinks().setVisible(true);
       this.setVisible(false);
       link_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_LinkLabelMousePressed

    private void TaskLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TaskLabelMousePressed
       /* new ViewTasks().setVisible(true);
        this.setVisible(false);
        task_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_TaskLabelMousePressed

    private void IconSolutionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconSolutionMousePressed
       /* new ViewSolutions().setVisible(true);
       this.setVisible(false);
       solution_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_IconSolutionMousePressed

    private void IconRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconRegisterMousePressed
        /*new RegisterCourse().setVisible(true);
        this.setVisible(false);
        e_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_IconRegisterMousePressed

    private void sign_out1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_out1MousePressed
        new LogIn().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_sign_out1MousePressed

    private void RegisterCourse1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterCourse1MousePressed
        /*new RegisterCourse().setVisible(true);
        this.setVisible(false);
        e_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_RegisterCourse1MousePressed

    private void ViewTasks1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewTasks1MousePressed
      /*  new ViewTasks().setVisible(true);
        this.setVisible(false);
        task_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_ViewTasks1MousePressed

    private void ViewSolutions1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewSolutions1MousePressed
        /*new ViewSolutions().setVisible(true);
        this.setVisible(false);
        solution_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_ViewSolutions1MousePressed

    private void ViewLink1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewLink1MousePressed
       /* new ViewLinks().setVisible(true);
        this.setVisible(false);
        link_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_ViewLink1MousePressed

    private void ViewMyCourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMyCourseMousePressed
       /* new ViewMyCourses().setVisible(true);
        this.setVisible(false);
        course_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_ViewMyCourseMousePressed

    private void IconcourseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconcourseMousePressed
      /* new ViewMyCourses().setVisible(true);
        this.setVisible(false);
        course_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_IconcourseMousePressed

    private void MyCoursesLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyCoursesLabelMousePressed
      /* new ViewMyCourses().setVisible(true);
        this.setVisible(false);
        course_mail.setText(LogIn.mail.getText());*/
    }//GEN-LAST:event_MyCoursesLabelMousePressed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconLink;
    private javax.swing.JLabel IconRegister;
    private javax.swing.JLabel IconSolution;
    private javax.swing.JLabel IconTask;
    private javax.swing.JLabel Iconcourse;
    private javax.swing.JLabel LinkLabel;
    private javax.swing.JLabel MyCoursesLabel;
    private javax.swing.JPanel RegisterCourse1;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JLabel SolutionLabel;
    private javax.swing.JLabel Student;
    private javax.swing.JLabel TaskLabel;
    private javax.swing.JPanel ViewLink1;
    private javax.swing.JPanel ViewMyCourse;
    private javax.swing.JPanel ViewSolutions1;
    private javax.swing.JPanel ViewTasks1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel sign_out1;
    // End of variables declaration//GEN-END:variables
}
