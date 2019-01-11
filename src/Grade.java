public class Grade extends Subject{

    double grade = 0;
    String forWhat ="";

    Grade(double grade, String forWhat){
        setForWhat(forWhat);
        setGrade(grade);
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setForWhat(String forWhat) {
        this.forWhat = forWhat;
    }

    public double getGrade() {
        return grade;
    }

    public String getForWhat() {
        return forWhat;
    }
}
