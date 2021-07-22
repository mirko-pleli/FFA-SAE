package oop.composition;

import oop.students.SchoolClass;

import java.sql.Timestamp;
import java.util.UUID;

public class Student {

    private UUID id;

    private Person data;

    private SchoolClass schoolClass;

    private Timestamp created;

    private Timestamp updated;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(final SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
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

    public String getFirstName() {
        return data.getLastName();
    }

    public void setFirstName(final String firstName) {
        data.setFirstName(firstName);
    }

    public String getLastName() {
        return data.getLastName();
    }

    public void setLastName(final String lastName) {
        data.setLastName(lastName);
    }

    public String getEmail() {
        return data.getEmail();
    }

    public void setEmail(final String email) {
        data.setEmail(email);
    }

}
