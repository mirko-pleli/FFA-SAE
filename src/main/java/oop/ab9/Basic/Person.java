package oop.ab9.Basic;

import java.time.LocalDate;
import java.util.UUID;

public class Person {

    private UUID id;

    private String firstName;

    private String lastName;

    private LocalDate birthday;

    public static boolean hasBirthday(final Person person) {
        final LocalDate today = LocalDate.now();

        final int personMonth = person.getBirthday().getMonthValue();
        final int personDay = person.getBirthday().getDayOfMonth();
        final int todayMonth = today.getMonthValue();
        final int todayDay = today.getDayOfMonth();

        if (isEquals(personMonth, personDay, todayMonth, todayDay)) {
            return true;
        }
        return false;
    }

    private static boolean isEquals(final int personMonth, final int personDay, final int todayMonth, final int todayDay) {
        return todayMonth == personMonth && todayDay == personDay;
    }

    public UUID getId() {
        return id;
    }

    public void setId(final UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(final LocalDate birthday) {
        this.birthday = birthday;
    }
}
