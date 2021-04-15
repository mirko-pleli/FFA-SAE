package oop.ab9.students;

import oop.ab9.Basic.Person;
import oop.ab9.enums.Grade;
import oop.ab9.grading.BehavioralNote;
import oop.ab9.grading.SchoolNote;
import oop.ab9.grading.Subject;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Student extends Person {

    private UUID id;

    private String firstName;

    private String lastName;

    private SchoolClass schoolClass;

    private Company company;

    private String email;

    private String phoneNumber;

    private List<SchoolNote> notes;

    private List<BehavioralNote> behavioralNotes;

    private List<Subject> subjects;

    private Grade grade;

    private LocalDate birthday;

    private String parentalAuthority;

    private List<String> emergencyContacts;

    private Timestamp created;

    private Timestamp updated;

    private boolean isEquals(int teachersMonth, int teachersDay, int todayMonth, int todayDay) {
        return todayMonth == teachersMonth && todayDay == teachersDay;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<SchoolNote> getNotes() {
        return notes;
    }

    public void setNotes(List<SchoolNote> notes) {
        this.notes = notes;
    }

    public List<BehavioralNote> getBehavioralNotes() {
        return behavioralNotes;
    }

    public void setBehavioralNotes(List<BehavioralNote> behavioralNotes) {
        this.behavioralNotes = behavioralNotes;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getParentalAuthority() {
        return parentalAuthority;
    }

    public void setParentalAuthority(String parentalAuthority) {
        this.parentalAuthority = parentalAuthority;
    }

    public List<String> getEmergencyContacts() {
        return emergencyContacts;
    }

    public void setEmergencyContacts(List<String> emergencyContacts) {
        this.emergencyContacts = emergencyContacts;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }
}
