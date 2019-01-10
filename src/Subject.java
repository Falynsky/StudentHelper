import java.util.HashMap;

public class Subject {

    private String name = "";
    private String lecturer = "";
    private String room = "";
    HashMap <String, Grade> grades = new HashMap<>();

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(String room) {
        this.room = room;
    }


}
