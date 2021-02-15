package ru.geekbrains.animals;

public class Cat extends Animal {

    @Override
    public boolean run(double run) {
        return (run > 0 && run <= 200);
    }

    @Override
    public boolean swim(double swim) {
        return false;
    }
}
