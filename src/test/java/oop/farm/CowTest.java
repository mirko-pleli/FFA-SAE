package oop.farm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class CowTest {

    @Test
    void returnHalfLiterMilk() {
        Cow cow = new Cow();
        cow.setWaterAmount(7.5);
        cow.setHayAmount(5);
        double expectedMilk = cow.returnProducedMilk(cow);

        Assertions.assertEquals(0.5, expectedMilk);
    }

    @Test
    void returnOneLiterMilk() {
        Cow cow = new Cow();
        cow.setWaterAmount(15);
        cow.setHayAmount(10);
        double expectedMilk = cow.returnProducedMilk(cow);

        Assertions.assertEquals(1.0, expectedMilk);
    }

    @Test
    void throwIllegalArgumentExceptionWhenNutritionIsTooLow() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    Cow cow = new Cow();
                    cow.setWaterAmount(7);
                    cow.setHayAmount(4);
                    cow.returnProducedMilk(cow);
                });
    }

    @Test
    void returnTrueWhenBirthdayWasFor25Years() {
        Cow cow = new Cow();
        LocalDate localDate = LocalDate.now().minusYears(5);
        boolean birthYear = cow.setBirthYear(localDate);

        Assertions.assertTrue(birthYear);
    }

    @Test
    void returnFalseWhenBirthdayWasFor26Years() {
        Cow cow = new Cow();
        LocalDate localDate = LocalDate.now().minusYears(26);
        boolean birthYear = cow.setBirthYear(localDate);

        Assertions.assertFalse(birthYear);
    }

    @Test
    void calv() {
        Cow motherCow = new Cow("Mama Kuh", 35, 2005);
        Cow babyCow = motherCow.calv(motherCow);

        Assertions.assertEquals(motherCow.getName(), babyCow.getMotherCow().getName());
    }
}
