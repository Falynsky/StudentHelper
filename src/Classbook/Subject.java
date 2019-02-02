package Classbook;

import java.util.HashMap;
import java.util.Map;

public class Subject {

    Map<String, Grade> grades = new HashMap<>();
    private String name = "";
    private String lecturer = "";
    private String room = "";

    Subject() {
        setName("Classbook.Subject");
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
        if (name.isEmpty() || name == null) throw new NullPointerException();
        else {
            this.name = name;
        }
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        if (room.isEmpty() || room == null) throw new NullPointerException();
        else {
            this.room = room;
        }
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        if (lecturer.isEmpty() || lecturer == null) throw new IllegalArgumentException();
        else {
            this.lecturer = lecturer;
        }
    }

    public void getGrades() {
        for (Map.Entry<String, Grade> p : grades.entrySet()) {
            System.out.println("\tType of Classbook.Grade: " + p.getKey() + "\tClassbook.Grade: " + p.getValue().getGrade() + "\tFor What: " + p.getValue().getForWhat());
        }
    }

    public void addGrade(double grade, String forWhat, String name) {
        Grade newGrade = new Grade(grade, forWhat);
        grades.put(name, newGrade);
    }
}
