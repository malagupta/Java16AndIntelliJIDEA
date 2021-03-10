package com.jetbrains.java16.sealedtypes;

import com.jetbrains.java16.sealedtypes.plants.*;

public class Gardner {
    int process(Plant plant) {
        if (plant instanceof Cucumber) {
            return harvestCucumber(plant);
        } else if (plant instanceof Climber) {
            return sowClimber(plant);
        } else if (plant instanceof Herb) {
            return sellHerb(plant);
        } else if (plant instanceof Shrub) {
            return pruneShrub(plant);
        } else {
            System.out.println("Unreachable CODE. Unknown Plant type");
            return 0;
        }
    }

    private int pruneShrub(Plant plant) {
        Shrub shrub = ((Shrub) plant);
        // Call methods that are specific to Shrub
        // to:do : to do more meaningful ops
        return 0;
    }
    private int sellHerb(Plant plant) {
        Herb herb = ((Herb) plant);
        // Call methods that are specific to Herb
        // to:do : to do more meaningful ops
        return 1;
    }
    private int sowClimber(Plant plant) {
        Climber climber = ((Climber) plant);
        // Call methods that are specific to Climber
        // to:do : to do more meaningful ops
        return 2;
    }
    private int harvestCucumber(Plant plant) {
        Cucumber cucumber = ((Cucumber) plant);
        // Call methods that are specific to Cucumber
        // to:do : to do more meaningful ops
        return 3;
    }

    // This code doesn't work in Java 16.
    // It would work in a future Java version after the addition of
    // type-test-pattern to the switch expressions
    int processInAFutureJavaVersion(Plant plant) {
/*
        switch (plant) {
            case Cucumber c -> c.cucumberHarvest();
            case Climber cl -> cl.climberSow();
            case Herb h -> h.herbSell();
            case Shrub s -> s.shrubPrune();
        }
*/
        return 0;
    }
}
