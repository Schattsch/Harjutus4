package com.karel.program;

public class Main {
    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int weight = 1;
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", weight);
            Suitcase suitcase = new Suitcase(1000); 
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            weight++;
    }
}
}