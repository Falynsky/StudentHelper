package Classbook;

import java.util.HashMap;
import java.util.Map;

class Classbook {

    private Map<String, Subject> subjects = new HashMap<>();

    void addSubject(String name, String lecturer, String room) {
        Subject subject = new Subject(name, lecturer, room);
        subjects.put(name, subject);
    }

    void addGrade(String SubjectName, double grade, String forWhat, String type) {
        subjects.get(SubjectName).addGrade(grade, forWhat, type);
    }

    void getGrades(String SubjectName) {
        System.out.println(SubjectName);
        subjects.get(SubjectName).getGrades();
    }

    void getAllGrades() {

        for (Map.Entry<String, Subject> p : subjects.entrySet()) {
            System.out.println(p.getKey());
            subjects.get(p.getKey()).getGrades();
        }
    }
}
