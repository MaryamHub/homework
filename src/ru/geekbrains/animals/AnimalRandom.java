package ru.geekbrains.animals;

import java.util.Random;

public class AnimalRandom extends Dog {

    private final double MAX_RUN;
    private final double MAX_SWIM;

    public AnimalRandom() {
        Random random = new Random();
        MAX_RUN = random.nextDouble() * (600.01 - 1.0) + 1.0; // 1 - 400
        MAX_SWIM = random.nextDouble() * (10.01 - 1.0) + 1.0; // 1 - 10
    }

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= MAX_RUN);
    }

    @Override
    public boolean swim(double swim) {
        return (swim > 0 && swim <= MAX_SWIM);
    }
}
