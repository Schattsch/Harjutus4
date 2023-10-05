package com.karel.program;

import java.util.ArrayList;

public class Suitcase {
    private final ArrayList<Thing> things;
    private final int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.things = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public static void main(String[] args) {
        Thing book = new Thing("Happiness in three steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addThing(book);
        System.out.println(suitcase);

        suitcase.addThing(mobile);
        System.out.println(suitcase);

        suitcase.addThing(brick);
        System.out.println(suitcase);
    }

    public void addThing(Thing thing) {
        int totalWeight = totalWeight();
        if (totalWeight + thing.getWeight() <= maximumWeight) {
            things.add(thing);
        }
    }

    private int totalWeight() {
        int total = 0;
        for (Thing thing : things) {
            total += thing.getWeight();
        }
        return total;
    }

    public String toString() {
        int numThings = things.size();
        int totalWeight = totalWeight();
        return numThings + " thing" + (numThings != 1 ? "s" : "") + " (" + totalWeight + " kg)";
    }
}
