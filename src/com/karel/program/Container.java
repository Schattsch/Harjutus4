package com.karel.program;

import java.util.ArrayList;

public class Container {
    private final int maximumWeight;
    private final ArrayList<Suitcase> suitcases;

    public Container(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }

    public String toString() {
        int numSuitcases = suitcases.size();
        int totalWeight = totalWeight();
        return numSuitcases + " suitcase" + (numSuitcases != 1 ? "s" : "") + " (" + totalWeight + " kg)";
    }

    private int totalWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }
}
