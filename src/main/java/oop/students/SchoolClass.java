package oop.students;

import oop.building.ClassRoom;
import oop.enums.Employment;
import oop.enums.Grade;
import oop.enums.Occupation;
import oop.teacher.Teacher;

import java.util.List;
import java.util.UUID;

public class SchoolClass {

    private UUID id;

    private String designation;

    private List<Teacher> teachers;

    private Employment employment;

    private List<Student> students;

    private ClassRoom room;

    private Occupation occupation;

    private Grade grade;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public Employment getEmployment() {
        return employment;
    }

    public void setEmployment(Employment employment) {
        this.employment = employment;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public ClassRoom getRoom() {
        return room;
    }

    public void setRoom(ClassRoom room) {
        this.room = room;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
