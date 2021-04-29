package oop.ab9.farm;

import java.time.LocalDate;

public class Cow {

    private String name;

    private int weight;

    private LocalDate birthYear;

    private int hayAmount;

    private static final int HAY_AMOUNT_FOR_MILK = 5;

    private static final double AMOUNT_FOR_MILK = 7.5;

    public double returnMilk(final Cow cow) {
        if (cow.getHayAmount() == HAY_AMOUNT_FOR_MILK) {
            return AMOUNT_FOR_MILK;
        } else {
            return 0.0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 35 && weight <= 1000) {
            this.weight = weight;
        }
    }

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        final LocalDate today = LocalDate.now();
        if (!today.isAfter(birthYear)) {
            if (!birthYear.isBefore(today.minusYears(25L))) {
                this.birthYear = birthYear;
            }
        }
    }

    public int getHayAmount() {
        return hayAmount;
    }

    public void setHayAmount(int hayAmount) {
        this.hayAmount = hayAmount;
    }


    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", birthYear=" + birthYear +
                ", hayAmount=" + hayAmount +
                '}';
    }
}
