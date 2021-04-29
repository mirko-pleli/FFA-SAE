package oop.ab9.farm;

import java.time.LocalDate;

public class Cow {

    private String name;

    private int weight;

    private LocalDate birthYear;

    private int hayAmount;

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
        if (today.isEqual(birthYear.minusYears(25L))) {
            this.birthYear = birthYear;
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
