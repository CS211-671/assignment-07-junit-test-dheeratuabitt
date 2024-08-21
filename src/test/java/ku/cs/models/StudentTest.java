package ku.cs.models;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StudentTest {
    @Test
    void testAddScore() {
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());

    }

    @Test
    void testCalculateGrade() {
        Student s = new Student("6xxxxxxxxx", "StudentTest");
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("ทดสอบการเปลี่ยนชื่อ")
    void testChangeName() {
        Student s = new Student("6xxxxxxxx", "StudentTest");
        s.changeName("dheerawat");
        assertEquals("dheerawat", s.getName());

    }

    @Test
    @DisplayName("ทดสอบGetter")
    void testGetter() {
        Student s = new Student("6610450234", "dheerawat",85);
        assertEquals("dheerawat", s.getName());
        assertEquals("6610450234", s.getId());

    }

    @Test
    @DisplayName("ทดสอบGrade")
    void testGrade() {
        Student s = new Student("6610450234", "dheerawat",85);
        assertEquals("A", s.grade());

    }
}

