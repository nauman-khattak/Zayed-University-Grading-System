package grading.system;

import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.WindowConstants;

public class Student extends JFrame {

    static Student student;//Student refernce
    Course course;//Course reference to update results on runtime if user changes input after execution
    ButtonGroup buttonGroup;//for grouping two radio buttons
    JButton btnCalculate, btnClear, btnExit;
    JLabel studentNameLabel, SGPALabel, sgpa, standingLabel, standing, rankLabel, rank, summary, summaryLine1, summaryLine2,
            summaryLine3, studentIDLabel, summaryLine4, semesterLabel, campusLabel, creditsCompletedLabel, coursesLabel,
            creditsLabel, gradesLabel, outputsLabel;
    JPanel jPanel1, jPanel2;
    JRadioButton jRadioButton1, jRadioButton2;
    JTextField studentName, course6, credit1, credit2, credit3, credit4, credit5, credit6, grade1, grade2, grade3, id, grade4,
            grade5, grade6, semester, creditsCompleted, course1, course2, course3, course4, course5;

    public Student() {
        initComponents();//initializing all components of JFrame
        setVisible(true);//If false then JFrame wont be visible
    }

    //in this method we initialized the whole GUI
    private void initComponents() {

        buttonGroup = new ButtonGroup();
        studentNameLabel = new JLabel();
        studentName = new JTextField();
        studentIDLabel = new JLabel();
        id = new JTextField();
        semesterLabel = new JLabel();
        semester = new JTextField();
        campusLabel = new JLabel();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        creditsCompletedLabel = new JLabel();
        creditsCompleted = new JTextField();
        coursesLabel = new JLabel();
        creditsLabel = new JLabel();
        gradesLabel = new JLabel();
        course1 = new JTextField();
        course2 = new JTextField();
        course3 = new JTextField();
        course4 = new JTextField();
        course5 = new JTextField();
        course6 = new JTextField();
        credit1 = new JTextField();
        credit2 = new JTextField();
        credit3 = new JTextField();
        credit4 = new JTextField();
        credit5 = new JTextField();
        credit6 = new JTextField();
        grade1 = new JTextField();
        grade2 = new JTextField();
        grade3 = new JTextField();
        grade4 = new JTextField();
        grade5 = new JTextField();
        grade6 = new JTextField();
        btnCalculate = new JButton();
        btnClear = new JButton();
        jPanel1 = new JPanel();
        outputsLabel = new JLabel();
        jPanel2 = new JPanel();
        SGPALabel = new JLabel();
        sgpa = new JLabel();
        standingLabel = new JLabel();
        standing = new JLabel();
        rankLabel = new JLabel();
        rank = new JLabel();
        summary = new JLabel();
        summaryLine1 = new JLabel();
        summaryLine2 = new JLabel();
        summaryLine3 = new JLabel();
        summaryLine4 = new JLabel();
        btnExit = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zayed University SGPA Calculator");

        studentNameLabel.setFont(new Font("Tahoma", 1, 14));
        studentNameLabel.setText("Student name:");

        studentName.setFont(new Font("Tahoma", 1, 14));
        studentName.setForeground(new Color(51, 102, 255));
        studentName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        studentIDLabel.setFont(new Font("Tahoma", 1, 14));
        studentIDLabel.setText("ID:");

        id.setFont(new Font("Tahoma", 1, 14));
        id.setForeground(new Color(51, 102, 255));
        id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        semesterLabel.setFont(new Font("Tahoma", 1, 14));
        semesterLabel.setText("Semester:");
        semesterLabel.setToolTipText("");

        semester.setFont(new Font("Tahoma", 1, 14));
        semester.setForeground(new Color(51, 102, 255));
        semester.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        campusLabel.setFont(new Font("Tahoma", 1, 14));
        campusLabel.setText("Campus:");

        jRadioButton1.setFont(new Font("Tahoma", 1, 14));
        jRadioButton1.setText("Abu Dhabi");
        
        //commenting out this because document doesn't stated anything about Radio buttons.
        //i.e document doesn't told us what to do when radio button is selected
        /*
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });*/

        jRadioButton2.setFont(new Font("Tahoma", 1, 14));
        jRadioButton2.setText("Dubai");
        
        //commenting out this because document doesn't stated anything about Radio buttons.
        //i.e document doesn't told us what to do when radio button is selected
        /*
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });*/

        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);

        creditsCompletedLabel.setFont(new Font("Tahoma", 1, 14));
        creditsCompletedLabel.setText("Credits Completed:");

        creditsCompleted.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        coursesLabel.setFont(new Font("Tahoma", 1, 14));
        coursesLabel.setForeground(new Color(51, 102, 255));
        coursesLabel.setText("Courses");

        creditsLabel.setFont(new Font("Tahoma", 1, 14));
        creditsLabel.setForeground(new Color(51, 102, 255));
        creditsLabel.setText("Credits");

        gradesLabel.setFont(new Font("Tahoma", 1, 14));
        gradesLabel.setForeground(new Color(51, 102, 255));
        gradesLabel.setText("Grades");

