import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeTest {

    Grade grade;
    @BeforeEach
    void setUp() {
        grade = new Grade(5,"Calki");
    }
    @Test
    void getGrade() {
        assertEquals(5,grade.getGrade());
    }

    @Test
    void gradeNotNull() {
        assertNotNull(grade);
    }

    @Test
    void getForWhat() {
        assertEquals("Calki",grade.getForWhat());
    }
}