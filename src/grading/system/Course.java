package grading.system;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Course {

    Student student;
    ArrayList<Integer> credits;
    ArrayList<String> grades;
    String[] possibleGrades;
    double[] pointsAgainstGrades;
    int creditsCompleted;
    double sgpa;
    DecimalFormat df;

    public Course(Student student) {
        this.student = student;
        credits = new ArrayList<>();
        grades = new ArrayList<>();
        possibleGrades = new String[]{"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F", "WF"};
        pointsAgainstGrades = new double[]{4, 4, 3.7, 3.3, 3, 2.7, 2.3, 2, 1.7, 1.3, 1, 0.7, 0, 0};
        creditsCompleted = Integer.valueOf(student.creditsCompleted.getText());
        df = new DecimalFormat("#.00");
        getCreditsAndGrades();
    }

    public void getCreditsAndGrades() {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 0:
                    credits.add(Integer.parseInt(student.credit1.getText()));
                    grades.add(student.grade1.getText());
                    break;
                case 1:
                    credits.add(Integer.parseInt(student.credit2.getText()));
                    grades.add(student.grade2.getText());
                    break;
                case 2:
                    credits.add(Integer.parseInt(student.credit3.getText()));
                    grades.add(student.grade3.getText());
                    break;
                case 3:
                    credits.add(Integer.parseInt(student.credit4.getText()));
                    grades.add(student.grade4.getText());
                    break;
                case 4:
                    credits.add(Integer.parseInt(student.credit5.getText()));
                    grades.add(student.grade5.getText());
                    break;
                case 5:
                    credits.add(Integer.parseInt(student.credit6.getText()));
                    grades.add(student.grade6.getText());
                    break;
            }
        }
    }

    public double calculateGPA() {
        double multiplicationPart = 0;  // ((P1 * U1) + (P2 * U2)+ (P3 *U3) + (P4*U4) + (P5*U5))
        int totalCreditUnits = 0;

        for (int i = 0; i < 6; i++) {
            multiplicationPart += (creditForParticularGrade(grades.get(i)) * credits.get(i));
            totalCreditUnits += credits.get(i);
        }
        sgpa = Double.valueOf(df.format(multiplicationPart / totalCreditUnits)); //Semester GPA = ((P1 * U1) + (P2 * U2)+ (P3 *U3) + (P4*U4) + (P5*U5)) / Total credit units 
        return sgpa;
    }

    //Grade Points Table provided in project requirement document
    public double creditForParticularGrade(String grade) {
        for (int j = 0; j < possibleGrades.length; j++) {
            if (grade.equals(possibleGrades[j])) {
                return pointsAgainstGrades[j];
            }
        }
        return 0;
    }

    public String getStanding() {
        if (sgpa >= 0 && sgpa <= 0.9) {
            return "Poor";
        } else if (sgpa >= 1 && sgpa < 1) {
            return "Satisfactory";
        } else if (sgpa >= 2 && sgpa < 3) {
            return "Good";
        } else if (sgpa >= 3 && sgpa <= 4) {
            return "Excellent";
        }
        return "";
    }

    public String getRank() {
        if (creditsCompleted >= 0 && creditsCompleted <= 30) {
            return "Freshman";
        } else if (creditsCompleted >= 31 && creditsCompleted <= 60) {
            return "Sophomore";
        } else if (creditsCompleted >= 61 && creditsCompleted < 90) {
            return "Junior";
        } else if (creditsCompleted >= 90) {
            return "Senior";
        }
        return "";
    }
}