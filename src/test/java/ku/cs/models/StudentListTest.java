package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    @Test
    @DisplayName("ทดสอบ addNewStudent")
    void testAddNewStudent() {
        StudentList student = new StudentList();
        student.addNewStudent("6610450234","dheerawat");
        assertEquals("dheerawat",student.findStudentById("6610450234").getName());

    }

    @Test
    @DisplayName("ทดสอบ findId")
    void testFindId() {
        StudentList student = new StudentList();
        student.addNewStudent("6610450234","dheerawat");
        assertEquals("dheerawat",student.findStudentById("6610450234").getName());

    }

    @Test
    @DisplayName("ทดสอบ giveScoreToId")
    void testgiveScoreToId() {
        StudentList student = new StudentList();
        student.addNewStudent("6610450234","dheerawat");
        student.giveScoreToId("6610450234",80);
        assertEquals(80,student.findStudentById("6610450234").getScore());

    }

    @Test
    @DisplayName("ทดสอบ viewGradeOfId")
    void testviewGradeOfId() {
        StudentList student = new StudentList();
        student.addNewStudent("6610450234","dheerawat");
        student.giveScoreToId("6610450234",80);
        assertEquals("A",student.viewGradeOfId("6610450234"));

    }
}