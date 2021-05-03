package oop.farm;

import java.time.LocalDate;

public class Cow {

    private String name;

    private int weight;

    private LocalDate birthYear;

    private int hayAmount;

    private double waterAmount;

    private static final int MINIMUM_HAY_AMOUNT = 5;

    private static final double MINIMUM_WATER_AMOUNT = 7.5;

    // HALF LITER MILK
    private static final double RATIO_FOR_MILK_AMOUNT = 25;

    public double returnMilk(final Cow cow) {
        if (isCowFedCorrectly(cow)) {
            return calculateMilkAmount(cow);
        }
        throw new IllegalArgumentException("The nutrition amount is for milk production too low.");
    }

    private static double calculateMilkAmount(final Cow cow) {
        final double FOOD_AMOUNT = cow.getWaterAmount() + cow.getHayAmount();
        final double MILK_AMOUNT = FOOD_AMOUNT / RATIO_FOR_MILK_AMOUNT;
        return MILK_AMOUNT;
    }

    private static boolean isCowFedCorrectly(final Cow cow) {
        if (cow.getWaterAmount() >= MINIMUM_WATER_AMOUNT) {
            if (cow.getHayAmount() >= MINIMUM_HAY_AMOUNT) {
                return true;
            }
        }
        return false;
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

    public boolean setBirthYear(LocalDate birthYear) {
        final LocalDate today = LocalDate.now();
        if (birthYear.isBefore(today.minusYears(25L))) {
            return false;
        }
        return true;
    }

    public int getHayAmount() {
        return hayAmount;
    }

    public void setHayAmount(int hayAmount) {
        this.hayAmount = hayAmount;
    }

    public double getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(double waterAmount) {
        this.waterAmount = waterAmount;
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
