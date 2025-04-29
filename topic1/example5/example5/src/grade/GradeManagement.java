package grade;

import java.util.ArrayList;

public class GradeManagement {
    private ArrayList<Double> gradeList;

    public GradeManagement() {
        this.gradeList = new ArrayList<>();
    }

    public void addGrade(Double grade) {
        this.gradeList.add(grade);
    }

    private void showGrade(Double grade) {
        System.out.println("Nota :  " + grade);
    }

    public void showGrades() {
        for (Double grade : this.gradeList) {
            this.showGrade(grade);
        }
    }

    public void showApprovedGrades() {
        for (Double grade : this.gradeList) {
            if (grade > 50) {
                this.showGrade(grade);
            }
        }
    }
}
