package oop.farm;

import java.util.ArrayList;

public class CowHerd {

    private String name;

    private int amount;

    private ArrayList<Cow> cows;

    public CowHerd(String name, int amount) {
        this.name = name;
        this.amount = amount;
        create(amount);
    }

    public void add(Cow cow) {
        cows.add(cow);
    }

    public void delete(Cow cow) {
        cows.remove(cow);
    }

    public void feedSingleOne(Cow cow, int hay) {
        int index = cows.indexOf(cow);
        Cow heardCow = cows.get(index);
        heardCow.setHayAmount(hay);
    }

    public void feedAll(int hay) {
        for (Cow cow : cows) {
            cow.setHayAmount(hay);
        }
    }

    public void giveWaterSingleOne(Cow cow, Long water) {
        int index = cows.indexOf(cow);
        Cow heardCow = cows.get(index);
        heardCow.setWaterAmount(water);
    }

    public void giveAllWater(Long water) {
        for (Cow cow : cows) {
            cow.setWaterAmount(water);
        }
    }

    public Double milkSingleOne(Cow cow) {
        int index = cows.indexOf(cow);
        Cow heardCow = cows.get(index);
        return heardCow.returnProducedMilk(cow);
    }

    public Double milkAll() {
        double producedMilk = 0;
        for (Cow cow : cows) {
            producedMilk =+ cow.returnProducedMilk(cow);
        }
        return producedMilk;
    }

    public void getStatus() {
        for (Cow cow : cows) {
            System.out.println(cow.toString());
        }
    }

    public ArrayList<Cow> getCows() {
        return cows;
    }

    private void create(int amount) {
        cows = new ArrayList<>(amount);
    }
}
