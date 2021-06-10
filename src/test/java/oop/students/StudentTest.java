package oop.students;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void playground() {
        Student.setSchoolUniform("Rock");
        System.out.println(Student.getSchoolUniform());
    }

}
