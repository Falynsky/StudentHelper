package Classbook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    Grade kolos1;
    @BeforeEach
    void setUp() {
        kolos1 = new Grade(5,"Konwersja");
    }
    @Test
    void getGrade() {
        assertEquals(5,kolos1.getGrade());
    }

    @Test
    void gradeNotNull() {
        assertNotNull(kolos1);
    }

    @Test
    void getForWhat() {
        assertEquals("Calki",kolos1.getForWhat());
    }
}