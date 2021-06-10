package oop.students;

import oop.basic.Person;
import oop.enums.Grade;
import oop.grading.BehavioralNote;
import oop.grading.SchoolNote;
import oop.grading.Subject;

import java.sql.Timestamp;
import java.util.List;

public class Student extends Person {

    private SchoolClass schoolClass;

    private Company company;

    private String phoneNumber;

    private List<SchoolNote> notes;

    private List<BehavioralNote> behavioralNotes;

    private List<Subject> subjects;

    private Grade grade;

    private static String schoolUniform;

    private String parentalAuthority;

    private List<String> emergencyContacts;

    private Timestamp created;

    private Timestamp updated;

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(final SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(final Company company) {
        this.company = company;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<SchoolNote> getNotes() {
        return notes;
    }

    public void setNotes(final List<SchoolNote> notes) {
        this.notes = notes;
    }

    public List<BehavioralNote> getBehavioralNotes() {
        return behavioralNotes;
    }

    public void setBehavioralNotes(final List<BehavioralNote> behavioralNotes) {
        this.behavioralNotes = behavioralNotes;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(final Grade grade) {
        this.grade = grade;
    }

    public static String getSchoolUniform() {
        return schoolUniform;
    }

    public static void setSchoolUniform(String schoolUniform) {
        Student.schoolUniform = schoolUniform;
    }

    public String getParentalAuthority() {
        return parentalAuthority;
    }

    public void setParentalAuthority(final String parentalAuthority) {
        this.parentalAuthority = parentalAuthority;
    }

    public List<String> getEmergencyContacts() {
        return emergencyContacts;
    }

    public void setEmergencyContacts(final List<String> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(final Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(final Timestamp updated) {
        this.updated = updated;
    }
}
