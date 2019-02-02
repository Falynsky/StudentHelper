package Classbook;

public class Grade {

    double grade = 0;
    String forWhat = "";

    Grade(double grade, String forWhat) {
        setGrade(grade);
        setForWhat(forWhat);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 2) throw new IllegalArgumentException();
        else {
            this.grade = grade;
        }
    }

    public String getForWhat() {
        return forWhat;
    }

    public void setForWhat(String forWhat) {
        if (forWhat.isEmpty() || forWhat == null) throw new NullPointerException();
        else {
            this.forWhat = forWhat;
        }
    }
}
