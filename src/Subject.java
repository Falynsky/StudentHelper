import java.util.HashMap;
import java.util.Map;

public class Subject extends Classbook {

    Map<String, Grade> grades = new HashMap<>();
    private String name = "";
    private String lecturer = "";
    private String room = "";

    Subject() {
        setName("Subject");
        setRoom("RoomNumber");
        setLecturer("Lecturer");
    }

    Subject(String name, String lecturer, String room) {
        setLecturer(lecturer);
        setRoom(room);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public void getGrades() {
        for (Map.Entry<String, Grade> p : grades.entrySet()) {
            System.out.println("\tType of Grade: " + p.getKey() + "\tGrade: " + p.getValue().getGrade() + "\tFor What: " + p.getValue().getForWhat());
        }
    }

    public void addGrade(double grade, String forWhat, String name) {
        Grade newGrade = new Grade(grade, forWhat);
        grades.put(name, newGrade);
    }
}