        course1.setFont(new Font("Tahoma", 1, 14));
        course1.setForeground(new Color(51, 102, 255));
        course1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        course1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                course1ActionPerformed(evt);
            }
        });

        course2.setFont(new Font("Tahoma", 1, 14));
        course2.setForeground(new Color(51, 102, 255));
        course2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        course2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                course2ActionPerformed(evt);
            }
        });

        course3.setFont(new Font("Tahoma", 1, 14));
        course3.setForeground(new Color(51, 102, 255));
        course3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        course3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                course3ActionPerformed(evt);
            }
        });

        course4.setFont(new Font("Tahoma", 1, 14));
        course4.setForeground(new Color(51, 102, 255));
        course4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        course4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                course4ActionPerformed(evt);
            }
        });

        course5.setFont(new Font("Tahoma", 1, 14));
        course5.setForeground(new Color(51, 102, 255));
        course5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        course5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                course5ActionPerformed(evt);
            }
        });

        course6.setFont(new Font("Tahoma", 1, 14));
        course6.setForeground(new Color(51, 102, 255));
        course6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        course6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                course6ActionPerformed(evt);
            }
        });

        credit1.setFont(new Font("Tahoma", 1, 14));
        credit1.setForeground(new Color(51, 102, 255));
        credit1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        credit2.setFont(new Font("Tahoma", 1, 14));
        credit2.setForeground(new Color(51, 102, 255));
        credit2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        credit3.setFont(new Font("Tahoma", 1, 14));
        credit3.setForeground(new Color(51, 102, 255));
        credit3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        credit4.setFont(new Font("Tahoma", 1, 14));
        credit4.setForeground(new Color(51, 102, 255));
        credit4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        credit5.setFont(new Font("Tahoma", 1, 14));
        credit5.setForeground(new Color(51, 102, 255));
        credit5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        credit6.setFont(new Font("Tahoma", 1, 14));
        credit6.setForeground(new Color(51, 102, 255));
        credit6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grade1.setFont(new Font("Tahoma", 1, 14));
        grade1.setForeground(new Color(51, 102, 255));
        grade1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grade2.setFont(new Font("Tahoma", 1, 14));
        grade2.setForeground(new Color(51, 102, 255));
        grade2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grade3.setFont(new Font("Tahoma", 1, 14));
        grade3.setForeground(new Color(51, 102, 255));
        grade3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grade4.setFont(new Font("Tahoma", 1, 14));
        grade4.setForeground(new Color(51, 102, 255));
        grade4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grade5.setFont(new Font("Tahoma", 1, 14));
        grade5.setForeground(new Color(51, 102, 255));
        grade5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        grade6.setFont(new Font("Tahoma", 1, 14));
        grade6.setForeground(new Color(51, 102, 255));
        grade6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCalculate.setFont(new Font("Tahoma", 1, 14));
        btnCalculate.setForeground(new Color(51, 102, 255));
        btnCalculate.setText("Calculate");
        btnCalculate.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnClear.setFont(new Font("Tahoma", 1, 14));
        btnClear.setForeground(new Color(51, 102, 255));
        btnClear.setText("Clear");
        btnClear.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new Color(220, 220, 220));

        outputsLabel.setFont(new Font("Tahoma", 1, 14));
        outputsLabel.setText("Outputs");

        jPanel2.setBackground(SystemColor.controlHighlight);
        jPanel2.setBorder(new javax.swing.border.LineBorder(new Color(153, 153, 153), 2, true));

        SGPALabel.setFont(new Font("Tahoma", 1, 14));
        SGPALabel.setText("SGPA:");

        sgpa.setFont(new Font("Tahoma", 0, 14));
        sgpa.setText("");

        standingLabel.setFont(new Font("Tahoma", 1, 14));
        standingLabel.setText("Standing:");

        standing.setFont(new Font("Tahoma", 0, 14));
        standing.setText("");

        rankLabel.setFont(new Font("Tahoma", 1, 14));
        rankLabel.setText("Rank:");

        rank.setFont(new Font("Tahoma", 0, 14));
        rank.setText("");

        summary.setFont(new Font("Tahoma", 1, 14));
        summary.setText("");

        summaryLine1.setFont(new Font("Tahoma", 0, 14));
        summaryLine1.setText("");

        summaryLine2.setFont(new Font("Tahoma", 0, 14));
        summaryLine2.setText("");

        summaryLine3.setFont(new Font("Tahoma", 0, 14));
        summaryLine3.setText("");

        summaryLine4.setFont(new Font("Tahoma", 0, 14));
        summaryLine4.setText("");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(SGPALabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(sgpa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(rankLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(rank, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(standingLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(standing, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(summaryLine1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(summaryLine2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(summaryLine3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(summary)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(summaryLine4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(SGPALabel)
                                        .addComponent(sgpa))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(standingLabel)
                                        .addComponent(standing))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rankLabel)
                                        .addComponent(rank))
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(summary)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(summaryLine1)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(summaryLine2)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(summaryLine3)
                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                .addComponent(summaryLine4)
                                .addContainerGap(61, Short.MAX_VALUE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(outputsLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(outputsLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        btnExit.setFont(new Font("Tahoma", 1, 14));
        btnExit.setForeground(new Color(51, 102, 255));
        btnExit.setText("Exit");
        btnExit.setBorder(new javax.swing.border.LineBorder(new Color(102, 102, 102), 3, true));
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(studentNameLabel)
                                                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(studentName, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(campusLabel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton1)
                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                .addComponent(jRadioButton2)))
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(88, 88, 88)
                                                                .addComponent(creditsCompletedLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(creditsCompleted, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(studentIDLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(278, 278, 278)
                                                                                .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(id, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                .addComponent(semesterLabel)
                                                                                                .addPreferredGap(ComponentPlacement.UNRELATED)
                                                                                                .addComponent(semester)))))
                                                                .addContainerGap())))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(course1, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                                                        .addComponent(course2)
                                                                        .addComponent(course3)
                                                                        .addComponent(course4)
                                                                        .addComponent(course5)
                                                                        .addComponent(course6))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(19, 19, 19)
                                                                .addComponent(coursesLabel)
                                                                .addGap(51, 51, 51)))
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(creditsLabel)
                                                        .addComponent(credit1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                                                        .addComponent(credit2)
                                                        .addComponent(credit3)
                                                        .addComponent(credit4)
                                                        .addComponent(credit5)
                                                        .addComponent(credit6))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(gradesLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(grade1)
                                                        .addComponent(grade2)
                                                        .addComponent(grade3)
                                                        .addComponent(grade4)
                                                        .addComponent(grade5)
                                                        .addComponent(grade6))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(studentNameLabel)
                                        .addComponent(studentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(studentIDLabel)
                                        .addComponent(id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(semesterLabel)
                                        .addComponent(semester, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(campusLabel)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton2)
                                        .addComponent(creditsCompletedLabel)
                                        .addComponent(creditsCompleted, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(coursesLabel)
                                                        .addComponent(creditsLabel)
                                                        .addComponent(gradesLabel))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(course1)
                                                        .addComponent(grade1, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(credit1))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(course2)
                                                        .addComponent(grade2, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(credit2))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(course3)
                                                        .addComponent(grade3, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(credit3))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(course4)
                                                        .addComponent(grade4, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(credit4))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(course5)
                                                        .addComponent(grade5, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(credit5))
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(course6)
                                                        .addComponent(grade6, GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                                        .addComponent(credit6)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCalculate, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }
    
//    private void jRadioButton1ActionPerformed(ActionEvent evt) {
//    }
    
//    private void jRadioButton2ActionPerformed(ActionEvent evt) {
//    }

    private void course1ActionPerformed(ActionEvent evt) {
    }

    private void course2ActionPerformed(ActionEvent evt) {
    }

    private void course3ActionPerformed(ActionEvent evt) {
    }

    private void course4ActionPerformed(ActionEvent evt) {
    }

    private void course5ActionPerformed(ActionEvent evt) {
    }

    private void course6ActionPerformed(ActionEvent evt) {
    }

    private void btnClearActionPerformed(ActionEvent evt) {
        studentName.setText("");
        id.setText("");
        semester.setText("");
        creditsCompleted.setText("");
        sgpa.setText("");
        standing.setText("");
        rank.setText("");
        summary.setText("");
        summaryLine1.setText("");
        summaryLine2.setText("");
        summaryLine3.setText("");
        summaryLine4.setText("");
        course1.setText("");
        course2.setText("");
        course3.setText("");
        course4.setText("");
        course5.setText("");
        course6.setText("");
        credit1.setText("");
        credit2.setText("");
        credit3.setText("");
        credit4.setText("");
        credit5.setText("");
        credit6.setText("");
        grade1.setText("");
        grade2.setText("");
        grade3.setText("");
        grade4.setText("");
        grade5.setText("");
        grade6.setText("");
    }

    private void btnCalculateActionPerformed(ActionEvent evt) {
        try {
            course = new Course(student);
            sgpa.setText(String.valueOf(course.calculateGPA()));
            standing.setText(course.getStanding());
            rank.setText(course.getRank());
            summary.setText("Summary:");
            summaryLine1.setText("Dear " + studentName.getText() + " " + id.getText() + ",");
            summaryLine2.setText("your semester GPA for " + semester.getText() + " is " + String.valueOf(course.calculateGPA()));
            summaryLine3.setText("Your Academic Standing is " + course.getStanding());
            summaryLine4.setText("and you are " + course.getRank());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Plz fill required fields with valid inputs", "Emplty fields or invalid inputs", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void btnExitActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    
    //main method
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(new JFrame(), "Nimbus Look and Feel not Found", "Look and Feel", JOptionPane.INFORMATION_MESSAGE);
        }

        student = new Student();
    }
}