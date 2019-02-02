package Classbook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    private Subject wdi;
    @BeforeEach
    void setUp() {
        wdi = new Subject();
    }

    @Test
    void setName() {
        wdi.setName("WDI");
        assertEquals("WDI",wdi.getName());
    }

    @Test
    void setLecturer() {
        wdi.setLecturer("Boryczka");
        assertEquals("Boryczka",wdi.getLecturer());
    }

    @Test
    void setRoom() {
        wdi.setRoom("B202");
        assertEquals("B202",wdi.getRoom());
    }

    @Test
    void addGrades(){
        wdi.addGrade(4.0,"Konwersja","Kolos1");
    }
}