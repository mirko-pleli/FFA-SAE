package oop.ab9.teacher;

import oop.ab9.basic.Person;
import oop.ab9.building.ClassRoom;
import oop.ab9.building.OfficeRoom;
import oop.ab9.enums.Deputate;
import oop.ab9.enums.Position;
import oop.ab9.enums.Skill;
import oop.ab9.grading.Subject;
import oop.ab9.students.SchoolClass;
import org.apache.commons.validator.routines.EmailValidator;

import java.util.List;

public class Teacher extends Person {

    private String email;

    private List<Subject> subjects;

    private ContactData contactData;

    private List<SchoolClass> classes;

    private List<Assignment> assignments;

    private OfficeRoom officeRoom;

    private ClassRoom roomAttendant;

    private Position position;

    private Deputate deputate;

    private List<Skill> skills;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        boolean isValid = EmailValidator.getInstance().isValid(email);
        if(isValid) {
            this.email = email;
        }
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public ContactData getContactData() {
        return contactData;
    }

    public void setContactData(final ContactData contactData) {
        this.contactData = contactData;
    }

    public List<SchoolClass> getClasses() {
        return classes;
    }

    public void setClasses(final List<SchoolClass> classes) {
        this.classes = classes;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(final List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public OfficeRoom getOfficeRoom() {
        return officeRoom;
    }

    public void setOfficeRoom(final OfficeRoom officeRoom) {
        this.officeRoom = officeRoom;
    }

    public ClassRoom getRoomAttendant() {
        return roomAttendant;
    }

    public void setRoomAttendant(final ClassRoom roomAttendant) {
        this.roomAttendant = roomAttendant;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(final Position position) {
        this.position = position;
    }

    public Deputate getDeputate() {
        return deputate;
    }

    public void setDeputate(final Deputate deputate) {
        this.deputate = deputate;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(final List<Skill> skills) {
        this.skills = skills;
    }
}
