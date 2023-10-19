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
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase suitcase = new Suitcase(10);
        suitcase.addThing(book);
        suitcase.addThing(mobile);
        suitcase.addThing(brick);

        System.out.println("Your suitcase contains the following things:");
        suitcase.printThings();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

        Thing heaviest = suitcase.heaviestThing();
        System.out.println("The heaviest thing: " + heaviest);
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maximumWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Thing thing : things) {
            total += thing.getWeight();
        }
        return total;
    }

    public Thing heaviestThing() {
        if (things.isEmpty()) {
            return null;
        }

        Thing heaviest = things.get(0);
        for (Thing thing : things) {
            if (thing.getWeight() > heaviest.getWeight()) {
                heaviest = thing;
            }
        }

        return heaviest;
    }

    public String toString() {
        int numThings = things.size();
        int totalWeight = totalWeight();
        return numThings + " thing" + (numThings != 1 ? "s" : "") + " (" + totalWeight + " kg)";
    }
}
