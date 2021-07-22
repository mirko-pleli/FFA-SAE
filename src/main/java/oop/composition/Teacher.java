package oop.composition;

import oop.building.OfficeRoom;

import java.util.UUID;

public class Teacher {

    private UUID id;

    private Person data;

    private String abbreviation;

    private String phone;

    private OfficeRoom officeRoom;

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(final String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    public OfficeRoom getOfficeRoom() {
        return officeRoom;
    }

    public void setOfficeRoom(final OfficeRoom officeRoom) {
        this.officeRoom = officeRoom;
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
