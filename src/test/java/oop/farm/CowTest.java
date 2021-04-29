package oop.farm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CowTest {

    @Test
    void validMilkAmount() {
        Cow cow = new Cow();
        cow.setWaterAmount(7.5);
        cow.setHayAmount(5);
        double expectedMilk = cow.returnMilk(cow);

        Assertions.assertEquals(7.5, expectedMilk);
    }

    @Test
    void noValidMilkAmount() {
        Cow cow = new Cow();
        cow.setWaterAmount(7);
        cow.setHayAmount(4);
        double expectedMilk = cow.returnMilk(cow);

        Assertions.assertEquals(0.0, expectedMilk);
    }

    @Test
    void validBirthday() {
        Cow cow = new Cow();
        LocalDate localDate = LocalDate.now().minusYears(5);
        boolean birthYear = cow.setBirthYear(localDate);

        Assertions.assertTrue(birthYear);
    }

    @Test
    void noValidBirthday() {
        Cow cow = new Cow();
        LocalDate localDate = LocalDate.now().minusYears(26);
        boolean birthYear = cow.setBirthYear(localDate);

        Assertions.assertFalse(birthYear);
    }
}