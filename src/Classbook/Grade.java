package Classbook;

class Grade {

    private double grade = 0;
    private String forWhat = "";

    Grade(double grade, String forWhat) {
        setGrade(grade);
        setForWhat(forWhat);
    }

    double getGrade() {
        return grade;
    }

    private void setGrade(double grade) {
        if (grade < 2) throw new IllegalArgumentException();
        else {
            this.grade = grade;
        }
    }

    String getForWhat() {
        return forWhat;
    }

    private void setForWhat(String forWhat) {
        if (forWhat.isEmpty()) throw new NullPointerException();
        else {
            this.forWhat = forWhat;
        }
    }
}
