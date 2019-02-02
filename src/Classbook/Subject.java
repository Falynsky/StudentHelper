package Classbook;

import java.util.HashMap;
import java.util.Map;

class Subject {

    private Map<String, Grade> grades = new HashMap<>();
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

    String getName() {
        return name;
    }

    void setName(String name) {
        if (name.isEmpty()) throw new NullPointerException();
        else {
            this.name = name;
        }
    }

    String getRoom() {
        return room;
    }

    void setRoom(String room) {
        if (room.isEmpty()) throw new NullPointerException();
        else {
            this.room = room;
        }
    }

    String getLecturer() {
        return lecturer;
    }

    void setLecturer(String lecturer) {
        if (lecturer.isEmpty()) throw new IllegalArgumentException();
        else {
            this.lecturer = lecturer;
        }
    }

    void getGrades() {
        for (Map.Entry<String, Grade> p : grades.entrySet()) {
            System.out.println("\tType of Classbook.Grade: " + p.getKey() + "\tClassbook.Grade: " + p.getValue().getGrade() + "\tFor What: " + p.getValue().getForWhat());
        }
    }

    void addGrade(double grade, String forWhat, String name) {
        Grade newGrade = new Grade(grade, forWhat);
        grades.put(name, newGrade);
    }
}
