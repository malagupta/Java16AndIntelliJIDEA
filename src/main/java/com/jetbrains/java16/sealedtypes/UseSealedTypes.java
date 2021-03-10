package com.jetbrains.java16.sealedtypes;

import com.jetbrains.java16.sealedtypes.plants.Plant;

public class UseSealedTypes {

/*    int processType(Plant plant) {
        if (plant instanceof Cucumber) {
            return cucumberHarvest();
        } else if (plant instanceof Climber) {
            return climberSow();
        } else if (plant instanceof Herb) {
            return herbSell();
        } else if (plant instanceof Shrub) {
            return shrubPrune();
        } else {
            System.out.println("Control should not reach here!");
            return 0;
        }
    }*/

    private int cucumberHarvest() {
        // some random
        // code
        int a = 19;
        System.out.println(a + a);
        return 100;
    }
    private int climberSow() {
        // some random
        // code
        int a = 19;
        System.out.println(a + a);
        return 100;
    }
    private int herbSell() {
        // some random
        // code
        int a = 19;
        System.out.println(a + a);
        return 100;
    }
    private int shrubPrune() {
        // some random
        // code
        int a = 19;
        System.out.println(a + a);
        return 100;
    }

    void processTypeInFuture(Plant plant) {
/*
        switch (plant) {
            case Cucumber -> cucumberHarvest();
            case Climber -> climberSow();
            case Herb -> herbSell();
            case Shrub -> shrubPrune();
        }
*/
    }
}
