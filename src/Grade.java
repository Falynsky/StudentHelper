public class Grade{

    double grade = 0;
    String forWhat = "";

    Grade(double grade, String forWhat) {
        setForWhat(forWhat);
        setGrade(grade);
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getForWhat() {
        return forWhat;
    }

    public void setForWhat(String forWhat) {
        this.forWhat = forWhat;
    }
}
